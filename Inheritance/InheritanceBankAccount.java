package InhertianceTopic;
/**
 * Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
 * Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
 */

 // BankAccount.java
// Parent class BankAccount

// Declare the BankAccount class
 class BankAccount {
    // Private field to store the account number
    private String accountNumber;

    // Private field to store the balance
    private double balance;

    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        // Increase the balance by the deposit amount
        balance += amount;
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        // Check if the balance is sufficient for the withdrawal
        if (balance >= amount) {
            // Decrease the balance by the withdrawal amount
            balance -= amount;
        } else {
            // Print a message if the balance is insufficient
            System.out.println("Insufficient balance");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        // Return the current balance
        return balance;
    }
} 

// SavingsAccount.java
// Child class SavingsAccount

// Declare the SavingsAccount class, inheriting from BankAccount
class SavingsAccount extends BankAccount {
    // Constructor to initialize account number and balance
    public SavingsAccount(String accountNumber, double balance) {
        // Call the parent class constructor
        super(accountNumber, balance);
    }

    // Override the withdraw method from the parent class
    @Override
    public void withdraw(double amount) {
        // Check if the withdrawal would cause the balance to drop below $100
        if (getBalance() - amount < 100) {
            // Print a message if the minimum balance requirement is not met
            System.out.println("Minimum balance of $100 required!");
        } else {
            // Call the parent class withdraw method
            super.withdraw(amount);
        }
    }
}


// Define the Main class
public class InheritanceBankAccount {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Print message to indicate creation of a BankAccount object
        System.out.println("Create a Bank Account object (A/c No. BA5555) with initial balance of $500:");
        // Create a BankAccount object (A/c No. "BA5555") with initial balance of $500
        BankAccount BA5555 = new BankAccount("BA5555", 500);

        // Print message to indicate deposit action
        System.out.println("Deposit $1000 into account BA5555:");
        // Deposit $1000 into account BA5555
        BA5555.deposit(1000);
        // Print the new balance after deposit
        System.out.println("New balance after depositing $1000: $" + BA5555.getBalance());

        // Print message to indicate withdrawal action
        System.out.println("Withdraw $600 from account BA5555:");
        // Withdraw $600 from account BA5555
        BA5555.withdraw(600);
        // Print the new balance after withdrawal
        System.out.println("New balance after withdrawing $600: $" + BA5555.getBalance());

        // Print message to indicate creation of a SavingsAccount object
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA5555) with initial balance of $450:");
        // Create a SavingsAccount object (A/c No. "SA5555") with initial balance of $450
        SavingsAccount SA5555 = new SavingsAccount("SA5555", 450);

        // Withdraw $300 from SA1234
        SA5555.withdraw(300);
        // Print the balance after attempting to withdraw $300
        System.out.println("Balance after trying to withdraw $300: $" + SA5555.getBalance());

        // Print message to indicate creation of another SavingsAccount object
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        // Create a SavingsAccount object (A/c No. "SA1000") with initial balance of $300
        SavingsAccount SA1000 = new SavingsAccount("SA1000", 300);

        // Print message to indicate withdrawal action
        System.out.println("Try to withdraw $250 from SA1000!");
        // Withdraw $250 from SA1000 (balance falls below $100)
        SA1000.withdraw(250);
        // Print the balance after attempting to withdraw $250
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());
    }
} 
