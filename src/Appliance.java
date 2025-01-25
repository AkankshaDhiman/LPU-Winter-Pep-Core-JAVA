

public interface Playable {
    void turnOn();
    default void turnOff() {
        System.out.println("Stop playing");

    }
}
class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Play video");
    }
    public void stop() {
        System.out.println("Video stopped");

    }
}
class AudioPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Play audio");
    }
}

// Create an interface Playable with method play().
//○ Implement it in classes VideoPlayer and AudioPlayer.
//○ Demonstrate usage by calling play() on objects of these classes.

//Add a default method in Playable called stop() that prints a generic stopping message.
//○ Override it in VideoPlayer to show a different message.
class Interface {
    public static void main(String[] args) {
        Playable videoPlayer = new VideoPlayer();
        Playable audioPlayer = new AudioPlayer();
        videoPlayer.play();
        audioPlayer.play();
        videoPlayer.stop();
        //
    }
}