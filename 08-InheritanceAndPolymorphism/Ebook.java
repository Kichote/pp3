
public class Ebook extends Book
{
    private String fileName;
    
    Ebook(String title, Writer author, Publisher p, int year, String fileName) {
        super(title, author, p, year);
        this.fileName = fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    
    public void display() {
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nFile Name: " + fileName);
    }
    
    public static void main() {
        Publisher p1 = new Publisher("Kowal" , "Warszawa");
        Publisher p2 = new Publisher("Marko","Szczecin");
        Publisher p3 = new Publisher("Darko", "Poznan");
        Writer w1 = new Writer("Bolesław", "Prus", "Dramat");
        Writer w2 = new Writer("Adam", "Mickiewicz", "Dramat");
        Writer w3 = new Writer("Wdasd", "Wujda", "Komedia");
        Ebook eb1 = new Ebook("Lalka", w1, p1 , 2012, "Książki");
        Ebook eb2 = new Ebook("Dziady", w2, p2, 1998, "Wieszcz");
        Book b1 = new Book("Wow", w3, p3, 2009);
        eb1.display();
        eb2.display();
        b1.display();
    }
}
