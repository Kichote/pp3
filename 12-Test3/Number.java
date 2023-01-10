
public class Number
{
    private int system;
    private String value;
    
    public Number(int system, String value) {
        this.system = system;
        this.value = value;
    }
    
    public void setSystem(int system) {
        this.system = system;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public int getSystem() {
        return this.system;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public int get10() {
        int result = 0;
        
        for(int i = 0; i< value.length(); i++) {
            int digit = Character.getNumericValue(value.charAt(i));
            if(digit >= system || digit < 0) {
                return -1;
            }
        result = result *system + digit;
        }
        return result;
    }
}
