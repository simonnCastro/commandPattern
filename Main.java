import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Lights lights = new Lights();
        CenterHub rc = new CenterHub();

        ChangeBrightness changeBrightness= new ChangeBrightness(lights);
        System.out.println(changeBrightness.execute());
    }
}