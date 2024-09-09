import java.util.*;

class Bank {
    int accNo, amount;
    String accType;

    Bank(int accNo, int amount, String accType) {
        this.accNo = accNo;
        this.amount = amount;
        this.accType = accType;
    }

    Scanner sc = new Scanner(System.in);

    // Method to deposit money
    void deposit() {
        System.out.println("Enter deposit amount: ");
        int deposit = sc.nextInt();
        amount += deposit;
        System.out.println("Deposited: " + deposit);
        System.out.println("Updated Balance: " + amount);
    }

    // Method to withdraw money
    void withdraw() {
        System.out.println("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();
        if (withdraw > amount) {
            System.out.println("Insufficient Balance");
        } else {
            amount -= withdraw;
            System.out.println("Withdrawn: " + withdraw);
            System.out.println("Updated Balance: " + amount);
        }
    }

    // Method to display balance
    void balance() {
        System.out.println("The balance in the bank account is: " + amount);
    }
}

public class BankAccMang {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------WELCOME TO ASHU'S BANK-------------------------------------------------");
        Scanner sc = new Scanner(System.in);

        // Input bank details
        System.out.println("Enter bank details: ");
        System.out.print("1) Account Number: ");
        int AccNo = sc.nextInt();

        System.out.print("2) Initial Amount: ");
        int amount = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline

        System.out.print("3) Account Type: ");
        String AccType = sc.nextLine();

        // Create Bank object
        Bank bk = new Bank(AccNo, amount, AccType);

        // Continuous loop for bank operations
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("What do you want to do?: ");
            System.out.println("1) Check Balance\n2) Deposit Money\n3) Withdraw Money\n4) Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bk.balance();
                    break;
                case 2:
                    bk.deposit();
                    break;
                case 3:
                    bk.withdraw();
                    break;
                case 4:
                    System.out.println("Thanks for using Ashu's bank. Goodbye!");
                    sc.close();
                    return;  // Exits the loop and the program
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }
}
