package org.example.strategy.encoderstrategies;


public class Mov implements EncoderStrategy {
    @Override
    public void encode() {
        System.out.println("Encoding to " + getClass().getSimpleName());
    }
}
