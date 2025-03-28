class Person {
    // Private attributes
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) { // Ensure age is non-negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class DetailsPrint {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Akanksha");
        person.setAge(25);
        person.displayDetails();
    }
}
