
public class Isogram
{
    static boolean isogram(String str) {
        if(str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)- 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if(freq[i] > 1) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String args[]) {
            String str = "isograms";
            System.out.println(isogram(str)?"Yes":"No");
            
            str = "Geks";
            System.out.println(isogram(str)?"Yes":"No");
        }
}
