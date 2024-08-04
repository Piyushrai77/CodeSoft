package Project2;
/*
                  ATM INTERFACE
 1 Create a class to represent the ATM machine.
 2.Design The User Interface for the ATM , including options such as withdrawing depositing and checking balance
 3.Implement method for each option such as withdraw, deposit and check balance.
 4.Create a class to represent the users bank account Which stores the account balance
 5. Connect the ATM class with the users bank account class to access and modify the account balance.
 6. Validate user input to enusre it is within acceptable limit(eg. sufficient balance for withdrals)
 7. Display Appropiate message to the user based on their chosen Option and the sucess or faliure of their
 transaction
 */

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BankAccount account= new BankAccount(0);
        Atm atm= new Atm(account);


        while(true)
        {
            System.out.println("Welcome In ATM");
            System.out.println("1. Withdrawn Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice= sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter amount to Withdrawn");
                    double withdrawAmount=sc.nextDouble();
                    Atm.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.println("Enter Amount to Deposit");
                    double depositAmount= sc.nextDouble();
                    Atm.deposit(depositAmount);
                    break;

                case 3:
                    Atm.checkBalance();
                    break;

                case 4:
                    System.out.println("ThankYou for using Atm");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }

    }

     }
