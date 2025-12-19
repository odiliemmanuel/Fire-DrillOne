import java.util.Scanner;
    public class PositiveInteger {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    System.out.println("Enter a Positive Number ");
        int number = input.nextInt();
        
       int division = (int) number / number;

    if(division != 1){
        System.out.println( number + " is not a prime number");
    }
    else if(number % 2 == 0){
        System.out.println(number + " is not a prime number, it is even");
    }

    else{
        System.out.println(number + " is a prime number");
        }
        }
    }
