public class BinaryConversion {
    public static void main(String...Odili){
    


    }



    public static void userInput(String number, int base, int newBase){

        
        String[] digits = number.split("");
        int[]arrayOfDigits = new int[number.length()];


        int convert = 0;


        for(int count = 0; count < arrayOfDigits.length; count ++){
       
            convert = Integer.parseInt(digits[count]); 

            arrayOfDigits[count] = convert;

           
        }
           


        return arrayOfDigits;
    
   }





    
    
    public static int mathDotPower(int numberOne, int numberTwo){

        int result = 1;
    
        for(int count = 0; count < numberTwo; count ++){
            
            result *= numberOne;

          
        }

        return result;
        
    }









     public static int conversionToBaseTen(String number, int base, int newBase){

        int divisor = 2;

        int multiplier = 0;

        int result = 0;

        int calculation = 0;

        int[] arrayOfDigits = calculationToGetEachDigit(number, base, newBase);

        for(int count = 0; count <= arrayOfDigits.length - 1; count++){
            
            multiplier = mathDotPower(divisor, arrayOfDigits.length - 1 - count);
           
            calculation = arrayOfDigits[count] * multiplier;

            result += calculation;
    
        }
        
        return result;

    }







//    public static S






 
//    }

        



































}
