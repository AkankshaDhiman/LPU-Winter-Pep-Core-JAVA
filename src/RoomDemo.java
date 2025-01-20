import java.util.Scanner;

public class RoomDemo {
        public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            Room room1 = new Room(in.nextDouble(), in.nextDouble(), in.nextDouble());
            Room room2 = new Room(in.nextDouble(), in.nextDouble(), in.nextDouble());
            System.out.println("Volume of Room 1: " + room1.volume());
            System.out.println("Volume of Room 2: " + room2.volume());
        }
    }

