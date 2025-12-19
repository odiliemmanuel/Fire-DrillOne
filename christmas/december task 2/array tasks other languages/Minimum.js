function minimumIn(array, smallest) {

        smallest  = array[0];
        
        

    for(count = 1; count < array.length; count ++) {
        if(array[count] < smallest ) {

            smallest = array[count]; 
            
        }

           
        }

        return smallest;
        
   }

let  array = [9, 7, 2, 1];

smallest = 0;

console.log(minimumIn(array, smallest));
