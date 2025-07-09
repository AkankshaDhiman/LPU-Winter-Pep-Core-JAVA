public class Employee {

    String name;
    double salary;
    String address;

     String department;

    public Employee(String name,double salary, String address, String department) {
        this.name=name;
        this.salary = salary;
        this.address = address;
        this.department = department;

    }

    public void details() {
        System.out.println("name "+name);
        System.out.println("salary " + salary);
        System.out.println("address " + address);
        System.out.println("department " + department);

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Akanksha",45000, "Dharamshala", "CSE");
        Employee emp2 = new Employee("Sakshi",62000, "Jalandhar", "CSE");

       emp1.details();
       emp2.details();
    }
}
