public class Vehicle{
    private String vehicleType;
    
    public Vehicle(String vehicleType){
        this.vehicleType = vehicleType;
    }
    
    public void move(int speed){
        System.out.println("Vehicle is moving with speed " + speed);
    }
}
