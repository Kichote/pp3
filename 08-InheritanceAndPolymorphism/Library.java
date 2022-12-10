import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public static void main() {
        Book b1 = new Book("Hobbit", "Tolkien");
        Book b2 = new Ebook("Dziady", "Adam Mickiewicz", "Wieszcz");
        Book b3 = new Ebook("Lalka", "Bolesław Prus", "Bolesław");
        Book b4 = new Audiobook("Dziady cz.3", "Adam Mickiewicz", 45, 30);
        Book b5 = new Audiobook("Dziady cz.2", "Adam Mickiewicz", 55, 33);
        
        Library l1 = new Library();
        l1.books.add(b1);
        l1.books.add(b2);
        l1.books.add(b3);
        l1.books.add(b4);
        l1.books.add(b5);
        for (Book i : l1.books) {
            i.display();
        }
    }
}
