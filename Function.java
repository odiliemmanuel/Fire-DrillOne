    public class Function {
               
         public static int perfectNumber(int number){
            int divisor = 1;
            for(int count = 1; count <= number; count++) {
            if(number % count == 0){
                divisor = divisor + count;
                System.out.print(number);
            }
                System.out.print(divisor);
    
       }


          }

    }



