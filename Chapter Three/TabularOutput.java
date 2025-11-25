    import java.util.Scanner;    
    public class TabularOutput {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

       
    int number = input.nextInt();
    int square = input.nextInt();
    int cubes = input.nextInt(); 
    int fourthRoot = input.nextInt();
 System.out.print("N1     N2      N3     N4  ");
     System.out.printf("%s     %s     %s    %s%n", number,   square,   cubes, fourthRoot);
    
    System.out.printf("%d     %d       %d        %d%n",  1,       1*1,     1*1*1,    1*1*1*1);
    System.out.printf("%d     %d       %d        %d%n",  2,       2*2,     2*2*2,     2*2*2*2);
    System.out.printf("%d     %d       %d       %d%n",   3,       3*3,      3*3*3,   3*3*3*3);
    System.out.printf("%d     %d       %d       %d%n",  4,       4*4,       4*4*4,   4*4*4*4);
    System.out.printf("%d     %d       %d       %d%n",  5,       5*5,        5*5*5,          5*5*5*5);
        


        }
    }
