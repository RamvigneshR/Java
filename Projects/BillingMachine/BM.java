package BillingMachine;

import java.util.*;

class Product{
    String pname;
    int quantity;
    double price;
    double total;

    Product(String pname,int quantity,double price,double total){
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public static void displayFormat(){
        System.out.println("\n Name    Quantity    Price    TotalPrice");
    }

    public void display(){
        System.out.format("%-9s  %2d  %9.2f  %9.2f\n",pname,quantity,price,total);
    }
}

/**
 * BM
 */
public class BM {

    public static void main(String[] args) {
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalprice = 0.0;
        double overallcost = 0.0;
        char choice = '\0';  //null char

        Scanner in = new Scanner(System.in);
        ArrayList<Product> product = new ArrayList<Product>();

        do{
            System.out.println("Enter product details ");
            System.out.println("-----------------------");
            System.out.println("Enter product name: ");
            productName = in.nextLine();
            System.out.println("Enter Quantity : ");
            quantity = in.nextInt();
            System.out.println("Enter price(single product) : ");
            price = in.nextDouble();

            totalprice = price*quantity;

            overallcost = overallcost+totalprice;

            product.add(new Product(productName, quantity, price, totalprice));

            System.out.println("Want to add more items (y/n) :");
            choice = in.next().charAt(0);

            in.nextLine();

        }while(choice=='y'||choice=='Y');

        Product.displayFormat();
        for(Product p : product){
            p.display();
        }

        System.out.println("Overall Cost : "+overallcost);

        in.close();;
    }
}