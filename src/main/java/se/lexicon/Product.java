package se.lexicon;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        setProductId(productId);
        setName(name);
        setPrice(price);
    }

    public int getProductId() {
        return productId;
    }

    private void setProductId(int productId) {
        if(productId <= 0){
            IO.println("Product id cannot be null or empty!");
        }
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equalsIgnoreCase("null")){
            IO.println("product name cannot be empty!");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            IO.println("Price cannot be zero or negative");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
