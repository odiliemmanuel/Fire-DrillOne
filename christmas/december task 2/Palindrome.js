const prompt = require('prompt-sync')();

function isPalindrome(number){

   number = prompt("Enter any Number");
          
        originalNumber = number;
        reverse = 0;
        digit = 0;
        
        while(number != 0){

          digit =  number % 10;
         reverse = reverse * 10 + digit;
         number = number  / 10;  
       
      }    



             if(originalNumber == reverse) {
            return true;
            }
            return false;
        

    
    }
  
number = 0;

console.log(isPalindrome(number));
    

