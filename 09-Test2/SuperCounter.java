
public class SuperCounter extends Counter
{    
    private int value;
    
    SuperCounter(int counter) {
        super(counter);
        value = counter;
    }
    
    public void addN(int n) {
          value = getCounter() + n;
    }
}
