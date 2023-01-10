public class MyArrays
{
    static int even(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2 == 0) {
                sum += 1;
            }
        }
        return sum;
    }
    
    static int positiveOdd(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 1 &&  array[i]> 0) {
                sum += 1;
            }
        }
        return sum;
    }
}
