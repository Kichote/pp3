public class Person
{   
    //atrybuty
    private String name;
    private int age;
    
    //konstruktor
    Person(String name, int age) {
        setName(name);
        setAge(age);
    }
    
    //Nowe imię
    void setName(String name) {
        this.name = name;
    }
    
    //Nowy wiek
    void setAge(int age) {
        this.age = age;
    }
    
    //Wyświetla imie
    String getName() {
        return name;
    }
    
    //Wyświetla wiek
    int getAge() {
        return age;
    }
    
    //Sprawdza czy podana osoba jest dorosła
    boolean isAdult() {
        if(age >= 18) {
            return true;
        }else {
            return false;
        }
    }
    
    public String toString() {
        return name + "," + age;
    }
}
