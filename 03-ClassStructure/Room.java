//Punkt 22

public class Room
{
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    Room(int number) {
        this.number = number;
        this.beds = 2;
    }
    
    Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }
    
    void checkin(String guestName) {
        this.guestName = guestName;
        occupied = true;
    }
    
    void checkout() {
        occupied = false;
        guestName = null;
    }
    
    public String toString() {
        return number + " " + beds + " " + occupied + " " + guestName;
    }
    
}
