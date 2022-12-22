
public class Arrays
{
    public static boolean arr(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        
        
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] >= 10 && arr1[i] < 100) {
                sum1 += 1;
            }
        }
        
        for(int a = 0; a < arr2.length; a++) {
            if(arr2[a] >= 10 && arr2[a] < 100) {
                sum2 += 1;
            }
        }
        
        if(sum1 == sum2) {
            return true;
        }else return false;
        //System.out.println(sum1);
        //System.out.println(sum2);
        
    }
}
