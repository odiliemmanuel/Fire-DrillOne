
public class KataArrays {
   
   
//
        public static  String[] squareNumbersIn(int [] array, String square) {
            for(int count = 0; count < array.length; count ++) {
                 
                int spact = (int) Math.sqrt(array[count]);
        
                if(spact * spact == array[count])

                square += array[count] + " ,";
            }
            return new String[] {square};

    }
//            


        
//        
//    public static String[] oddNumbersIn(int [] array, String number) {
//
//        number = "";
//        for(int count = 0; count < array.length; count ++) {
//            if(array[count] % 2 != 0) 
//
//               number += array[count] + ",";
//
//         }
//
//
//            return new String[] {number};
//        
//    }  
    




//    public static String[] evenNumbersIn(int [] array, String number) {
//
//        number = "";
//        for(int count = 0; count < array.length; count ++) {
//            if(array[count] % 2 == 0) 
//
//               number += array[count] + ",";
//
//         }
//
//
//            return new String[] {number};
//        
//    }  


  

//    public static int noOfEvenNumbersIn(int [] array, int length) {
//
//        String number = "";
//
//        for(int count = 0; count < array.length; count ++) {
//            if(array[count] % 2 == 0) {
//
//                number += String.valueOf(array[count]);
//
//                int  length = number.length();
//            }
//        
//           
//        }
//
//        return length;
//    }




//    public static int noOfOddNumbersIn(int [] array, int length) {
//
//        String number = "";
//
//        for(int count = 0; count < array.length; count ++) {
//            if(array[count] % 2 != 0) {
//
//                number += String.valueOf(array[count]);
//
//                 length = number.length();
//            }
//        
//           
//        }
//
//        return length;
//    }



//    public static int[] maximumAndMinimumOf(int [] array, int maximum, int minimum){
//            
//            maximum = array[0];
//            minimum = array[0];
//    
//        for(int count = 1; count < array.length; count ++) {
//
//            if(array[count] > maximum) {
//                maximum = array[count];
//
//            }                
//           
//            else if(array[count] < minimum) {
//                minimum = array[count];
//            }
//
//          
//        }
//            return new int[] {maximum, minimum};  
//            
//            
//    }



//    public static int sumOfOdd(int [] array, int sum) {
//
//        for(int count = 0; count < array.length; count ++) {
//            if(array[count] % 2 != 0) {
//             
//                sum += array[count];            
//                
//            }
//        }
//
//        return sum;
//   }
//



//    public static int sumOfEven(int [] array, int sum){
//
//        for(int count = 0; count < array.length; count ++){
//            if(array[count] % 2 == 0){
//                
//                sum += array[count];
//            }
//        }
//
//        return sum;
//    }



//    public static int sumOf(int[] array, int sum) {
//        
//        for(int count = 0; count < array.length; count ++) {
//            
//            sum += array[count];
//        }
//
//        return sum;
//    }




//
//    public static int minimumIn(int [] array, int smallest){
//        
//        smallest = array[0];
//
//        for(int count = 1; count < array.length; count ++) {
//            if(array[count] < smallest){
//                smallest = array[count];
//            }
//        }
//            return smallest;
//    }
//





//    public static int maximumIn(int [] array, int largest) {
//
//         largest = array[0];
//        int largestIndex = 0;
//        
//
//        for(int count = 1; count < array.length; count ++) {
//            if(array[count] > largest) {
// 
//                largest = array[count]; 
//                largestIndex = count;
//            }
//
//           
//        }
//        return largest;
//        
//   }
//




}    
