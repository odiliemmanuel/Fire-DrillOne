def isPrime(number):

    number = int(input("Enter any Integer"))
     
    factor = 0;
    result = 0;

    for count in range(2, number + 1):
        if(number % count == 0):
            result = number / count
            factor += count
            
            if(result  == 1):
                return True;                
           
            return False;
              


number = 0;

print(isPrime(number));
