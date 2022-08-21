package todolist;

import java.util.*;
public class todolist {
    public static List<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        int items=1;
        while(items!=0)
        {
            items=display();
            switch(items){
                case 1:
                    showlist();
                    break;
                case 2:
                    additems();
                    break;
                case 3:
                    removeItems();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static int display(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("----------------");
        System.out.println("Main Menu");
        System.out.println("----------------");
        System.out.println("1.Display to-do-list");
        System.out.println("2.Add items to list");
        System.out.println("3.Remove items from list");
        System.out.println("0.Exit the list");
        System.out.println();
        System.out.println("Enter the choice : ");
        int choice = in.nextInt();
        return choice;
    }

    public static void showlist(){
        System.out.println();
        System.out.println("----------------");
        System.out.println("To-Do-List");
        System.out.println("----------------");
        int number = 1;
        for(String item : list)
        {
            System.out.println(number + " "+ item);
            number++;
        }
        System.out.println("----------------");
    } 

    public static void additems(){
        System.out.println("Add Item");
        System.out.println();
        System.out.println("----------------");
        System.out.println("Enter an item to add : ");
        Scanner in = new Scanner(System.in);
        String item = in.nextLine();
        list.add(item);
        showlist();
    }
    public static void removeItems(){
        System.out.println("Remove Item");
        System.out.println("----------------");
        Scanner in = new Scanner(System.in);
        System.out.println("What you want to remove : ");
        int removenum = in.nextInt();
        if(removenum<0 || removenum>list.size())
        {
            System.out.println("No number found to remove!!");
        }
        else
        {
            list.remove(removenum-1);
        }
        System.out.println("----------------");
        showlist();
    }

}
