package org.example.chainOfReponsibility;


import org.example.chainOfReponsibility.handlers.*;


public class Main {
    public static void main(String[] args) {
        LogHandler logHandler = new LogErrorHandler(new LogWarnHandler(new LogInfoHandler(null)));

        logHandler.log(LogLevel.INFO, "This is an info.");
        logHandler.log(LogLevel.WARN, "This is a warning ");
        logHandler.log(LogLevel.ERROR, "This is an error.");
    }
}
