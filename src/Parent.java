class Parent {
    public void greet() {
        System.out.println("Hello from Parent.");
    }
}

class Child extends Parent {
}

 class details {
    public static void main(String[] args) {
        Child child = new Child();
        child.greet();
    }
}

