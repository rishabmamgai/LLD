package org.example.chainOfReponsibility.handlers;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public abstract class LogHandler {
    private final LogHandler nextLogHandler;

    public void log(LogLevel logLevel, String message) {
        if (nextLogHandler != null) {
            nextLogHandler.log(logLevel, message);
        }
    };
}
