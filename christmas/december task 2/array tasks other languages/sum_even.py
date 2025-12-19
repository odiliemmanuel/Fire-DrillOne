def sumOfEven(array, suming):

    for count in range (0, len(array)):
        if(array[count] % 2 == 0):
            
            suming += array[count]    

    return suming
    

array = [2, 5, 6, 8, 2, 9, 3]

suming = 0

print(sumOfEven(array, suming))

