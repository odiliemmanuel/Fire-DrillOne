        import java.util.Scanner;
        public class PrimeNumber {

            public static void main(String...Odili) {
                Scanner input = new Scanner(System.in);
        

                    primeFactor();

        }

              public static boolean primeFactor(){
                 Scanner input = new Scanner(System.in);

                    System.out.println("Enter any number ");
            int number = input.nextInt();

        int factor = 0;
        for(int count = 2; count <= number; count ++){
            while(number % count == 0){
                number = number / count;
                factor = factor + count;

                if(number % count == 1){
                return true;
                }
            }

        }

    
                }




    }
