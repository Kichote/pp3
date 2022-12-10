
public class Writer
{
    private String name;
    private String lastName;
    private String genre;
    
    Writer(String name, String lastName, String genre) {
        this.name = name;
        this.lastName = lastName;
        this.genre = genre;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String toString() {
        return "Name: " + this.name + " Surname: " + this.lastName + " Genre: " + this.genre;
    }
}
