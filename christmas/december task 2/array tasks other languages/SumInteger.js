function sumOf(array, sum) {

    for(count = 0; count < array.length; count ++) {

        sum += array[count];
     }

    return sum;
    }

array = [5, 4, 3, 6, 7];

sum = 0;

console.log(sumOf(array, sum));
