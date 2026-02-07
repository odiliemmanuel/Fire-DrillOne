package Java.christmas.tasks;

import java.util.Scanner;
    public class LargestSmallestNum {
        public static void main(String...Odili) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter any number of your choice, press(0) to stop ");
            int number = input.nextInt();

            int stop = 1;
            int largest = number;
            int smallest = 0;


        while(number != stop) {
         System.out.println("Enter any number of your choice, press(0) to stop ");
            number = input.nextInt();
        }

        if(number > largest){
             largest = number;
        System.out.println("The Largest Number is " + largest);
        }
        
         else {
        System.out.println("The Smallest  Number is " + smallest );
        System.out.println("The Largest Number is " + largest);
        }
           number ++;

        }
    }
