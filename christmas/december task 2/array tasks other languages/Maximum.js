
function maximumIn(array, largest) {

        largest  = array[0];
        
        

    for(count = 1; count < array.length; count ++) {
        if(array[count] > largest ) {

            largest = array[count]; 
            
        }

           
        }

        return largest;
        
   }

let  array = [9, 7, 2, 1];

largest = 0;

console.log(maximumIn(array, largest));
