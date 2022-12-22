import java.util.List;
import java.util.ArrayList;

public class ShoppingList
{
    private List<Product> products;
    
    ShoppingList() {
        products = new ArrayList<>(); 
    }
    
    public void add(Product product) {
        products.add(product);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Product product : products) {
            sb.append(product.getName() + ",");
        }
        return sb.substring(0, sb.length() - 1);
    }
    
    public int total() {
        int total = 0;
        for(Product product : products) {
            total += product.getQuantity();
        }
        return total;
    }
}
