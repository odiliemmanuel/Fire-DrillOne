def no_of_even__numbers_in(array, length):

    number = "";

    for count in range (0, len(array)):
        if(array[count] % 2 == 0):

            number += str(array[count])

            length = len(number)
       
    
    return length

array = [2, 3, 1, 7, 5, 6, 9, 4]

length = 0

print(no_of_even__numbers_in(array, length))
