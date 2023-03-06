package Bankingsys;
import java.util.*;

/**
 * Login
 */
public class Login {

    int accnum = 12345678;
    int accpass = 2002;
    int acc;
    int pass;

    public void acceptIn(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account number : ");
        acc = in.nextInt();
        System.out.println("Enter the password : ");
        pass = in.nextInt();
        in.close();
    }

    public void verify(){
        if(acc == accnum && pass == accpass ){
            System.out.println("Login successfull");
            System.out.println();
            Bankingsystem b = new Bankingsystem();
            System.out.println("your balance is : "+b.getbalance());
            System.out.println();
            Menu m = new Menu();
            m.showMenu();
        }
        else{
            InvalidTransaction loginFailed = new InvalidTransaction("Incorrect Login credential");
            System.out.println(loginFailed.getMessage());

        }
    }
}