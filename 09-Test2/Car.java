
public class Car extends Vehicle
{
    private int maxSpeed;
    
    
    Car(int seats,int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }
    
    public int[] spec() {
         int[] spec = {getSeats(), maxSpeed};
         return spec;
    }
}
