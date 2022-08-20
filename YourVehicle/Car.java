public class Car extends Vehicle{
    private int gears;
    private int tyres;
    private String color;
    
    public Car(String vehicleType, int gears, int tyres, String color){
        super("Car");
        this.gears = gears;
        this.tyres = tyres;
        this.color = color;
    }
    
    public void breaks(){
        System.out.println(" Breaks are called");
    }
    
    @Override
    public void move(int speed){
        System.out.println("Car.move() called");
        if(speed < 90){
            super.move(speed);
        }
        else{
            System.out.println("Please slow down");
            breaks();
        }
    }
}
