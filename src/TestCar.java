public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.startEngine();
        car1.setMake("car1");
        car1.setModel("Model1");
        car1.setYear(2023);
        car1.startEngine();

        Car car2 = new Car("car2", "model2", 2022);
        car2.startEngine();
    }
}
