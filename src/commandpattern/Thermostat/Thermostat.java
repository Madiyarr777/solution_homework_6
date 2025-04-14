package commandpattern;


public class Thermostat {
    private int currentTemperature = 20;

    public void setTemperature(int temperature) {
        System.out.println("Thermostat: Установка температуры " + temperature + "°C (было " + currentTemperature + "°C)");
        currentTemperature = temperature;
    }

    public int getTemperature() {
        return currentTemperature;
    }
}
