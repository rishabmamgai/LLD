package org.example.behavioural.strategy;

import lombok.RequiredArgsConstructor;
import org.example.behavioural.strategy.encoderstrategies.EncoderStrategy;


@RequiredArgsConstructor
public class VideoEncoder {
    private final EncoderStrategy encoderStrategy;

    public void encodeVideo() {
        encoderStrategy.encode();
    }
}
