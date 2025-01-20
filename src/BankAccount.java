//Create a BankAccount class:
//○ Private fields: accountNumber, balance.
//○ Public methods: deposit(double), withdraw(double), and
//getBalance().
//○ Write code that tests your BankAccount class to ensure correct behavior.
public class BankAccount {
    private String accountNumber;
    private int balance;

    public  BankAccount(String accountNumber, int initial_balance){
        this.accountNumber=accountNumber;
        this.balance=initial_balance;

    }
    public void deposit(int amount){
        if (amount > 0) {
            balance += amount;
            //deposited
        }else{
            System.out.println("Deposited amount must be greater than zero");
        }

    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            //withdrawal
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }
    public int getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
}
