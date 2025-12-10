package org.example.behavioural.chainofreponsibility.handlers;


public class LogWarnHandler extends LogHandler {
    public LogWarnHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.WARN) {
            System.out.println(logLevel + " : " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
