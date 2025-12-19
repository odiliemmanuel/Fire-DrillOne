function oddNumbersIn(array, number) {

        number = "";

    for(count = 0; count < array.length; count ++) {
        if(array[count] % 2 != 0) 

           number += array[count] + ", ";

     }


            return [number];
        
    }  

array = [2, 4, 7, 5, 8, 3];

number = "";

console.log(oddNumbersIn(array, number));
