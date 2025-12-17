import java.util.Scanner;
    public class Square { 
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);
            int number = 0;
            System.out.println(isSquare(number));
        }

        public static boolean isSquare(int number){
            Scanner input = new Scanner(System.in);

        System.out.println("Enter any integer ");
            number = input.nextInt();
                int result = 0;
    
            for(int count = 1; count <= number; count ++){     
                if(count * count  == number){
                    return true;
                }     
          
             }

            return false;
        }
    }



