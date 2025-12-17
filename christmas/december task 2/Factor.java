import java.util.Scanner;
    public class Factor {
        public static void main(String...Odili) {

            int number = 0;
        System.out.println(factorOf(number));
        }

    public static int factorOf(int number){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any integer");
            number = input.nextInt();

            int factor = 0;

        for(int count = 1; count <= number; count ++) {
            if(number % count == 0) {
              factor ++;

              
            }
           
        }
          

          return factor;  
    }


    }
