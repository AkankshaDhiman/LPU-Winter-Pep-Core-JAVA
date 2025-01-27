public class Vehicle {
    String model;
    int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println("Vehicle Constructor: Model =" +model + ", Year = " + year);
    }
}
    class Car2 extends Vehicle {
        String brand;

        public Car2(String model, int year, String brand) {
            super(model, year);
            this.brand = brand;
            System.out.println("Car Constructor: Brand = " + brand);
        }
    }
    class det{
        public static void main(String[] args) {
            Car2 c1 = new Car2("model 1",1992,"any brand");

        }}


