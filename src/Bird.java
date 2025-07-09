class Animal1 {
    public void move() {
        System.out.println("Animal moves.");
    }
}

class Bird extends Animal1 {
    @Override
    public void move() {
        System.out.println("Bird flies.");
    }
}

class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Penguin waddles.");
    }
}

 class printdetails{
    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        animal.move();

        Bird bird = new Bird();
        bird.move();

        Penguin penguin = new Penguin();
        penguin.move();
    }
}

