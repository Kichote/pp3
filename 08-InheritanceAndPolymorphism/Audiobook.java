

public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    Audiobook(String title, Writer author, Publisher p, int year, int minutes, int seconds) {
        super(title, author, p, year);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    public void display() {
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublisher: " + this.publisher.getName() + "\nMinutes: " + minutes + ", Seconds: " + seconds);
        System.out.println("Year of publication: " + getYearOfPublication());
    }
    
    public static void main() {
        Publisher p1 = new Publisher("Kowal","Warszawa");
        Publisher p2 = new Publisher("Marko","Szczecin");
        Publisher p3 = new Publisher("Darko", "Poznan");
        Writer w1 = new Writer("Bolesław", "Prus", "Dramat");
        Writer w2 = new Writer("Adam", "Mickiewicz", "Dramat");
        Writer w3 = new Writer("Wasd", "dasdasd", "Komedia");
        Audiobook ab1 = new Audiobook("Lalka", w1, p1, 2021, 55, 23);
        Audiobook ab2 = new Audiobook("Dziady", w2, p2, 1999, 59, 59);
        Book b1 = new Book("dasdas", w3, p3, 2008);
        ab1.display();
        ab2.display();
        b1.display();
    }
}
