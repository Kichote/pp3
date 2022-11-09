//Punkt 16

public class Rectangle
{
    //atrybuty
    int a ;
    int b ;
    
    //metody
    //displaying dimensions
    void displayDimension() {
        System.out.println(a + "x" + b);
    }
    
    //displaying perimeter
    void displayPerimeter() {
        System.out.println(2*a + 2*b);
    }
    
    //displaying surface area
    void displayArea() {
        System.out.println(a*b);
    }
}
