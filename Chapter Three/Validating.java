    import java.util.Scanner;
        public class Validating {
            public static void main(String...Odili){
                Scanner input = new Scanner(System.in);

            int guessOne = 2;
            int guessTwo = 1;
          

                int number = 0;
        while(number != guessOne || number != guessTwo){
            System.out.println("Enter any of my correct values between 1 - 20 ");
             number = input.nextInt();
               
           if(number == guessOne || number == guessTwo){;
                   System.out.println("You entered one of my correct value, Congrats🥳️");break;
                }

        }
             

            }
        }
