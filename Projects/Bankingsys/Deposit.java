package Bankingsys;
import java.util.*;
public class Deposit {
    int amt = 0;
    int prevtransaction=0;
    public int UserIn(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited : ");
        amt = in.nextInt();
        prevtransaction = amt;
        if(amt<=0){
            InvalidTransaction invalid_deposit = new InvalidTransaction("Invalid depoist");
            System.out.println(invalid_deposit.getMessage());
            UserIn();
        }
        else{
            in.close();
        }
        return amt;
    }
}
