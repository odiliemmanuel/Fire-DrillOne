import math
def square_numbers_in(array, square):

    for count in range (0, len(array)):
         
        spact = int(math.sqrt(array[count]))

        if(spact * spact == array[count]):

                square += str(array[count]) + ", "
            
    return [square];

  


array = [25, 125, 7, 49, 100, 3, 5]

square = ""

print(square_numbers_in(array, square))            

