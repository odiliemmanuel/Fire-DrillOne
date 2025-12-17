import java.util.Arrays;
public class SumAndSquareArray {
    public static void main(String...Odili) {


    int [] myList = {48, 36, 10, 19, 12, 17};

    for(int index = 0; index < myList.length; index ++){
        if(myList[index] % 2 == 0){
            myList[index] *= myList[index];
        }

        else if (myList[index] % 2 != 0){
            myList[index] += 1;
        } 
           

    }



     System.out.println(Arrays.toString(myList));




    }
}
