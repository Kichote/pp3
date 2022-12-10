import java.util.ArrayList;
import java.util.Scanner;

public class shoppingList
{
    private ArrayList<String> items = new ArrayList<String>();
    shoppingList() {
    }
    
    public ArrayList<String> showcase() {
        System.out.println(items);
        return items;
    }
    
    public int howManyItems() {
        return items.size();
    }
    
    public void addItem() {
        Scanner myObj = new Scanner(System.in);
        String nItem = myObj.nextLine();
        items.add(nItem);
    }
    
    public static void main(String[] args) {
        shoppingList sl1 = new shoppingList();
        sl1.showcase();
        sl1.howManyItems();
        sl1.addItem();
        sl1.addItem();
        sl1.addItem();
        sl1.showcase();
        sl1.howManyItems();
        sl1.addItem();
        sl1.showcase();
        sl1.howManyItems();
    }
}
