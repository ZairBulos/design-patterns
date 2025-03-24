package guru.refactoring;

import guru.refactoring.facade.VideoConversionFacade;

import java.io.File;

/**
 * Client
 */
public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}