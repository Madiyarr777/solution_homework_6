package commandpattern;


public class Light {
    private boolean isOn = false;

    public void on() {
        isOn = true;
        System.out.println("Light: Включаем свет.");
    }

    public void off() {
        isOn = false;
        System.out.println("Light: Выключаем свет.");
    }

    public boolean isOn() {
        return isOn;
    }
}
