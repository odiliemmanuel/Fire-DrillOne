function noOfEvenNumbersIn(array, length) {

   number = "";

    for(count = 0; count < array.length; count ++) {
        if(array[count] % 2 == 0) {

            number += String(array[count]);

             length = number.length;
        }
    
       
    }

    return length;
}

array = [2, 3, 1, 7, 5, 6, 9, 4];

length = 0;

console.log(noOfEvenNumbersIn(array, length));
