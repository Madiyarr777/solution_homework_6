package commandpattern;


public class PlayMusicCommand implements Command {
    private MusicPlayer player;
    private String track;

    public PlayMusicCommand(MusicPlayer player, String track) {
        this.player = player;
        this.track = track;
    }

    @Override
    public void execute() {
        player.play(track);
    }

    @Override
    public void undo() {
        player.stop();
    }
}
