package commandpattern;


public class MusicPlayer {
    private boolean playing = false;
    private String currentTrack = null;

    public void play(String track) {
        playing = true;
        currentTrack = track;
        System.out.println("MusicPlayer: Начало воспроизведения трека \"" + track + "\"");
    }

    public void stop() {
        if (playing) {
            System.out.println("MusicPlayer: Остановлен трек \"" + currentTrack + "\"");
            playing = false;
            currentTrack = null;
        } else {
            System.out.println("MusicPlayer: Плеер и так остановлен.");
        }
    }

    public boolean isPlaying() {
        return playing;
    }

    public String getCurrentTrack() {
        return currentTrack;
    }
}
