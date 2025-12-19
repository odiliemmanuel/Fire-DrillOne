def factorialOf(number):
       
    number = int(input("Enter any number"))

    result = 1
    for count in range(1, number + 1):
        result *= count
      
    return result;    


number = 0;

print(factorialOf(number))
    
