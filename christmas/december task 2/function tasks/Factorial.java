import java.util.Scanner;
    public class Factorial {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

            int number = 0;
    
            System.out.println(factorialOf(number));
        }


        public static long factorialOf(int number) {
            Scanner input = new Scanner(System.in);

        System.out.println("Enter any number");
           number = input.nextInt();
        
            int result = 1;
         for(int count = 1; count <= number; count ++) {
            
           result *= count;
           
         }
        return result;    

    }

    }
