const prompt = require('prompt-sync')();

function division(firstNumber, secondNumber) {
  
    firstNumber = prompt("Enter first integer"); 

    secondNumber = prompt("Enter second integer");


    result = firstNumber/secondNumber;
//
        return result == 0 ? 0 : result;
 }

let firstNumber = 0;

let secondNumber = 0;

console.log(division(firstNumber, secondNumber));
