import java.util.Scanner;
    public class LogisticService {
        public static void main(String...Odili) {

            Scanner input = new Scanner(System.in);
            

           System.out.println(logisticService(80));

               
        }

        public static int logisticService(int successfulDelivery) {

            
                int basePay = 5000;

                int lessThanFifty = 160;
                int fiftyToFiftyNine = 200;
                int sixtyToSixtyNine = 250;
                int seventyAndAbove = 500;

               if(successfulDelivery >= 70){
              int wage = successfulDelivery * seventyAndAbove + basePay;
                System.out.println("Wage is " + wage);

                }

            else if (successfulDelivery >= 60 && successfulDelivery <= 69){
               int  wage = successfulDelivery * sixtyToSixtyNine + basePay;
                System.out.println("Wage is " + wage);
            }
            
            else if(successfulDelivery >= 50 && successfulDelivery <= 59) {
                int wage = successfulDelivery * fiftyToFiftyNine + basePay;
                System.out.println("Wage is " + wage);
            }

            else{
                int wage = successfulDelivery * lessThanFifty + basePay;
                System.out.println("Wage is " + wage);
            }
            
            return successfulDelivery;
    
        }

    }
