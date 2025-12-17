import java.util.Arrays;    
    public class ArrayTaskTwo {
        public static void main(String...Odili) {


        int [] myList = {65, 36, 10, 19, 12, 17};
            int largest = myList[0]; 
            int smallest = myList[0];
            int largestIndex = 0;
            int smallestIndex = 0;
            int index = 0;

        for(index = 0; index < myList.length; index ++){
            if(myList[index] > largest){

                largest = myList[index];
                largestIndex = index;
                 
            }  
            
            else if (myList[index] < smallest){
                smallest = myList[index];
                smallestIndex = index;
            }
            
          
           }
          System.out.println(largestIndex + " " + smallestIndex);
        }
    }
