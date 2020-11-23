import java.util.Scanner;

public class productCategories implements ProductManipulation{
    private String categories;
    private products[] products;
    static int x=0;

    public productCategories(String categories) {
        this.categories = categories;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public products[] getProducts() {
        return products;
    }

    @Override
    public void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.print("Product Name: ");
        this.products[x].setProductName(input.nextLine());
        System.out.print("\nProduct Serial Number: ");
        this.products[x].setSerialNumber(input.nextInt());
    }

    @Override
    public void removeProduct() {

    }
}
