package design_patterns.structural.proxy;

/**
 * Proxy class for Video that controls access to the RealVideo.
 */
public class ProxyVideo implements Video {

    private final String filename;
    private final Video realVideo;

    public ProxyVideo(String filename, RealVideo realVideo) {
        this.filename = filename;
        this.realVideo = realVideo;
    }

    @Override
    public void play() {
        // all the authorization logic here
        System.out.println("Proxy: Checking access for video: " + filename);
        realVideo.play();
    }
}

