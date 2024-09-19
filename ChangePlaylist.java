public class ChangePlaylist implements Command{
    private MusicPlayer musicPlayer;

    public ChangePlaylist(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    public String execute(){
        return musicPlayer.changePlaylist();
    }
}