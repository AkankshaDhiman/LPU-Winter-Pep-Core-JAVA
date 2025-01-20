
//○ Create an abstract class Shape with an abstract method draw().
//○ Extend it with Circle and Rectangle classes, implementing the draw()
//method.
//○ Test them in a main method.
abstract class Shape {
    abstract void draw();
}

class circle extends Shape {
    @Override
    void draw() {
        System.out.println(" Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println(" Rectangle ");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape circle = new circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
    }
}
