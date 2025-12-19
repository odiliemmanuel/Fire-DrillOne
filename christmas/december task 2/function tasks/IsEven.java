import java.util.Scanner;   
     public class IsEven {
        public static void main(String...Odili) {
         
        
            System.out.println(evenNumber(2));


        }

        public static boolean evenNumber(int number){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter any integer");
                 number = input.nextInt();

            if(number % 2 == 0){
                return true;
            }
            
            else{
                return false;
            }

        }


    }
