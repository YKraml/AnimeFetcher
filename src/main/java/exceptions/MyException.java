package exceptions;

import java.util.Arrays;

public abstract class MyException extends Exception {

    protected final Exception innerException;

    public MyException(Exception innerException) {
        this.innerException = innerException;
    }

    @Override
    public String getMessage() {
        return getPrivateMessage() + "\n" + innerException.getMessage();
    }

    protected abstract String getPrivateMessage();

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        innerException.printStackTrace();
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        StackTraceElement[] stackTrace = super.getStackTrace();
        StackTraceElement[] innerStackTrace = innerException.getStackTrace();

        StackTraceElement[] result = Arrays.copyOf(stackTrace, stackTrace.length + innerStackTrace.length);
        System.arraycopy(innerStackTrace, 0, result, stackTrace.length, innerStackTrace.length);
        return result;
    }

}
