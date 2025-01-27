import java.util.Scanner;

import java.util.Scanner;

 class Room {
    private double height;
    private double width;
    private double breadth;
    public Room(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    public double volume() {
        return height * width * breadth;
    }
}
public class RoomDemo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Room room1 = new Room(in.nextDouble(), in.nextDouble(), in.nextDouble());
        Room room2 = new Room(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println("Volume of Room 1: " + room1.volume());
        System.out.println("Volume of Room 2: " + room2.volume());
    }
}
