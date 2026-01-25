public class AirConditioner{

    private boolean isOn;

    private String productName;

    private int temperature;





    public static void setTemperature(int newTemperature){

        this.temperature = newTemperature;
    }





    public static int getTemperature(){

        return temperature;
    }






    public static void setproductName(String newProductName){

        this.productName = newProductName;
    }





    public static String getProductName(){

        return productName;
    }




    public static void setIsOn(boolean newIsOn){

        this.isOn = newIsOn;
    }




    public static boolean getIsOn(){

        return isOn;
    }





    public static void decreasetemperature(){

        if(isOn && temperature <= 30 && temperature >= 16){

            temperature --;
        }

    }






    public static void increaseTemperature(){

        if(isOn && temperature >= 16 && temperature <= 30){

            temperature ++;
        }

    }




































}
