
public abstract class Vehicle
{
    private String brand;
    private int numberOfSeats;
    private String licensePlate;
    
    Vehicle(String brand, int numberOfSeats, String licensePlate) {
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
        this.licensePlate = licensePlate;
    }
    
    public abstract void showInfo();
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
