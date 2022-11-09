//Punkt 13

public class Smartphone
{
    
    //5 atrybutów
    String number = "123" ;
    String color = "red" ;
    String brand = "Iphone";
    int dateOfProduction = 2012;
    float weight = 105.05f;
    
    //3 metody
    void displayBrand() {
        System.out.println(brand);
    }
    
    void displayColor() {
        System.out.println(color);
    }
    
    void displayAll() {
        System.out.println(number);
        System.out.println(color);
        System.out.println(brand);
        System.out.println(dateOfProduction);
        System.out.println(weight);
    }
}
