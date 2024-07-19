
public class MusicPlayerProgram {

    public static void main(String[] args) {
        String[] playlist = {"Song1", "Song2", "Song3", "Song4"};
        MusicPlayer player = new MusicPlayer(playlist);

        player.play();
        player.nextTrack();
        player.nextTrack();
        player.pause();
        player.play();
        player.previousTrack();
        player.previousTrack();
    }
}
