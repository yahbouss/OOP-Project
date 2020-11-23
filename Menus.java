import java.util.Scanner;
import java.io.*;

public class Menus {

    public static int userInput(){
        Scanner input = new Scanner(System.in);
        int in;
        try {
            in = input.nextInt();
        }
        catch (IOException e){
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
        } catch (IOException | InterruptedException ex) {}
    }

    public static void inventoryMenu(){//choice 1-1
        clearConsole();
        System.out.println(
                "***************  Store Management System v1.0  ***************\n" +
                        "This Project is developed as a project for the OOP course\n" +
                        "*************************************************************\n" +
                        "   Inventory:\n" +
                        "       **Prints array of categories and products**\n" +
                        "*************************************************************\n"+
                        "       click anything to return to menu\n"
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
                        "       2- Add product\n" +
                        "       3- Remove product\n" +
                        "       4- Update product\n" +
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
                // Add product
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
