package org.example.behavioural.chainofreponsibility.handlers;


public class LogErrorHandler extends LogHandler {
    public LogErrorHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.ERROR) {
            System.out.println(logLevel + " : " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
