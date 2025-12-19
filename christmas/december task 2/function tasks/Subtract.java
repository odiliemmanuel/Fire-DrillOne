import java.util.Scanner;
    public class Subtract {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

            int firstNumber = 0;
            int secondNumber = 0;
            System.out.println(subtraction(firstNumber, secondNumber));
        
        }
        
        public static int subtraction(int firstNumber, int secondNumber){
            Scanner input = new Scanner(System.in);
            int swap = 0;

            System.out.println("Enter Integer 1");
               firstNumber = input.nextInt();

            System.out.println("Enter Integer 2");
               secondNumber = input.nextInt();


                if(firstNumber < secondNumber) {
                   swap = firstNumber;
                    firstNumber = secondNumber;
                    secondNumber = swap; 
                 
                }
    
                return firstNumber - secondNumber;

                
        }
    }    

