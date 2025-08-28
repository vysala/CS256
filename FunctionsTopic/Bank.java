package FunctionsTopic;

// Different ways of creating methods.

/*

1. Method has No Parameters and No Return Value
2. Method has No Parameters and Returns a Value
3. Method Takes Parameters and No Return Value
4. Method Takes Parameters and Returns a Value
*/

public class Bank {
    // Instance variables
    static double balance=50;
    static double interestRate=5;

    

    // 1. Method has No Parameters and No Return Value
    static void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // 2. Method has No Parameters and Returns a Value
    static double getInterestRate() {
        return interestRate;
    }

    // 3. Method Takes Parameters and No Return Value
    static void deposit(double amount) {
        if (amount > 0) {
            balance = balance+amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // 4. Method Takes Parameters and Returns a Value
    static boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance-amount;
            System.out.println("Withdraw: " + amount);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }

  
    public static void main(String[] args) {
       

        // 1. Calling a method with no parameters and no return value
           checkBalance();

        // 2. Calling a method with no parameters and returning a value
        double interestRate = getInterestRate();
        System.out.println("Interest Rate: " + interestRate + "%");

        // 3. Calling a method with parameters and no return value
        deposit(200.00);
        checkBalance();

        // 4. Calling a method with parameters and returning a value
        boolean success = withdraw(100.00);
        if (success==true) {
            checkBalance();
        }
    }
}
