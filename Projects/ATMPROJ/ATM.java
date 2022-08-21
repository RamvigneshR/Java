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
    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return int return the depositamt
     */
    public int getDepositamt() {
        return depositamt;
    }

    /**
     * @param depositamt the depositamt to set
     */
    public void setDepositamt(int depositamt) {
        this.depositamt = depositamt;
    }

    /**
     * @return int return the withdrawamt
     */
    public int getWithdrawamt() {
        return withdrawamt;
    }

    /**
     * @param withdrawamt the withdrawamt to set
     */
    public void setWithdrawamt(int withdrawamt) {
        this.withdrawamt = withdrawamt;
    }

}
