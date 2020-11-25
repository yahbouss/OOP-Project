import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Bill{
    double Quantity;
    double Price;
    String productName;
    ArrayList products = new ArrayList();

     public void addProduct(){
    Scanner inputA = new Scanner(System.in);




    System.out.print("Product Name: ");
    productName = inputA.nextLine();
    System.out.print("Price: ");
    Price = inputA.nextDouble();
    System.out.print("Quantity: ");
    Quantity = inputA.nextDouble();
    ProductBill PB = new ProductBill( productName, Price, Quantity);
    products.add(PB);


    Iterator itr=products.iterator();

    while(itr.hasNext()){
        ProductBill st=(ProductBill) itr.next();
        System.out.println(st.getProductName()+" "+st.getPrice()+" "+st.getQuantity());
        System.out.println("The price of your product is : "+Price*Quantity+"$");
    }

//    System.out.println(products);
   /* Scanner inputA = new Scanner(System.in);
    System.out.print("Product Name: ");
    String PN1 = inputA.nextLine();
    products.add(PN1);
    System.out.print("Quantity: ");
    double Q1= inputA.nextDouble();
    products.add(Q1);
    System.out.print("Price: ");
    double P1 =inputA.nextDouble();
    products.add(P1);
    System.out.println(products);
    System.out.println("The price of your product is : "+Q1*P1+ " $" );*/

}
public void removeProduct(){
  Scanner inputB = new Scanner(System.in);
    System.out.print("choose the product to remove : ");
    int RP1 = inputB.nextInt();
    products.remove(RP1);
    System.out.println(products);

}


}