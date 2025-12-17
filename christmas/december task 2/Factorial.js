const prompt = require('prompt-sync')();

function factorialOf(number) {
       
    number = prompt("Enter any number");

        result = 1;
     for(count = 1; count <= number; count ++) {
        
       result *= count;
       
     }
    return result;    

}



number = 0;

console.log(factorialOf(number));
    
