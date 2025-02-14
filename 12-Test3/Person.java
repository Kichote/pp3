
public class Person
{
    private String name;
    private String surname;
    
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    @Override
    public String toString() {
        if(name != null && surname != null) {
            return (name.substring(0,1).toUpperCase() + surname.substring(0,1).toUpperCase());
        }
    return "";
    }
}
