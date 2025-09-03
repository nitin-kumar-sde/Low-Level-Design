package design_patterns.structural.proxy;

public class VideoPlayer {

    public static void main(String[] args) {

        final RealVideo realVideo = new RealVideo("design-patterns.mp4");
        final Video video = new ProxyVideo("design-patterns.mp4", realVideo);

        System.out.println("First call:");
        video.play();  // Loads and plays video

    }
}
