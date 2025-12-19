def maximumAndMinimumOf(array, maximum, minimum):
    
    maximum = array[0];
    minimum = array[0];

    for count in range (0, len(array)):

        if(array[count] > maximum):
            maximum = array[count]               
   
        elif (array[count] < minimum):
            minimum = array[count];
   

    return [maximum, minimum];  
    

maximum = 0

minimum = 0

array = [2, 5, 8,  6, 7]

print(maximumAndMinimumOf(array, maximum, minimum))
