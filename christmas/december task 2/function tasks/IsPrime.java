import java.util.Scanner;
    public class IsPrime {
        public static void main(String...Odili) {
           Scanner input = new Scanner(System.in);

           int number = 0;
           System.out.print(isPrime(number));

        }
            

            public static boolean isPrime(int number){

                Scanner input = new Scanner(System.in);

                System.out.println("Enter any Integer");
                  number = input.nextInt();

                int factor = 0;
                int result = 0;

                for(int count = 2; count <= number; count ++) {
                    if (number % count == 0) {
                        result = number / count;
                        factor += count;

                    }
                    if (result == 1) {
                        return true;
                    }
                }

                   return false;


                     }



            }

