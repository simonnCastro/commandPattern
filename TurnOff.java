public class TurnOff implements Command {
    private Lights lights;


    public TurnOff(Lights lights){
        this.lights = lights;
    }

    public TurnOff(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return lights.switchOff();
    }
}