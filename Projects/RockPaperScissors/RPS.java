package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;


public class RPS {

    public static void main(String[] args) {
        
        String[] rps = {"r","p","s"};
        String comp = rps[new Random().nextInt(rps.length)];
        String player;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move (r,p,s) : ");
            player = in.nextLine();
            if(player.equals("r")||player.equals("p")||player.equals("s")){
                break;
            }
            System.out.println(player + "is not valid");
        }

        System.out.println("Computer : "+comp);

        if(player.equals(comp)){
            System.out.println("Game tie");
        }
        
        else if(player.equals("r")){
            if(comp.equals("p")){
                System.out.println("You lose");
            }
            else if(comp.equals("p")){
                System.out.println("You win");
            }
        }

        else if(player.equals("p")){
            if(comp.equals("r")){
                System.out.println("You win");
            }
            else if(comp.equals("s")){
                System.out.println("You lose");
            }
        }

        else if(player.equals("s")){
            if(comp.equals("p")){
                System.out.println("You win");
            }
            else if(comp.equals("r")){
                System.out.println("You lose");
            }
        }
        in.close();
    }
}