def subtraction(firstNumber, secondNumber):
    swap = 0

    firstNumber = int(input("Enter Integer "))
      
    secondNumber = int(input("Enter Integer "))
       


    if(firstNumber < secondNumber):
        swap = firstNumber;
        firstNumber = secondNumber;
        secondNumber = swap; 
     
       

    return firstNumber - secondNumber;         


firstNumber = 0
secondNumber = 0
print(subtraction(firstNumber, secondNumber))
        
        
