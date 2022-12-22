import java.util.ArrayList;

public class Family
{   
    private Person[] people;

    Family(Person[] p) {
        people = p;
    }
    
    public int adults() {
        int count = 0;
        for(Person p : people) {
            if(p.getAge() >= 18) {
                count++;
            }
        }
        return count;
    }
}
