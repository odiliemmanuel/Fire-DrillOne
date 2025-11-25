import java.util.Scanner;
import java.util.Random;

    public class RandomNumber {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            Random random = new Random();

        int maximum = 12;
        int minimum = 1;

    int randomNumber = random.nextInt((maximum - minimum) + 1);

   

        int number = 0;


        while(number != randomNumber){
         
    System.out.println("Enter and guess my number ");
         number = input.nextInt();
        

        if(number > randomNumber){
            System.out.println("Too high, guess again");
        }
        if(number < randomNumber) {
            System.out.println("Too low, guess again");

    }
        if(number == randomNumber) {
            System.out.println("Congrats Ugo, play again sometime 😊️");
        }
       
    
        }
}
    }
