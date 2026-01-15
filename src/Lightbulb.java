public class Lightbulb {
    private String name;
    private boolean isOn;
    private int powerUsage;

    public Lightbulb(String n, boolean O, int U) {
        name = n;
        isOn = O;
        powerUsage = U;
    }

    public String getName() {
        return name;
    }
    public boolean getIsOn() {
        return isOn;
    }
    public int getPowerUsage(){
        return powerUsage;
    }
    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }

}
