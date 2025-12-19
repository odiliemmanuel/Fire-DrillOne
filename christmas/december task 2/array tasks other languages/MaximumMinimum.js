function maximumAndMinimumOf(array,maximum,minimum){
            
            maximum = array[0];
            minimum = array[0];
    
        for(count = 1; count < array.length; count ++) {

            if(array[count] > maximum) {
                maximum = array[count];

            }                
           
            else if(array[count] < minimum) {
                minimum = array[count];
            }

          
        }
            return [maximum, minimum];  
            
            
    }


maximum = 0;

minimum = 0;

array = [2, 5, 8,  6, 7]

console.log(maximumAndMinimumOf(array, maximum, minimum));
