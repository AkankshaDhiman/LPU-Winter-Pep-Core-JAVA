public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Play video");
    }
    public void stop() {
        System.out.println("Video stopped");
    }
}