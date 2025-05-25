package org.example.strategy.encoderstrategies;


public class Mp4 implements EncoderStrategy {
    @Override
    public void encode() {
        System.out.println("Encoding to " + getClass().getSimpleName());
    }
}
