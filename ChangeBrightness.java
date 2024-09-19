public class ChangeBrightness implements Command {
    private Lights lights;
 
    public ChangeBrightness(Lights lights) {
        this.lights = lights;
    }
 
    @Override
    public String execute() {
        return lights.changeBrightness();
    }
}