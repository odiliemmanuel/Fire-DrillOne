    import java.util.Scanner;
        public class FindTwoLargest {
            public static void main(String...Odili) {

                Scanner input = new Scanner(System.in);

        int largest = 0;
        int secondLargest = 0;
        

         System.out.println("Enter Integer 1 ");
           int firstNumber = input.nextInt();
                largest = firstNumber;

        for(int count = 2; count <= 10; count ++){

            System.out.println("Enter Integer " + count +" :");
              int number = input.nextInt();

                if(number > largest){
                secondLargest = largest;
                largest = number;
                
            }           


        }

             System.out.println("The first Largest is " + largest);
             System.out.println("The Second Largest is " + secondLargest);
        

        }
            }
