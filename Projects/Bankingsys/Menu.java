package Bankingsys;
import java.util.*;
public class Menu {
    char option;
    Bankingsystem b = new Bankingsystem();
    Deposit d = new Deposit();
    int prevtransaction;
    
    public void getPrevTransaction(){
        if(prevtransaction>0){
            System.out.println(prevtransaction + " is credited in Your Account");
        }
        else if(prevtransaction<0){
            System.out.println(Math.abs(prevtransaction)+" is debited from your account");
        }
        else{
            System.out.println("No transaction occured");
        }
    }

    public void showMenu(){
        System.out.println("Welcome Ram");
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("===============================================================================================");
            System.out.println("Please Select an option below:");
            System.out.println("Press A to Deposit Amount.");
            System.out.println("Press B to Withdraw Amount.");
            System.out.println("Press C to View Balance");
            System.out.println("Press D to see last transaction");
            System.out.println("Press E for Exit");
            System.out.println("----------------------------------------------\n");
            System.out.println ("Press a key:");
            option = in.next().charAt(0);
            System.out.println("===============================================================================================\n");
        
            switch (option) {
                case 'A':
                    Deposit d = new Deposit();
                    int depamt =  d.UserIn();
                    prevtransaction = depamt;
                    b.addamt(depamt);
                    break;
                    
                case 'B':
                    System.out.println("Please Enter the amount to withdraw:");
                    int withamt=in.nextInt();
                    prevtransaction = -withamt;
                    b.withdraw(withamt);
                    break;
                    
                case 'C':
                    System.out.println("Your Account Balance is "+b.getbalance()+" Rupees");
                    System.out.println(" "); 
                    break;
                    
                case 'D':
                    getPrevTransaction();
                    System.out.println(" ");  
                    break;
                    
                case 'E':
                    System.out.println(" ");  
                    break;
        
                default:
                    System.out.println("Please enter a valid key");                    
                    break;
            }
        }while(option!='E');
        System.out.println("Thank you for using our service");
        in.close();
    }
}
