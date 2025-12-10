package org.example.behavioural.chainofreponsibility.handlers;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class LogHandler {
    private final LogHandler nextLogHandler;

    public void log(LogLevel logLevel, String message) {
        if (nextLogHandler != null) {
            nextLogHandler.log(logLevel, message);
        }
    };
}
