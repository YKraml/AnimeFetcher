package util;

import exceptions.CouldNotReachJikanException;
import exceptions.MyException;

public interface ApiCaller {

  String getDataFromJikan(String url) throws MyException;
}
