public class Ac {

    boolean on = false;

   int temperature = 16;

    
    public Ac(){
        
    }
    
    public void turnOn(){
        
        on = true;
    }

    public void turnOff(){

        on = false;        
    }

    public void setTemperature(int newTemperature){

        if(on && temperature >= 16 && temperature <= 30)
            this.temperature = newTemperature;          
       
        }   
    public void increaseTemperature() {

        if(on && temperature < 30)
            temperature ++;
    }

    public void decreaseTemperature() {

        if(on && temperature > 16)
            temperature --;
    }






















}
