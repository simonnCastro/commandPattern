import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Lights lights = new Lights();
        MusicPlayer musicPlayer = new MusicPlayer();
        Thermostat thermostat = new Thermostat();
        CenterHub rc = new CenterHub();

        ChangeBrightness changeBrightness= new ChangeBrightness(lights);
        System.out.println(changeBrightness.execute());

        ChangePlaylist changePlaylist = new ChangePlaylist(musicPlayer);
        System.out.println(changePlaylist.execute());
        DecreaseVolume decreaseVolume = new DecreaseVolume(musicPlayer);
        System.out.println(decreaseVolume.execute());

        IncreaseTemperature increaseTemperature = new IncreaseTemperature(thermostat);
        System.out.println(increaseTemperature.execute());
    }
}