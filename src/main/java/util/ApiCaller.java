package util;

import exceptions.CouldNotReachJikanException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApiCaller {

    private static final int STANDARD_RETRIES = 3;
    private static final long WAIT_TIME = 2500;
    private static final long TIMEOUT_WAIT = 3;
    private static long lastFetchTime = System.currentTimeMillis();
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

        waitForSemaphore();

        String content = "";

        OkHttpClient client = new OkHttpClient().newBuilder().connectTimeout(TIMEOUT_WAIT, TimeUnit.SECONDS).build();
        Request request = new Request.Builder().url(urlString).build();
        try {
            Response response = client.newCall(request).execute();
            content = response.body().string();
        } catch (IOException ex) {
            throw new CouldNotReachJikanException(ex, urlString);
        }

        return content;
    }

    private synchronized void waitForSemaphore() {

        long currentTime = System.currentTimeMillis();
        long timeDelta = currentTime - lastFetchTime;
        long newWaitTime = WAIT_TIME - timeDelta;
        System.out.println(newWaitTime);
        if (newWaitTime > 0) {
            try {
                TimeUnit.MILLISECONDS.sleep(newWaitTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lastFetchTime = System.currentTimeMillis();
    }

    public String getDataFromJikan(String url) throws CouldNotReachJikanException {
        return this.getDataFromJikan(url, STANDARD_RETRIES);
    }
}
