    import java.util.Scanner;
        public class Tasks {
            public static void main(String...Odili){
               

                System.out.print(sumDigit(12345));
            }

                public static int sumDigit(int number){
                                
                 int separator = 0;
                int sum = 0;
                
                
                while (number > 0) {                
                separator = number % 10;
                sum += separator;
               
                number= number / 10;

           
              }
               return sum;
    
                }




        }

























