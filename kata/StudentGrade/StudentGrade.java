package Java.kata.StudentGrade;

public class StudentGrade{
    private int[][] grades;

    

public StudentGrade(int[][] grades){
    this.grades = grades;
}



    public int getMinimum(){
        int minimum = grades[0][0];

        for(int[] row : grades) { 
           for(int column : row) {

                if(column < minimum)
                  minimum = column;            
           }
        }

        return minimum;

    }



    public int getMaximum(){

        int maximum = grades[0][0];

        for(int[] row : grades){
           for(int column : row){

             if(column > maximum)
                maximum = column;
    
           }
        }

        return maximum;
    }



    public double getAverage(){

            int total = 0;        
        for(int[] grade : grades){
            for(int sum : grade)
            total += sum;
        }

       return (double) total / grades.length;

        
    }


    public void barChart() {
        int [] frequency = new int[11];

        for(int[] rowGrade : grades){
           for(int columnGrade : rowGrade){
              ++frequency[columnGrade/10];
           }
        }

        for(int rate = 0; rate < frequency.length; rate ++){ 
            if(rate == 10){
                System.out.print("100");
            }

            else{
                System.out.printf("%2d-%2d: ", rate * 10, rate * 10 + 9);
            }

            for(int star = 0; star < frequency[rate]; star ++){
                System.out.print("*");
            }

            System.out.println();
        }
    }



    public void gradeProccessing(){
        for(int students = 0; students < grades.length; students ++){ 

            System.out.printf("Student %d: %4d%n", students+1, grades[students]);
        }
    }



































}
