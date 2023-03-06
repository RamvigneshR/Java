package Bankingsys;

public class Bankingsystem {
    
    int amount = 0;
    int prevtransaction=0;

    public void start(){
        Login login = new Login();

        try {
            login.acceptIn();
            login.verify();
        } catch (Exception e) {

            try {
                login.acceptIn();
                login.verify();
            } catch (Exception r) {

            }
        }
    }

    public  int getbalance(){
        return amount;
    }

    public  void addamt(int amt){
        amount = amount + amt;
        System.out.println("Successfully deposited");
        System.out.println();
        System.out.println("total balance : "+ amount);
        System.out.println();
    }

    public void withdraw(int amt){
        System.out.println();
        prevtransaction =- amt;

        if(amount < amt){
            InvalidTransaction invalidwithdraw = new InvalidTransaction("Invalid withdrawal amount");
            System.out.println(invalidwithdraw.getMessage());
        }
        else
        {
            amount=amount-amt;
            System.out.println("please collect your amount : "+amt);
            System.out.println();
            System.out.println("Total Balance : "+amount);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome Ram");
        Bankingsystem bank = new Bankingsystem();
        bank.start();
    }
}
