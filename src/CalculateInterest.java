import java.util.Scanner;
abstract class BankAccounts {
    double balance;

    abstract void calculateint();
    void showBalance() {
        System.out.println("Account balance: " + balance);
    }
}

class SavingsAccount extends BankAccounts {

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    void calculateint() {
        System.out.println("Interest: " + 0.05 * balance);
    }
}

class CalculateInterest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        SavingsAccount account = new SavingsAccount(in.nextInt());
        account.showBalance();
        account.calculateint();
    }
}
