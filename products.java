import java.util.Objects;

//VARIABLES
public class products implements ProductManipulation{


    private String ProductName;
    private int SerialNumber;
    private String ExpirationDate;
    private int Quantity;
    private double Price;
    int count;

    // GETTERS AND SETTERS
    public double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.ExpirationDate = expirationDate;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }

    public void setSerialNumber(int serialNumber) {
        this.SerialNumber = serialNumber;
    }

    public products(String n, int sn, String exp, int q, double prix) {
        this.ProductName = n;
        this.SerialNumber = sn;
        this.ExpirationDate = exp;
        this.Quantity = q;
        this.Price = prix;
    }

    public boolean almostOutOfStock() {
        return !(this.Quantity>3);
    }

    private boolean inStock() {
        return (this.Quantity>0);
    }

    @Override
    public String toString() {
        return "products{" +
                "ProductName='" + ProductName + '\'' +
                ", SerialNumber=" + SerialNumber +
                ", ExpirationDate='" + ExpirationDate + '\'' +
                ", Quantity=" + Quantity +
                ", Price=" + Price +
                '}';
    }

    @Override
    public void addProduct() {
        this.Quantity++;
    }

    @Override
    public void removeProduct() {
        this.Quantity--;
    }
}