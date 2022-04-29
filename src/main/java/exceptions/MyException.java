package exceptions;

public abstract class MyException extends Exception{

    protected final Exception innerException;

    public MyException(Exception innerException){
        this.innerException = innerException;
    }

    public Exception getInnerException() {
        return innerException;
    }

    @Override
    public String getMessage(){

        StringBuilder longMessage = new StringBuilder();

        Exception exception = this;
        while (exception instanceof MyException){
            longMessage.append(((MyException)exception).getPrivateMessage()).append("\n");
            exception = ((MyException) exception).innerException;
        }

        longMessage.append(exception.getMessage()).append("\n");

        return longMessage.toString();
    }

    protected abstract String getPrivateMessage();

    @Override
    public void printStackTrace() {
        //innerException.printStackTrace();
        super.printStackTrace();
    }
}
