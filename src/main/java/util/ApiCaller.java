package util;

import exceptions.CouldNotReachJikanException;

public interface ApiCaller {

  String getDataFromJikan(String url) throws CouldNotReachJikanException;
}
