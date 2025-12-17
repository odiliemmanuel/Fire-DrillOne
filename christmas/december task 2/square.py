def isSquare(number):
    number = int(input("Enter any integer "))
           
    result = 0
    
    for count in range (1, number + 1):     
        if(count * count  == number):
            return True
        

        return False
      
    
number = 0
print(isSquare(number))
 
