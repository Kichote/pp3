
public class Numbers implements interfaceOk
{
    private int[] numbers;
    
    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }
    
    @Override
    public boolean ok() {
        for(int i = 0; i < numbers.length; i++) {
            if(i % 2 == 0 && numbers[i] % 2 != 0) {
                return false;
            }
            
            if(i % 2 != 0 && numbers[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
