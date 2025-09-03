package design_patterns.structural.proxy;

/**
 * RealVideo class that implements the Video interface.
 * It represents a real video that can be played.
 */
public class RealVideo implements Video {
    private final String filename;

    public RealVideo(String filename) {
        this.filename = filename;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video: " + filename);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + filename);
    }
}
