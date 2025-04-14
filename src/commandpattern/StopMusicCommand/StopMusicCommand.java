package commandpattern;


public class StopMusicCommand implements Command {
    private MusicPlayer player;
    private String stoppedTrack;

    public StopMusicCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        if (player.isPlaying()) {
            stoppedTrack = player.getCurrentTrack();
        }
        player.stop();
    }

    @Override
    public void undo() {
        if (stoppedTrack != null) {
            player.play(stoppedTrack);
        }
    }
}
