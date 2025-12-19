def sum_of(array, suming):

    for count in range (0, len(array)):

        suming += array[count]
    

    return suming;
   

array = [5, 4, 3, 6, 7];

suming = 0;

print(sum_of(array, suming));
