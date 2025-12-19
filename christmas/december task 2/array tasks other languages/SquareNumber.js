function squareNumbersIn(array, square) {

    for(count = 0; count < array.length; count ++) {
         
        spact = Math.floor(Math.sqrt(array[count]));

        if(spact * spact == array[count])

                square += array[count] + ", ";
            }
            return [square];

    }


array = [25, 125, 7, 49, 100, 3, 5];

square = "";

console.log(squareNumbersIn(array, square));            

