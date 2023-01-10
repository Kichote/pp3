
public class Logic
{
    private boolean[] array;
    
    public Logic(boolean[] array) {
        this.array = array;
    }
    
    public int oppposite() {
        int count = 0;
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] != array[i + 1]) {
                count ++;
            }
        }
        return count;
    }
}
