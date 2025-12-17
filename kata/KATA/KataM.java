public class KataM {

    public static boolean evenNumbers(int number) {                
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    public static int differenceInNumbers(int firstNumber, int secondNumber){
        int differenceOfIntegers = Math.abs(firstNumber - secondNumber);
        return differenceOfIntegers; 
    }

    public static int factorOfInteger(int number){                     
        int totalOfFactor = 0;
        for(int count = 2; count <= number; count ++){
            if(number % count == 0){
                totalOfFactor += 1;
            }
            if(number / number == 1) {
              System.out.print(number);
            }
        }
        return totalOfFactor; 
    }

    public static float quotientNumber(float firstNumber, float secondNumber){         
        float quotient = firstNumber / secondNumber;            
        if(secondNumber == 0){
            return 0;
        }
        return quotient;
    }

    public static int squareOfNumber(int number){
        int square = number * number;
        return square;  
    }

    public static boolean reverseNumber(int number) {
        int first = number / 10000;
        int second = (number / 1000) % 10;
        int third = (number / 100) % 10;
        int fourth = (number / 10) % 10;
        int fifth = number % 10;

        if (first == fifth && second == fourth){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean squareNumber(int number) {
        for (int count = 1; count * count <= number; count++) {
            if (count * count == number) {
                return true;
            }
            
        }
      return false;
    }



    
        public static long factorialNumber(long number){
            
             int factorial = 1;
        for(int count = 1; count <= number; count ++){
            factorial *= count;
        }
           return factorial;
        


        }
    
        




        public static boolean perfectNumber(int number) {

            int sumFactor = 0;

        for(int count = 1; count < number; count ++){
            if (number % count == 0){
                    sumFactor += count;
                }
        }
               return sumFactor == number;
                    
          
        }

                   
            public static int addition(int number){
            
          
                int separator = 0;
               int sum = 0;
                while(number > 0){

                separator += number % 10;
                number /= 10;
                
                
            }
                return separator;
            }
                public static int sumDigit(int number){
                                
                 int separator = 0;
                int sum = 0;
                
                
                while (number > 0) {                
                separator = number % 10;
                sum += separator;
               
                number= number / 10;

           
              }
                System.out.println("Sum of digits = " + sum);

    
                }
              
                
           
            
            
















}





















