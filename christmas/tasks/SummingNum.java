import java.util.Scanner;
    public class SummingNum {
        public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


     String condition = "No";
     String answer = " ";

    do{
        System.out.println("Enter Two Integers ");
            int firstInteger = input.nextInt();
            int secondInteger = input.nextInt();

        int sum = firstInteger + secondInteger;
         
    System.out.println("The sum is " + sum + " Do you wish to perform this operation again (Enter Yes or No)");
    answer = input.next();
    }

    while(!condition.equals(answer));

  
    }
        }
