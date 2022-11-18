//Punkt 10

public class CinemaTicket2
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
    
    CinemaTicket2(String filmTitle, int row, int seat, double price) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        this.price = price;

    }
}
