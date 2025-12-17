def factorOf(number):
    
    number = int(input("Enter any integer "))
   
    factor = 0

    for count in range(1, number +1):
        if(number % count == 0):
            factor += 1


    return factor 
  


number = 0

print(factorOf(number));
