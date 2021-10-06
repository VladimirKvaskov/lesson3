package Lesson4TriangleArea;

public class SideTriangleException extends Exception {
    public SideTriangleException() {
    }

    public SideTriangleException(String message) {
        super(message);
    }

    public SideTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public SideTriangleException(Throwable cause) {
        super(cause);
    }

    public SideTriangleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
