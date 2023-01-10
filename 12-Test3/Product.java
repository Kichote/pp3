
public abstract class Product implements Comparable
{
    private String name;
    private float price;
    
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public float getPrice() {
        return price;
    }
    
    @Override
    public int compareTo(Product otherProduct){
        return this.name.compareTo(otherProduct.name);
    }
}
