const prompt = require('prompt-sync')();

function isPrime(number){


  number = prompt("Enter any Integer");
     

    factor = 0;
    result = 0;

    for(count = 2; count <= number; count ++) {
        if(number % count == 0) {
          result = number / count;
            factor += count;
            
            
            if(result  == 1) {
               return true;                
            }

             return false;
             }

            
            }

           

                
               
    }


number = 0;

console.log(isPrime(number));
