const prompt = require('prompt-sync')();
 
function subtraction(firstNumber, secondNumber){
    
    swap = 0;

    firstNumber = prompt("Enter Integer ");
      
    secondNumber= prompt("Enter Integer ");
       


    if(firstNumber < secondNumber) {
       swap = firstNumber;
        firstNumber = secondNumber;
        secondNumber = swap; 
     
        }

       return firstNumber - secondNumber;       
}   


firstNumber = 0;
secondNumber = 0;
console.log(subtraction(firstNumber, secondNumber));
        
        
