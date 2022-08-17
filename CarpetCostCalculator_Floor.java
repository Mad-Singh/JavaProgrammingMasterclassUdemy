public class Floor{
     private double height;
    private double width;
    
    public Floor(double width, double height){
        if(height<0 && width<0){
            this.height = 0;
            this.width = 0;
        }
        else if(width<0){
            this.width = 0;
            this.height = height;
        }
        else if(height<0){
            this.height = 0;
            this.width = width;
        }
        else{
            this.height = height;
            this.width = width;
        }
    }
    

    public double getArea(){
        return this.width * this.height;
    }
    
}    
