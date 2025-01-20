//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are
//deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class
//'Bank', each having a method named 'getBalance'. Call this method by creating an object of each
//of the three classes

abstract class Bank {
    abstract double getBalance();
}

class BankA extends Bank {
    private double balance;
    public BankA(double deposit) {
        this.balance = deposit;
    }
    @Override
    double getBalance() {
        return balance;
    }
}
class BankB extends Bank {
    private double balance;
    public BankB(double deposit) {
        this.balance = deposit;
    }
    @Override
    double getBalance() {
        return balance;
    }
}
class BankC extends Bank{
    private double balance;
    public BankC(double deposit) {
        this.balance = deposit;
    }
    @Override
    double getBalance() {
        return balance;
    }
}
public class main{
    public static void main(String[] args) {
        Bank BankA=new BankA(100);
        Bank BankB= new BankB(150);
        Bank BankC=new BankC(200);

        System.out.println("balance of bank1 = "+BankA.getBalance());
        System.out.println("balance of bank1 = "+BankB.getBalance());
        System.out.println("balance of bank1 = "+BankC.getBalance());

    }
}