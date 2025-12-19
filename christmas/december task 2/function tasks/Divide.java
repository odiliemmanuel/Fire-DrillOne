import java.util.Scanner;
    public class Divide {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);


        int firstNumber = 0;
        int secondNumber = 0;
        System.out.println(division(firstNumber, secondNumber));
    
        }

        public static float division(int firstNumber, int secondNumber) {
            Scanner input = new Scanner(System.in);

    System.out.println("Enter first integer");
        firstNumber = input.nextInt();

    System.out.println("Enter second integer");
        secondNumber = input.nextInt();

        int result = firstNumber/secondNumber;

//        if(result  == 0){
//        return 0;
//            }
//
//         else{
//            return result;
//        }



        return result == 0 ? 0 : result;
            
        }
    

    }
