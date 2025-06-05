package my.dez;

import java.util.Scanner;

//Main class
public class Main
{
    public static void main(String[] args){
        //declare all the things that needed
        Scanner scan = new Scanner(System.in);
        BankAccountWithLock bankAccount = new BankAccountWithLock(0.00);
        int userChoice;

        do{
            double depositAmount;
            double withdrawAmount;

            //create a bank menu
            System.out.println("\n---------Bank Account Menu---------");
            System.out.println("-------Please Choose a Option------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice (1-4):");
            userChoice=scan.nextInt();

            //choice that user choose to process
            switch(userChoice){
                case 1:
                    bankAccount.getBalance();
                    break;

                case 2:
                    System.out.print("Enter Deposit Ammount(RM): ");
                    depositAmount = scan.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter Withdraw Ammount(RM): ");
                    withdrawAmount = scan.nextDouble();
                    bankAccount.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using our system");
                    System.out.println("------------Exiting-----------");
                    break;

                default:
                    System.out.println("Invalid number, Please select 1 to 4.");
            }
        }while(userChoice != 4);
    }
}
