package Bankingsys;

public class InvalidTransaction {
    String errorMessage;
    public InvalidTransaction(String msg){
        errorMessage = msg;
    }
    public String getMessage(){
        return errorMessage;
    }
}
