public class Bike {

     boolean isOn = false;

    int speed = 1;

    int gearPosition = 1;    




    public void turnOn(){

       isOn = true;  
    }

    public void turnOff(){

     isOn = false;

    }


    public boolean bikeIsOn(){
        return this.isOn;
    }



    public void accelerate(){

        if(isOn){

        speedRange();

          this.speed += gearPosition;
        }
        
    }  





    public void deccelerate(){

        if(isOn){

        speedRange();

          this.speed -= gearPosition;
       }

    }





    public int speedRange(){

        if(speed >= 0 && speed <= 20){
            
            return this.gearPosition = 1;
        }

       else if(speed <= 30){

            return this.gearPosition = 2;
        }


        else if(speed <= 401){

            return this.gearPosition = 3;
        }
//
       else if(speed >= 41){

            return this.gearPosition = 4;
        }

        return this.gearPosition;
    }

        



    public int getSpeed(){

        return this.speed;
    }





    public int getGearPosition(){

        return this.gearPosition;
    }



    


















}
