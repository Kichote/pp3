
public class Numbers
{
    private int int1;
    private int int2;
    private int int3;
    private int int4;
    private int int5;
    
    Numbers(int int1, int int2, int int3, int int4, int int5) {
        this.int1 = int1;
        this.int2 = int2;
        this.int3 = int3;
        this.int4 = int4;
        this.int5 = int5;
    }
    
    public boolean different() {
        if(int1 != int2 && int1 != int3 && int1 != int4 && int1 != int5 && int2 != int3 && int2 != int4 && int2 != int5 && int3 != int4 && int3 != int5 && int4 != int5) {
            return true;
        }else return false;
            
    }
}
