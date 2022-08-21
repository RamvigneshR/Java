package ATMPROJ;

import java.util.*;
public class ATMmain extends ATM{
    public static void main(String[] args) {
        
        ATMoperationsInterface op = new ATMoperationimplementations();

        int Accnum =123456;
        int pin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine ...");
        System.out.println("Enter ATM Number : ");
        int cusAccnum = in.nextInt();
        System.out.println("Enter pin Number : ");
        int cusPinnum = in.nextInt();

        if(cusAccnum==Accnum && pin==cusPinnum){
            while(true){
                
                System.out.println("\n1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int choice = in.nextInt();

                switch(choice){
                    case 1:
                        op.viewbalance();
                        break;

                    case 2:
                        System.out.println("Enter amount to Withdraw : ");
                        double withdrawamt = in.nextDouble();
                        op.withdrawamt(withdrawamt);
                        break;

                    case 3:
                        System.out.println("Enter amount to Deposit : ");
                        double depositamt = in.nextDouble();
                        op.depositamt(depositamt);
                        break;

                    case 4:
                        op.viewStatement();
                        break;
                    case 5:
                        System.out.println("THank You..");
                        System.exit(0);
                }
            }
        }
        else
        {
            System.out.println("Invalid Account number or Pin Number");
        }
        in.close();
    }   
}