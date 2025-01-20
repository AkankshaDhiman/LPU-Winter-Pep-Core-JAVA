// TestBankAccount.java
public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Bank003568", 50000);

        System.out.println("Account Number: " + account.getAccountNumber());
        account.deposit(20000);
        System.out.println("Current Balance: $" + account.getBalance());
        account.withdraw(10000);
        System.out.println("Current Balance: $" + account.getBalance());
        account.withdraw(80000);
        account.deposit(-5000);
        account.withdraw(-1000);
        System.out.println("Current Balance: $" + account.getBalance());
    }
}

