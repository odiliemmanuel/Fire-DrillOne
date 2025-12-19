const prompt = require('prompt-sync')();

function  isSquare(number){
    number = prompt("Enter any integer ");
           
    result = 0;
    
    for(count = 1; count <= number; count ++){     
        if(count * count  == number){
            return true;
        }     
          
             }

            return false;
        }
    
number = 0;
console.log(isSquare(number));
 
