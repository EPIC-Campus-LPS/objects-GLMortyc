public class SmartHome {
    private int slots;
    private int sumTotal;

    public SmartHome(int l){
         slots = l;
    }
    public void add(Lightbulb light, int slot){
        sumTotal += light.getPowerUsage(); ;
    }
    public int sumTotal() {
        return sumTotal;
    }
}
