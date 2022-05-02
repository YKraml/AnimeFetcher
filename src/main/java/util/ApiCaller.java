package util;

import exceptions.CouldNotReachJikanException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

public class ApiCaller {

    private static final int STANDARD_RETRIES = 3;
    private static final long WAIT_TIME = 2000;
    private static final long TIMEOUT_WAIT = 3;
    private static long lastFetchTime = 0;
    private static ApiCaller instance;

    public static ApiCaller getInstance() {
        if (instance == null) {
            instance = new ApiCaller();
        }
        return instance;
    }

    private ApiCaller() {

    }

    public synchronized String getDataFromJikan(String urlString, int retries) throws CouldNotReachJikanException {

        long currentTime = System.currentTimeMillis();
        long timeDelta = currentTime - lastFetchTime;

        if (timeDelta < WAIT_TIME) {
            try {
                Thread.sleep(WAIT_TIME - timeDelta);
            } catch (InterruptedException ex) {
                throw new CouldNotReachJikanException(ex, urlString);
            }
        }

        String content = "";

        OkHttpClient client = new OkHttpClient().newBuilder().connectTimeout(TIMEOUT_WAIT, TimeUnit.SECONDS).build();
        Request request = new Request.Builder().url(urlString).build();
        try {
            Response response = client.newCall(request).execute();
            content = response.body().string();
        } catch (SocketTimeoutException e) {

            if (retries > 0) {
                try {
                    Thread.sleep(WAIT_TIME);
                } catch (InterruptedException ex) {
                    throw new CouldNotReachJikanException(ex, urlString);
                }
                return getDataFromJikan(urlString, --retries);
            }
        } catch (IOException ex) {
            throw new CouldNotReachJikanException(ex, urlString);
        }

        return content;
    }

    public String getDataFromJikan(String url) throws CouldNotReachJikanException {
        return this.getDataFromJikan(url, STANDARD_RETRIES);
    }
}
