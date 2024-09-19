// Concrete command for adjusting the volume of a stereo
public class MusicPlayer {
    public String switchOn() {
        return "MusicPlayer are turned-on!";
    }
    public String switchOff(){
        return "MusicPlayer are turned-off!";
    }
	public String changePlaylist(){
        return "Playlist of MusicPlayer is changed.";
    }
    public String decreaseVolume(){
        return "Volume of MusicPlayer is decreased.";
    }
}