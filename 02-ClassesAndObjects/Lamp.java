//Punkt15

public class Lamp
{
    //atrybuty
    String name;
    int weight;
    boolean isOn;
    
    //metody
    //włączanie lampy
    void switchOn() {
        isOn = true;
    }
    //wyłączanie lampy
    void switchOff() {
        isOn = false;
    }
    //wyświetlanie informacji o stanie włączenia lampy
    void displayStatus() {
        if (isOn ==true) {
            System.out.println("Lamp is on");
        }
        else System.out.println("Lamp is off");
    }
    
}
