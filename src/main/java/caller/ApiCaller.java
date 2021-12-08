package caller;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

public class ApiCaller {

    private static final int STANDARD_RETRIES = 3;
    private static final long SLEEP_TIME = 1000;
    private static final long TIMEOUT_WAIT = 2000;
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

        String content = "";

        OkHttpClient client = new OkHttpClient().newBuilder().connectTimeout(TIMEOUT_WAIT, TimeUnit.MILLISECONDS).build();
        Request request = new Request.Builder().url(urlString).build();
        try {
            Response response = client.newCall(request).execute();
            content = response.body().string();
        } catch (SocketTimeoutException e) {
            if (retries > 0) {
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException ex) {
                    e.printStackTrace();
                }
                return getDataFromJikan(urlString, --retries);
            }
        } catch (IOException ex) {
            throw new CouldNotReachJikanException(urlString);
        }

        return content;
    }

    public String getDataFromJikan(String url) throws CouldNotReachJikanException {
        return this.getDataFromJikan(url, STANDARD_RETRIES);
    }
}
