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

    @Override
    public void addProduct(int x) { //add product
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
    public void removeProduct(int i) {
        Products.remove(i);
    }

    @Override
    public String toString() {
        String x = "";
        for (int i = 0; i < Products.size(); i++) {
            x += Products.get(i).toString() + "\n";
        }
        return x;
    }
}