def odd_numbers_in(array, number):

    number = ""

    for count in range (0, len(array)):
        if(array[count] % 2 != 0):

            number += str(array[count]) + ", ";


    return [number];
        

array = [2, 4, 7, 5, 8, 3]

number = ""

print(odd_numbers_in(array, number))
