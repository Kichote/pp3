//Punkt 16

public class InternetDevice
{
    static int connectedDevices = 6;
    String name;
    boolean isConnected;
    
    InternetDevice(String name) {
        this.name = name;
    }
    
    void connect() {
        isConnected = true;
    }
    
    void disconnect() {
        isConnected = false;
    }
    
    boolean isConnected() {
        return isConnected;
    }
    
    void displayStatus() {
        if (isConnected == true) {
            System.out.println("Status: connected");
        }else {
            System.out.println("Status: not connected");
        }
    }
    
    static void displayConnections() {
        System.out.println("Number of connected devices: " + connectedDevices);
    }
}
