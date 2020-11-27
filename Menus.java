import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Menus {

    public static ArrayList<productCategories> category = new ArrayList<>();

    public static String arrayCatPrint_1() {
        String out = "";
        if (category.size()==0){
            out = "empty";
        }else{
            for (int i = 0; i < category.size(); i++) {
                out = "\t"+(i) + "- " + category.get(i).getCategories()+"\n";
            }
        }
        return out;
    } // print add product category

    public static String arrayCatPrint() {
        String out = "";
        if (category.size()==0){
            out = "empty";
        }else{
            for (int i = 0; i < category.size(); i++) {
                out = "\t"+(i+1) + "- " + category.get(i).getCategories()+"\n";
            }
        }
        return out;
    } //print inventory category

    public static String arrayProdPrint(ArrayList<products> tab) {
        String out = "";
        if (tab.size()==0){
            out = "empty";
        }else{
            for (int i = 0; i < tab.size(); i++) {
                out += i + "[\t" + tab.get(i).getProductName() + " \t|\t "
                        + tab.get(i).getSerialNumber() + " \t|\t "
                        + tab.get(i).getExpirationDate() + " \t|\t "
                        + tab.get(i).getQuantity() + " \t|\t "
                        + tab.get(i).getPrice() + " \t] \n";
            }
        }
        return out;
    } //print products in specific category

    public static void printii(){
        System.out.println(
                "***************  Store Management System v1.0  ***************\n" +
                        "This Project is developed as a project for the OOP course\n" +
                        "*************************************************************\n"
        );
    } //print head

    public static double userDubInput(){
        Scanner input = new Scanner(System.in);
        double in;
        try {
            in = input.nextDouble();
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Invalid input;");
            in = userDubInput();
        }
        return in;
    } //scan double

    public static String userStrInput(){
        Scanner input = new Scanner(System.in);
        String in;
        try {
            in = input.nextLine();
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Invalid input;");
            in = userStrInput();
        }
        return in;
    } //scan String

    public static int userInput(){
        Scanner input = new Scanner(System.in);
        int in;
        try {
            in = input.nextInt();
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Invalid input;");
            in=69;
        }
        return in;
    }  //scan int

    public static void userWhateverInput(){
        Scanner input = new Scanner(System.in);
        String x = input.next();

    } //to work on empty input

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void addProductCatMenu(){
        clearConsole();
        System.out.println(
                "***************  Store Management System v1.0  ***************\n" +
                        "This Project is developed as a project for the OOP course\n" +
                        "*************************************************************\n" +
                        "   Inventory:\n" +
                        "   0- new category\n"+
                        arrayCatPrint()+
                        "\n*************************************************************\n"+
                        "       Type 0 to return to menu\n"
        );
        int input = userInput();
        if (input==0) {
            printii();
            System.out.println("    Enter new Category name: ");
            String in = userStrInput();
            productCategories cat = new productCategories(in);
            category.add(cat);
            addProductCatMenu();
        }else if (input>0 && input-1<category.size()){
            category.get(input-1).addProduct();
        }else{
            System.out.println("this choice is not found");
            addProductCatMenu();
        }

    } //add category

    public static void inventoryPreMenu(){
        clearConsole();
        System.out.println(
                "***************  Store Management System v1.0  ***************\n" +
                        "This Project is developed as a project for the OOP course\n" +
                        "*************************************************************\n" +
                        "   Inventory:\n" +
                        arrayCatPrint_1()+
                        "\n*************************************************************\n"+
                        "       Type 0 to return to menu\n"
        );
        int input = userInput();
        if (input<category.size()){
            inventoryMenu(input);
        }else{
            System.out.println("this choice is not found");
            inventoryMainMenu();
        }

    }

    public static void inventoryMenu(int toukebri){//choice 1-1

        clearConsole();
        System.out.println(
                "***************  Store Management System v1.0  ***************\n" +
                        "This Project is developed as a project for the OOP course\n" +
                        "*************************************************************\n" +
                        "   Inventory:\n" +
                        arrayProdPrint(category.get(toukebri).getProducts())+
                        "\n*************************************************************\n"+
                        "       Type 0 to return to menu\n"
        );
        userWhateverInput();
        inventoryMainMenu();
    }

    public static void inventoryMainMenu(){//choice 1
        clearConsole();
        System.out.println(
                "***************  Store Management System v1.0  ***************\n" +
                        "This Project is developed as a project for the OOP course\n" +
                        "*************************************************************\n" +
                        "   Inventory Management:\n" +
                        "       1- Inventory\n" +
                        "       2- Add product\n" +         //1-existing product(q++)  2-new product
                        "       3- Remove product\n" +      //1-select from inventory 2-with serial number 3-delete almost expiring products
                        "       4- Update product\n" +      //recheck
                        "       5- Check Stock/expiration\n" +
                        "       6- Return to main menu\n" +
                        "*************************************************************\n"
        );
        switch(userInput()) {
            case 1:
                // Inventory
                inventoryPreMenu();
                break;
            case 2:
                //add product
                addProductMenu();
                break;
            case 3:
                // Remove product
                break;
            case 4:
                // code block
                break;
            case 5:
                // code block
                break;
            case 6:

                break;
            default:
                System.out.println("\n\nWrong choice please try again! ");
                userWhateverInput();
                inventoryMainMenu();
        }
    }

    public static void addProductMenu(){//1-2
        clearConsole();
        System.out.println(
                "***************  Store Management System v1.0  ***************\n" +
                        "This Project is developed as a project for the OOP course\n" +
                        "*************************************************************\n" +
                        "   Add Product:\n" +
                        "       1- Add new product\n" +
                        "       2- Add to existing product\n" +
                        "       3- Go back\n" +
                        "*************************************************************\n"
        );
        switch(userInput()) {
            case 1:
                addProductCatMenu();
                break;
            case 2:
                // existing product --> q++
                break;
            case 3:
                inventoryMainMenu();
                break;
            default:
                System.out.println("Wrong choice please try again! ");
        }

    }

    public static void mainMenu(){//0
        clearConsole();
        System.out.println(
                "***************  Store Management System v1.0  ***************\n" +
                        "This Project is developed as a project for the OOP course\n" +
                        "*************************************************************\n" +
                        "   Main Menu:\n" +
                        "       1- Inventory Management\n" +
                        "       2- Billing System\n" +
                        "       3- End Session\n" +
                        "*************************************************************\n"
        );
        switch(userInput()) {
            case 1:
                inventoryMainMenu();
                break;
            case 2:
                // code block
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice please try again! ");
        }

    }

}

//System.out.println("Category name: ");
//        String n = userStrInput();
//        productCategories cat = new productCategories(n);
//        category.add(cat);
//        printii();
//        arrayProdPrint(category.get(0).getProducts());
//
////                productCategories cat = new productCategories();
////                cat.setCategories( userStrInput());
////                Categories.add(cat);
////                cat.addProduct();