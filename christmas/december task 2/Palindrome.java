import java.util.Scanner;
    public class Palindrome {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

        int number = 0;
        System.out.println(isPalindrome(number));
    

        }
    public static boolean isPalindrome(int number){
      Scanner input = new Scanner(System.in);


        System.out.println("Enter any Number");
           number = input.nextInt();

        int originalNumber = number;
        int reverse = 0;
        int digit = 0;
        
        while(number != 0){

          digit =  number % 10;
         reverse = reverse * 10 + digit;
         number = number  / 10;

        }         
       
        return originalNumber == reverse ? true : false;       

       }
   
    }
