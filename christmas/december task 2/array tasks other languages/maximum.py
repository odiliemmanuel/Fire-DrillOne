def maximumIn(array, largest):

    largest  = array[0]
        
    for count in range (1, len(array)):

        if(array[count] > largest ):

            largest = array[count];    

    return largest;
        
   

array = [9, 7, 2, 1];

largest = 0;

print(maximumIn(array, largest));
