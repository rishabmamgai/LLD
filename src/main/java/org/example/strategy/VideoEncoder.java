package org.example.strategy;

import lombok.RequiredArgsConstructor;
import org.example.strategy.encoderstrategies.EncoderStrategy;


@RequiredArgsConstructor
public class VideoEncoder {
    private final EncoderStrategy encoderStrategy;

    public void encodeVideo() {
        encoderStrategy.encode();
    }
}
