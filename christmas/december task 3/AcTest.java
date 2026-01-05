public class AcTest {
    public static void main(String...Odili){

    Ac myAc = new Ac();
    myAc.setTemperature(21);

     myAc.turnOn();
        for(int count = 1; count <= 5; count ++) {
        myAc.increaseTemperature();
    }
//        

        System.out.println("The AC is at " + myAc.temperature);

    }



}
