package util;

import exceptions.CouldNotReadFileException;
import exceptions.MyException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public class ApiCallerCashedPersistent implements ApiCaller {

  private static final int SECOND = 1000;
  private static final int MINUTE = SECOND * 60;
  private static final int HOUR = MINUTE * 60;
  private static final int DAY = HOUR * 24;
  private static final int WEEK = DAY * 7;
  private static final String FOLDER_NAME = "cachedData";
  private static final String[] FORBIDDEN_CHARS = new String[]{":", "/", "?", "=", "."};

  private final ApiCaller apiCaller;

  public ApiCallerCashedPersistent() {
    this.apiCaller = new ApiCallerJikan();
  }

  @Override
  public String getDataFromJikan(String url) throws MyException {

    Optional<String> cachedData = checkCache(url);
    if (cachedData.isPresent()) {
      return cachedData.get();
    }

    String dataFromJikan = apiCaller.getDataFromJikan(url);
    writeIntoCache(url, dataFromJikan);
    return dataFromJikan;
  }

  private Optional<String> checkCache(String url) throws CouldNotReadFileException {

    String filePath = getFilePath(url);

    File f = new File(filePath);
    if (f.exists() && !f.isDirectory()) {
      try {
        long creationTime = Files
            .readAttributes(Path.of(filePath), BasicFileAttributes.class)
            .creationTime()
            .toMillis();
        long currentTime = System.currentTimeMillis();

        if (Math.abs(currentTime - creationTime) > WEEK) {
          f.delete();
          return Optional.empty();
        }

        String readData = Files.readString(Path.of(filePath));

        if (readData.contains("error")) {
          f.delete();
          return Optional.empty();
        }

        return Optional.ofNullable(readData);
      } catch (IOException e) {
        throw new CouldNotReadFileException(e, filePath);
      }
    }

    return Optional.empty();
  }

  private static void writeIntoCache(String url, String dataFromJikan) {

    if(dataFromJikan.contains("\"error\"")){
      return;
    }

    new File(FOLDER_NAME).mkdir();
    String fileName = getFilePath(url);

    Path file = Paths.get(fileName);
    try {
      Files.writeString(file, dataFromJikan);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @NotNull
  private static String getFilePath(String url) {
    String fileName = url;
    for (String forbiddenChar : FORBIDDEN_CHARS) {
      fileName = fileName.replace(forbiddenChar, "");
    }
    fileName += ".txt";
    return FOLDER_NAME + File.separator + fileName;
  }
}
