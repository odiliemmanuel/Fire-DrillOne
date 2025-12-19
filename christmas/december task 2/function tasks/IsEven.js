const prompt = require('prompt-sync')();
  
function evenNumber(number){
 
   number = prompt("Enter any integer ");
       
    if(number % 2 == 0){
        return true;
    }
    
    else{
        return false;
    }

}
number = 0;

console.log(evenNumber(number));

