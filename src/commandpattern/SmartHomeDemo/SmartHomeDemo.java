package commandpattern;


public class SmartHomeDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        Command lightOn = new TurnOnLightCommand(light);
        Command lightOff = new TurnOffLightCommand(light);
        Command setTemp18 = new SetThermostatCommand(thermostat, 18);
        Command playMusic = new PlayMusicCommand(musicPlayer, "Lullaby.mp3");
        Command stopMusic = new StopMusicCommand(musicPlayer);

        Command goodNight = new MacroCommand(new Command[] {
                new TurnOffLightCommand(light),
                new SetThermostatCommand(thermostat, 16),
                new StopMusicCommand(musicPlayer)
        });

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl(6);
        remote.setCommand(0, lightOn);
        remote.setCommand(1, lightOff);
        remote.setCommand(2, setTemp18);
        remote.setCommand(3, playMusic);
        remote.setCommand(4, stopMusic);
        remote.setCommand(5, goodNight);

        remote.pressButton(0);
        remote.pressButton(3);
        remote.pressButton(2);
        remote.pressButton(5);

        remote.undoButton();
        remote.redoButton();
    }
}
