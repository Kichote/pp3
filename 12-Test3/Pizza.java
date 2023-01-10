
public abstract class Pizza extends Food implements Extra 
{
    private int size;
    
    public Pizza(String name,int size) {
        super(name);
        this.size = size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
    
    @Override
    public float discount() {
        float discount = 0;
        if(getPrice() <= 30) {
            discount = 0.05f * getPrice();
        }
        return discount;
    }
    
    @Override
    public float delivery(int tip) {
        if (size >= 50) {
            return 8 + tip;
        } else {
            return 6 + tip;
        }
    }
    
    @Override
    public void setPrice() {
        int price = 0;
        price = size - 10;
    }
}
