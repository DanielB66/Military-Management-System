public class MusicPlayer {
    private boolean isPlaying;
    private int currentTrack;
    private String[] playlist;

    public MusicPlayer(String[] playlist) {
        this.playlist = playlist;
        this.isPlaying = false;
        this.currentTrack = 0;
    }

    public void nextTrack() {
        currentTrack++;
        if (currentTrack == playlist.length)
            currentTrack = 0;
        System.out.println("Skipping to next track: " + playlist[currentTrack]);
    }

    public void previousTrack() {
        currentTrack--;
        if (currentTrack < 0)
            currentTrack = playlist.length - 1;
        System.out.println("Skipping to previous track: " + playlist[currentTrack]);
    }

    public void randomTrack() {
        currentTrack = (int) (Math.random() * playlist.length);
        System.out.println("Skipping to random track: " + playlist[currentTrack]);
    }

    public void play() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("Now playing: " + playlist[currentTrack]);
        } else {
            System.out.println("Music is already playing.");
        }
    }

    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Music paused.");
        } else {
            System.out.println("No music is playing to pause.");
        }
    }

    public void start() {
        currentTrack = 0;
        System.out.println("Now playing: " + playlist[currentTrack]);
    }
    
}

