import java.util.ArrayList;

public class productCategories implements ProductManipulation{

    private String categories;
    ArrayList<products> Products = new ArrayList();

    public productCategories(String categories) {
        this.categories = categories;
    }
    public productCategories() {
        this.categories = "";
    }
    public String getCategories() {
        return categories;
    }

    public ArrayList<products> getProducts() {
        return Products;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public void addProduct() { //add product
        Menus.printii();
        System.out.println("Enter Product name: ");
        String N = Menus.userStrInput();
        System.out.println("Enter Product Serial number: ");
        int ser = Menus.userInput();
        System.out.println("Enter Product Expiration Date: ");
        String date = Menus.userStrInput();
        System.out.println("Enter Product Quantity: ");
        int q = Menus.userInput();
        System.out.println("Enter Product Price: ");
        double prix = Menus.userDubInput();
        products prod = new products(N, ser, date, q, prix);
        Products.add(prod);

    }

    @Override
    public void removeProduct() {

    }

    @Override
    public String toString() {
        String x = "";
        for (int i = 0; i < Products.size(); i++) {
            x += Products.get(i).toString();
        }

        return x;
    }
}


//        System.out.print("Product Name: ");
//        String PN1 = input.nextLine();
//        products.add(PN1);
//      //  this.products[x].setProductName(input.nextLine());
//        System.out.print("\nProduct Serial Number: ");
//        double PS1 = input.nextDouble();
//        products.add(PS1);
//        System.out.println(products);
//
//        // this.products[x].setSerialNumber(input.nextInt());