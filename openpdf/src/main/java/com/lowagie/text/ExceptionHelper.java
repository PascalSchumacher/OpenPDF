package com.lowagie.text;


public class ExceptionHelper {

    public static RuntimeException convertToRuntimeException(Exception exception) {
        if (exception instanceof RuntimeException) {
            return (RuntimeException) exception;
        }
        return new RuntimeException(exception);
    }
}
