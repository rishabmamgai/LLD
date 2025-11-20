package org.example.behavioural.strategy;

import org.example.behavioural.strategy.encoderstrategies.Mp4;
import org.example.behavioural.strategy.encoderstrategies.Mp3;


public class Main {
    public static void main(String[] args) {
        VideoEncoder videoEncoder1 = new VideoEncoder(new Mp3());
        videoEncoder1.encodeVideo();

        VideoEncoder videoEncoder2 = new VideoEncoder(new Mp4());
        videoEncoder2.encodeVideo();
    }
}
