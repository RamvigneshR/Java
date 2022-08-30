package ATMPROJ;

public class ATM {

    private double balance;
    private int depositamt;
    private int withdrawamt;

    public ATM(){
      
    }

    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public int getDepositamt() {
        return depositamt;
    }
    
    public void setDepositamt(int depositamt) {
        this.depositamt = depositamt;
    }

    public int getWithdrawamt() {
        return withdrawamt;
    }
    
    public void setWithdrawamt(int withdrawamt) {
        this.withdrawamt = withdrawamt;
    }

}
