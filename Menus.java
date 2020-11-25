import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Menus {

    static ArrayList Categories = new ArrayList();

    public static void printii(){
        System.out.println(
                "***************  Store Management System v1.0  ***************\n" +
                        "This Project is developed as a project for the OOP course\n" +
                        "*************************************************************\n"
        );
    }

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
    }

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
    }

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
    }

    public static void userWhateverInput(){
        Scanner input = new Scanner(System.in);
        String x = input.next();

    }

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

    public static void inventoryMenu(){//choice 1-1
        clearConsole();
        System.out.println(
                "***************  Store Management System v1.0  ***************\n" +
                        "This Project is developed as a project for the OOP course\n" +
                        "*************************************************************\n" +
                        "   Inventory:\n" +
                        Categories.toString() +
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
                        "       2- Add product\n" +         //1-existing product(q++, productExpiration)  2-new product
                        "       3- Remove product\n" +      //1-select from inventory 2-with serial number 3-delete almost expiring products
                        "       4- Update product\n" +      //recheck
                        "       5- Check Stock/expiration\n" +
                        "       6- Return to main menu\n" +
                        "*************************************************************\n"
        );
        switch(userInput()) {
            case 1:
                // Inventory
                inventoryMenu();
                break;
            case 2:
                System.out.println("Category name: ");
                productCategories cat = new productCategories();
                cat.setCategories( userStrInput());
                Categories.add(cat);
                cat.addProduct();
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
                // add new product --> 1- existing category 2- new category
                break;
            case 2:
                // existing product
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
                "***************  Store Managment System v1.0  ***************\n" +
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