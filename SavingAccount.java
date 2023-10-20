import java.util.Scanner;

public class SavingAccount {
    public static void main(String[] args) {

        Saving obj = new Saving();
        obj.accountOpen();

    }

    static class Saving {
        int accountBalance = 10000;
        Scanner sc = new Scanner(System.in);

        public void accountOpen() {
            String accountNumber = "123123123123";
            System.out.println("What is your age: ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("Yes, you are eligible");
                System.out.println("What is your name: ");
                String accountHolderName = sc.next();
                System.out.println("Here is your account number: ");
                System.out.println(accountNumber);
                System.out.println("You can enjoy our services.");

                int option = 0;

                while (option != 3) { // Continue showing the menu until the user chooses to exit
                    System.out.println("\nSelect an option:");
                    System.out.println("1. Deposit Money");
                    System.out.println("2. Withdraw Money");
                    System.out.println("3. Exit");

                    option = sc.nextInt();

                    switch (option) {
                        case 1:
                            depositBalance();
                            break;
                        case 2:
                            withdrawMoney();
                            break;
                        case 3:
                            System.out.println("Thank you for using our services. Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid option. Please choose a valid option.");
                    }
                }
            } else {
                System.out.println("You are not eligible for opening the bank account.");
            }
        }

        public void withdrawMoney() {
            System.out.println("Enter the withdraw amount: ");
            int withdraw = sc.nextInt();
            if (withdraw > accountBalance) {
                System.out.println("Sorry, low balance.");
            } else {
                System.out.println("Successfully withdrew. Here is your final balance: ");
                accountBalance = accountBalance - withdraw;
                System.out.println(accountBalance);
            }
        }

        public void depositBalance() {
            System.out.println("Enter the deposit amount: ");
            int amount = sc.nextInt();
            System.out.println("Here is your final balance: ");
            accountBalance = amount + accountBalance;
            System.out.println(accountBalance);
        }
    }
}
