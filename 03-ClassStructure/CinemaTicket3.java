//Punkt 12

public class CinemaTicket3
{
    static String cinemaName="Multikino";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    void displayInfo(){
        System.out.println("Status:");
        System.out.println("Nazwa Kina: " + cinemaName);
        System.out.println("Nazwa filmu: " + filmTitle);
        System.out.println("Rząd: " + row);
        System.out.println("Miejsce: " + seat);
        System.out.println("Cena: " + price);
    }
    
    public static void main(String[] args) {
        CinemaTicket3 ticket1 = new CinemaTicket3("Krzyżacy", 5 , 3, 10.0);
        ticket1.displayInfo();
        CinemaTicket3 ticket2 = new CinemaTicket3("Wesele", 3, 2, 15.0);
        ticket2.displayInfo();
    }
    
    CinemaTicket3(String filmTitle, int row, int seat, double price) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        this.price = price;
        
        if (row < 3) {
            this.price = 10.0;
        } else {
            this.price = 25.0;
        }
    }
}
