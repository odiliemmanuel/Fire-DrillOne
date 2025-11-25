// A program that that calculate and display the miles per gallon obtained for each trip
// print combined miles per gallon obtained for all trips up to point
 
   import java.util.Scanner;
        public class GasMilage {
            public static void main(String...Odili) {

                Scanner input = new Scanner(System.in);
    String stop = "Yes";
    String answer = " ";
    float sum = 0;

             System.out.println("Enter for trip 1 ");
                        float milesPerGallon = input.nextFloat();



        while (answer != stop) {

             System.out.println("Do you wanna stop ");
                    answer = input.nextLine();
             System.out.println("Enter for trip 2 ");
                 milesPerGallon = input.nextFloat();
               
        
            sum += milesPerGallon;

        System.out.println("The total miles per gallon obtained from each trip " + sum);

            }
        }
}
