import java.util.ArrayList;

public class Book
{
    private String title;
    private Writer author;
    private int pages;
    private ArrayList<String> chapter = new ArrayList<String>();
    
    Book(String title, Writer author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    public void open() {
        
    }
    
    public void read() {
        
    }
    
    public void addChapter(Chapter ch1) {
        chapter.add(ch1.toString());
    }
    
    public String toString() {
        return "Title: " + title + "\n" + "Author: " + author.toString() + "\nNumber of Pages: " + pages + "\nChapters: " + chapter;
    }
    
    public static void main() {
        Writer w1 = new Writer("Adam", "Mickiewicz", 55);
        
        Book b1 = new Book("Dziady", w1, 240);
        
        System.out.println(b1);
    }
}
