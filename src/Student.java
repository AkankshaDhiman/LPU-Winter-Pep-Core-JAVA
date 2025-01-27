import java.util.Scanner;

public class Student {
    private String name;
    private String college;

    public Student() {
        this.name = name;
        this.college = college;
    }
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getcollege() {
        return college;
    }

    public void setcollege(String college) {
        this.college = college;
    }

    public void PrintDetails(){
        System.out.println(name+" "+college+" ");
    }
}


class testStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student1 = new Student();
        student1.setname("Akanksha");
        student1.setcollege("LPU");
        student1.PrintDetails();
    }

}