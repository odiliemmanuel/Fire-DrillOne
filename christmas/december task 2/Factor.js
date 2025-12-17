const prompt = require('prompt-sync')();

function factorOf(number){
    

  number = prompt("Enter any integer");
   
    factor = 0;

    for(count = 1; count <= number; count ++) {
        if(number % count == 0) {
          factor ++;

          
        }
       
        }
          

          return factor;  
    }


number = 0;
console.log(factorOf(number));
