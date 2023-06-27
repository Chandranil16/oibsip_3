import java.util.*;

public class AtmInterface {
    static double balance = 100000.00;
    static int pin;

    // DEPOSIT

    static void deposit(double amt) {
        if (amt <= 100000.00) {
            balance = balance + amt;
            System.out.println("^_^ Amount Deposited Successfully ^_^");
        } else {
            System.out.println("\n!!Limit Exceeded!!");
        }
    }

    // WITHDRAW

    static void withdraw(double amt) {
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("^_^ Amount Withdrawn Successfully ^_^");
        } else {
            System.out.println("\n!!Insufficient Balance!!");
        }
    }

    // TRANSFER

    static void transfer(double amt, long acc_no) {
        if (balance >= amt) {
            if (amt <= 25000.00) {
                balance = balance - amt;
                System.out.println("Rs." + amt + " Successfully Transferred to: " + acc_no);
            } else
                System.out.println("!! Sorry Limit is Rs.25000.00 !!");
        } else
            System.out.println("!!Insufficient Balance!!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 1234;
        System.out.println("Enter User Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Account Number: ");
        long acc_no = sc.nextLong();
        System.out.println("Enter Pin: ");
        int pin = sc.nextInt();
        if (pin != password) {
            System.out.println("!!Incorrect pin!!Please Try Again.");
        } else {
            while (true) {
                System.out.println("----------------------------------");
                System.out.println("Hi!! " + name + " Welcome to ATM INTERFACE");
                System.out.println("----------------------------------");
                System.out.println("1. CHECK BALANCE");
                System.out.println("2. DEPOSIT");
                System.out.println("3. WITHDRAW");
                System.out.println("4. TRANSFER");
                System.out.println("5. EXIT");
                System.out.println("??What do you want to do??");
                int choice = sc.nextInt();
                switch (choice) {

                    case 1:
                        System.out.println("Current Balance: " + balance);
                        break;

                    case 2:
                        System.out.println("Enter amount to be deposited: ");
                        double deposit_amount = sc.nextDouble();
                        deposit(deposit_amount);
                        break;

                    case 3:
                        System.out.println("Enter  amount to be withdrawn: ");
                        double withdraw_amount = sc.nextDouble();
                        withdraw(withdraw_amount);
                        break;

                    case 4:
                        System.out.println("Enter account number where you want to transfer: ");
                        long num = sc.nextInt();
                        System.out.println("Enter the amount: ");
                        double transfer_amount = sc.nextDouble();
                        transfer(transfer_amount, num);
                        break;

                    case 5:
                        System.out.println("^_^ Happy to serve you, Visit Again ^_^");
                        return;
                    default:
                        System.out.println("!!!Invalid Choice!!!");
                }
            }
        }
    }
}
