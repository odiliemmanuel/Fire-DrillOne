package Java.christmas.decemberTask3.Ac;

public class Ac {

    boolean on = false;

   int temperature = 16;


    public void turnOn(){
        
        on = true;
    }

    public void turnOff(){

        on = false;        
    }

    public boolean acIsOn(){

        return this.on;
    }

    public  int increaseTemperature() {

        if(on && temperature >= 16 && temperature <= 30){
            return temperature ++;
        }

        return temperature;
    }

    public int decreaseTemperature() {

        if (on && temperature >= 16 && temperature <= 30) {
            return temperature -= 1;
        }

        return temperature;
    }


    public int getTemperature() {

            return temperature;
    }


}
