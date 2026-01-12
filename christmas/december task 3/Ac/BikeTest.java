    public class BikeTest {
        public static void main(String...Odili) {

       
        Bike myBike = new Bike();

        myBike.turnOn();

        for(int count = 1; count <= 100; count ++){
            
            myBike.accelerate();

        
        
        System.out.println("The speed of my bike is at " + myBike.speed + " and am at gear " + myBike.gearPosition);
                
        }
    }

}
