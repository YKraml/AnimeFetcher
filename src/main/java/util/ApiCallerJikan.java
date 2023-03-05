package util;

import exceptions.CouldNotReachJikanException;
import exceptions.MyException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApiCallerJikan implements ApiCaller {

  private static final int STANDARD_RETRIES = 3;
  private static final long WAIT_TIME = 1000;
  private static long lastFetchTime = System.currentTimeMillis();

  @Override
  public String getDataFromJikan(String url) throws MyException {
    return this.getDataFromJikan(url, STANDARD_RETRIES);
  }

  private synchronized String getDataFromJikan(String urlString, int retries) throws MyException {

    waitForSemaphore();

    while (urlString.charAt(urlString.length() - 1) == '/') {
      urlString = urlString.substring(0, urlString.length() - 1);
    }

    Request request = new Request.Builder().url(urlString).build();
    try (Response response = new OkHttpClient().newCall(request).execute()) {
      return response.body().string();
    } catch (IOException ex) {
      if (retries > 0) {
        return getDataFromJikan(urlString, retries - 1);
      }
      throw new CouldNotReachJikanException(ex, urlString);
    }

  }

  private synchronized void waitForSemaphore() {

    long currentTime = System.currentTimeMillis();
    long timeDelta = currentTime - lastFetchTime;
    long newWaitTime = WAIT_TIME - timeDelta;
    if (newWaitTime > 0) {
      try {
        TimeUnit.MILLISECONDS.sleep(newWaitTime);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    lastFetchTime = System.currentTimeMillis();
  }
}
