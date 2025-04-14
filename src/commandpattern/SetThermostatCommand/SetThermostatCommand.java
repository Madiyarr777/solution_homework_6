package commandpattern;


public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int newTemp;
    private int prevTemp;

    public SetThermostatCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.newTemp = temperature;
    }

    @Override
    public void execute() {
        prevTemp = thermostat.getTemperature();
        thermostat.setTemperature(newTemp);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(prevTemp);
    }
}
