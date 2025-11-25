    import java.util.Scanner;
        public class Comparator {
            public static void main(String...Odili) {
                Scanner input = new Scanner(System.in);

            System.out.println("Enter any first comparator number ");
                int number = input.nextInt();

            System.out.println("Enter any second comparator number ");
                int secondNumber = input.nextInt();

            if(number == secondNumber) {
                System.out.println("Value = 0");
            }

           else if(number > secondNumber) {
                System.out.println("Value = 1");
                }
            else{
                System.out.println("Value = -1");
                }
          
            }
        }
