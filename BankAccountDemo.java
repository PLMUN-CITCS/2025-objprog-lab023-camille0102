// BankAccount class
class BankAccount {
    // Attributes (Data Fields)
    public String accountHolder;
    private double balance;
    protected String accountType;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Main class to demonstrate the BankAccount functionality
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount myAccount = new BankAccount("John Doe", 1000.0, "Checking");

        // Deposit some money
        myAccount.deposit(250.0);

        // Withdraw some money
        myAccount.withdraw(100.0);

        // Display account information
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
