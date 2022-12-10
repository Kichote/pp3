

public class Chapter
{
    private String title;
    private int numberOfPages;
    private int startingPageNumber;
    
    Chapter(String title, int numberOfPages, int startingPageNumber) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.startingPageNumber = startingPageNumber;
    }
    
    public String toString() {
        return "Chapters title: " + title + "\nNumber of Pages: " + numberOfPages + " Starting page: " + startingPageNumber;
    }
}
