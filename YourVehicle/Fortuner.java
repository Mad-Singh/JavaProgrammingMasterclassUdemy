public class Fortuner extends Car{
    private int seats;
    private String model;
    
    public Fortuner(String vehicleType, int gears, String color, int seats, String model){
        super(vehicleType, gears, 4, color);
        this.seats = seats;
        this.model = model;
    }
    
}
