public class Room {
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
