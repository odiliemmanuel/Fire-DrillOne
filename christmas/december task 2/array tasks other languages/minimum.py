def minimumIn(array, smallest):

    smallest  = array[0]
        
    for count in range (0, len(array)):
        if(array[count] < smallest ):

            smallest = array[count]
            

    return smallest
        
array = [9, 7, 2, 1]

smallest = 0

print(minimumIn(array, smallest))
