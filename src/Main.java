public class Main {
    static void main(String[] args) {
        Lightbulb light1 = new Lightbulb("Kitchen", false, 60);
        Lightbulb light2 = new Lightbulb("Dining Room", false, 80);
        Lightbulb light3 = new Lightbulb("Living Room", false, 40);

        System.out.println(light1.getName()); // Kitchen

        light1.turnOn();
        System.out.println(light1.getIsOn()); // true
        light1.turnOff();
        System.out.println(light1.getIsOn()); // false

        System.out.println(light2.getPowerUsage()); // 80

        SmartHome home = new SmartHome(3);

        home.add(light1, 0);
        home.add(light2, 1);

        System.out.println(home.sumTotal()); // 140

        home.add(light3, 2);

        System.out.println(home.sumTotal()); // 180

        Lightbulb light4 = new Lightbulb("Bedroom", false, 40);
        home.add(light4, 3); // Throws ArrayIndexOutOfBounds exception
    }

}
