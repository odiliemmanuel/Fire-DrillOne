    import java.util.Scanner;  
  public class PerfectNumber {
        public static void main(String...Odili){
            Scanner input = new Scanner(System.in);
        
            System.out.println("Enter any number ");
                int number = input.nextInt();
            int factor = 1;
        
        for(int count = 2; count <= number; count ++){
                if(number % count == 0){
                    factor += count;
                    number = number / count;
                
               if (factor == number){

                   System.out.print("Perfect Number"); 
                }
                 
                

                }
           }
        }
    }
