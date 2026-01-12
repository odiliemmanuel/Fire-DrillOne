import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RunBikeTest {




    @Test
    public void testThatBikeCanTurnOn(){
        Bike bike = new Bike();

        bike.turnOn();

        boolean expected = true;

        boolean actual  = bike.bikeIsOn();

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void testThatBikeCanTurnOff(){

        Bike bike = new Bike();

        bike.turnOff();

        boolean actual = bike.bikeIsOn();

        boolean expected = false;

        Assertions.assertEquals(actual,expected);
    }



    @Test
    public void testThatBikeCanAccelerateWhenOn(){

        Bike bike = new Bike();

        bike.turnOn();

        int speedOne = bike.getSpeed();

        Assertions.assertEquals(speedOne,1);

        bike.accelerate();

        int speedTwo = bike.getSpeed();
        int gearPosition = bike.getGearPosition();

        Assertions.assertEquals(gearPosition,1);
        Assertions.assertEquals(speedTwo,2);
    }


    

    @Test
    public void testThatBikeCannotAccelerateWhenOff(){

        Bike bike = new Bike();

        bike.turnOff();

        int speedOne = bike.getSpeed();

        Assertions.assertEquals(speedOne,1);

        bike.accelerate();

        int speedTwo = bike.getSpeed();
        
        Assertions.assertEquals(speedTwo,1);  
    }



    @Test
    public void testThatWhenSpeedCrossAGivenRangeAndGearChanges(){

        Bike bike = new Bike();

        bike.turnOn();

        int speedOne = bike.getSpeed();
        int gearOne = bike.getGearPosition();

        Assertions.assertEquals(speedOne,1);
        Assertions.assertEquals(gearOne,1);
        int count = 0;
        while(count <= 30){
            bike.accelerate();
            count ++;
        }

        int gearTwo = bike.getGearPosition();
        int speedTwo = bike.getSpeed();        
        
        

        Assertions.assertEquals(gearTwo,4);

//        Assertions.assertEquals(speedTwo,);
    }
//
//
//













}
