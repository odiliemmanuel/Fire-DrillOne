function sumOfOdd(array, sum){

    for(count = 0; count < array.length; count ++){
        if(array[count] % 2 != 0){
            
            sum += array[count];
        }
    }

        return sum;
    }

array = [2, 5, 6, 8, 2, 9, 3];

sum = 0;

console.log(sumOfOdd(array, sum));

