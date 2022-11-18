//Punkt 13  

public class Person
{
    String name;
    int weight;
    int height;
    double BMI;
    
    public Person(String name) {
        this.name = name;
    }
        
    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    public void setWeightAndHeight(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    
    public double calculateBMI() {
        BMI = weight/((height/100.0)*(height/100.0));
        return BMI;         
    }
    
    public void displayBMI() {
        if (BMI < 18.5) {
            System.out.println("BMI too low");
        }else if (BMI > 24.9) {
            System.out.println("BMI too high");
        }else {
            System.out.println("Your BMI: " + BMI);
        }
    }
    
    public void displayRecord() {
        System.out.println(name + ", " + weight + "kg, " + height + "cm, " + BMI);
    }
}
