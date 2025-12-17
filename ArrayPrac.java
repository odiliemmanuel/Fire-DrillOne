import java.util.Arrays;
    public class ArrayPrac {
        public static void main(String...Odili){

        int [] array = { 12,10, 79, 27};
        int number = 79;
        
        int result = checkingIndex(array, number);

//        System.out.println(Arrays.toString(checkingIndex(number)));

        System.out.print("The result is: " + result);
      }

        public static int checkingIndex(int [] array, int number){

        for(int index = 0; index <= array.length - 1; index ++){
            if(array[index] == number)
                return index;
               
            
        }


        return -1;

        }


        }
