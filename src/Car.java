//Create a Car Class:
//
//○ Fields: make, model, year.
//○ Constructors: No-arg constructor and a parameterized constructor.
//○ Methods: startEngine() which prints a start message.
//○ Instantiate and call methods from a main method in a separate TestCar class.
public class Car {

    private String make;
    private String model;
    private int year;

    public Car() {
        this.make = "Random";
        this.model = "Any";
        this.year = 2025;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void startEngine() {
        System.out.println( year + " " + make + " " + model + " starts");
    }
}


