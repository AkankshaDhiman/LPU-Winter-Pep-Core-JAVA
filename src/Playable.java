public interface Playable {
    void play();
    default void stop() {
        System.out.println("Stop playing");
        //
    }
}
