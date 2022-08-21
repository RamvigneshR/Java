package ATMPROJ;

import java.util.*;
import java.util.Map.Entry;

public class ATMoperationimplementations implements ATMoperationsInterface{

    ATM atm = new ATM();
    Map<Double,String> minist = new HashMap<Double,String>();

    public void viewbalance(){
        System.out.println("Available balance is : "+atm.getBalance());
    }

    public void withdrawamt(double withdrawamt){
        if(withdrawamt<=atm.getBalance()){
            minist.put(withdrawamt,"Amount Withdrawn");
            System.out.println("Cash withdrawn : "+withdrawamt);
            atm.setBalance(atm.getBalance()-withdrawamt);
            viewbalance();
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }
    }

    public void depositamt(double depositamt){
        minist.put(depositamt,"Amount deposited");
        System.out.println(depositamt+" Deposited Successfully");
        atm.setBalance(atm.getBalance()+depositamt);
        viewbalance();
    }

    public void viewStatement(){
            for(Entry<Double, String> map:minist.entrySet())
            {
                System.out.println(map.getKey()+" "+map.getValue());
            }
        }
    }
