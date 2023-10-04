package exceptions;

public class CouldNotReadFileException extends MyException {

  private final String filePath;

  public CouldNotReadFileException(Exception e, String filePath) {
    super(e);
    this.filePath = filePath;
  }

  @Override
  protected String getPrivateMessage() {
    return String.format("Could not read cashed File '%s'.", filePath)
  }
}
