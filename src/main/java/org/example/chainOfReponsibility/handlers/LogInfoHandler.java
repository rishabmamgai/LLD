package org.example.chainOfReponsibility.handlers;


public class LogInfoHandler extends LogHandler {
    public LogInfoHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.INFO) {
            System.out.println(logLevel + " : " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
