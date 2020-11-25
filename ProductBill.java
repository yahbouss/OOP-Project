
public class ProductBill {
  private String productName;
  private double Quantity;
  private double Price;

  public ProductBill(String productName, double quantity, double price) {
    this.productName = productName;
    this.Quantity = quantity;
    this.Price = price;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getQuantity() {
    return Quantity;
  }

  public void setQuantity(double quantity) {
    Quantity = quantity;
  }

  public double getPrice() {
    return Price;
  }

  public void setPrice(double price) {
    Price = price;
  }
}