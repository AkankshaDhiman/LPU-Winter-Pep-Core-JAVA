public interface Appliance {
    void turnOn();
    default void turnOff() {
        System.out.println("turned off");

    }
}
class Light implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("light turned On");
    }
    public void turnOff() {
        System.out.println("light turned off");

    }
}
class Fan implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan turned On");
    }

    public void turnOff() {
        System.out.println("Fan turned off");

    }
}


class Interface {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance light = new Light();
        fan.turnOn();
        light.turnOn();
        fan.turnOff();
        light.turnOff();
        //
    }
}