public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.startEngine();
        car1.setMake("Ford");
        car1.setModel("Mustang");
        car1.setYear(2023);
        car1.startEngine();

        Car car2 = new Car("Toyota", "Corolla", 2022);
        car2.startEngine();
    }
}
