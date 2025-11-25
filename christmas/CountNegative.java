import java.util.Scanner;
    public class CountNegative {
        public static void main(String... Ejeh) {
        
    Scanner input = new Scanner(System.in);


    String condition = "No";
    String answer = " ";
    int countPositive = 0;
    int countNegative = 0;
    int countZero = 0;
    
    


    do{
        System.out.println("Enter any number ");
            int number = input.nextInt();

        if(number > 0) {
            countPositive ++;
        }
        
        else if (number < 0) {
            countNegative ++;
        }

        else {
            countZero ++;
        }
        
        System.out.println("Do you want to continue, enter(Yes or No) ");
            answer = input.next();
        }

        while (!condition.equals(answer));

        System.out.println("The count of Positive numbers is " + countPositive);
        System.out.println("The count of Negative numbers is " + countNegative);
        System.out.println("The count of Zero numbers is " + countZero);
        }
    }
