
public class Book
{
    private String title;
    protected Writer author;
    protected Publisher publisher;
    private int yearOfPublication;
    
    Book(String title, Writer author, Publisher publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        yearOfPublication = year;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(Writer author) {
        this.author = author;
    }
    
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author.toString();
    }
    
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    
    public void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author.toString() + "\nPublisher: " + publisher.toString());
        System.out.println("Year of publication: " + yearOfPublication);
    }
    
    public static void main() {
        Publisher p1 = new Publisher("Kowal", "Warszawa");
        Publisher p2 = new Publisher("Marko", "Kraków");
        Writer w1 = new Writer("Adam", "Mickiewicz", "Dramat");
        Writer w2 = new Writer("John", "Tolkien", "Powieść");
        Book b1 = new Book("Dziady", w1, p1, 2012);
        Book b2 = new Book("Lalka", w2, p2, 2008);
        b1.display();
        b2.display();
    }
}
