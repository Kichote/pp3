//Punkt 8

public class SurfaceArea
{
    double radius;
    int a;
    int b;
    int height;
    
    public double circle(double radius) {
        return radius*radius*Math.PI;
    }
    
    public int rectangle(int a, int b) {
        return a*b;
    }
    
    public int triangle(int a, int height) {
        return (a*height)/2;
    }
}
