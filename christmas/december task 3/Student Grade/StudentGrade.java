import java.util.Scanner;
public class StudentGrade {



    public static void gradesOutput(int [][] grades, int numberOfStudents, int numberOfSubjects){
            Scanner input = new Scanner(System.in);

         for(int count = 0; count < numberOfStudents; count ++){
            for(int score = 0; score < numberOfSubjects; score ++){

                System.out.println("Entering score for student " + (count + 1));
                 System.out.println("Enter score for subject " + (score + 1));
                   int  scores =  input.nextInt();
                
                  grades [count][score] = scores;

                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successfully\n");
                
             }  
          
            System.out.println();
        }

//       return grades;

    }



    public static  int [] getTotal(int [][] grades){

        int [] totalGrades = new int [grades.length];
        int total = 0;

        for(int row = 0; row < grades.length; row ++){
            total = 0;
           for(int column = 0; column < grades[row].length; column ++){

                total += grades[row][column];

                totalGrades[row] = total;
           }
        }

            return totalGrades;
                
    }
    



    public  static double [] getAverage(int[][] grades){

            int[] total = getTotal(grades);
            double [] average = new double[grades.length];
    
        for(int count = 0; count < grades.length; count ++){

             average[count] = (double)total[count]/ grades[count].length;

        }

            return average;

        
    }




    public static int maximumScore(int [][] grades){
    
        int maximum = grades[0][0];

        for(int row = 0; row < grades.length; row ++){
            for(int column = 0; column < grades[row].length; column ++){

                if(grades[row][column] > maximum){
            
                    maximum = grades[row][column];
                }
            }
            
        }

        return maximum;
    }




    
    public static int minimumScore(int[][] grades){

        int minimum = grades[0][0];

        for(int row = 0; row < grades.length; row ++){
            for(int column = 0; column < grades[row].length; column ++){
            
                if(grades[row][column] < minimum){
                    
                    minimum = grades[row][column];
                }
            }
        }

            return minimum;
        
    }





    public static int[] positionRank(int[] total){

        int [] positions = new int[total.length];

        for(int pick = 0; pick < total.length; pick ++){
            
           int position = 1;

            for(int compare = 0; compare < total.length; compare ++){

                if(total[pick] < total[compare]){
                    position ++;
                }

                 positions[pick] = position;

            }
        }

            return positions;
    
    }


     



        public static  void output(int[][] grades){

            
            for(int student = 0; student < grades.length; student ++){

                System.out.printf("Student%1d\t",student + 1);

                for(int count : grades[student]){
                    System.out.print(count + "\t");
                }
               
                
                    int [] total = getTotal(grades);
                    double [] average = getAverage(grades);
                    int [] positions = positionRank(total);

                    System.out.printf("%d\t", total[student]);

                    System.out.printf("%.2f\t", average[student]);

                    System.out.println(positions[student]);
                                 
                    
            }

      }
    




     public static int classTotalScore(int[][] grades){
            int sum = 0;
            int [] total = getTotal(grades);

        for(int count : total){

            sum += count;
        }

          return sum;

     } 






    public static double classAverageScore(int [][] grades){
        
        int total = classTotalScore(grades);

        return (double) total/grades.length;
    }





    public static int getMaximumTotalScore(int[][] grades){

        int [] total = getTotal(grades);

        int maximum = total[0];

        for(int count = 0; count < total.length; count ++){
            if(total[count] > maximum)
            
            maximum = total[count];
            
        }

        return maximum;
    }







    public static int getMinimumTotalScore(int[][] grades){

        int [] total = getTotal(grades);

        int minimum = total[0];

        for(int count = 0; count < total.length; count ++){
            if(total[count] < minimum)
            
            minimum = total[count];
            
        }

        return minimum;
    }





    
    public static void subjectSummary(int[][] grades){

       
                int minimum = grades[0][0];
                int maximum = grades[0][0];
                int lowestIndex = 0;
                int largestIndex = 0;
                int total = 0;
                double average = 0.0;
                int pass = 0;
                int fail = 0;

            for(int count = 0; count < grades.length; count ++){
                maximum = grades[0][0];
                minimum = grades[0][0];
                total = 0;
                pass = 0;
                fail = 0;
                
                
                for(int index = 0; index < grades[count].length; index ++){
                    
                    total += grades[index][count];

                    if(grades[index][count] >= 50){
                         pass ++;
                     }

                     else{
                        fail ++;
                     }

                
                        if(grades[index][count] > maximum){
                            maximum = grades[index][count];
                            largestIndex = index;
                                
                            
                            
                         }   
                    
                        else if(grades[index][count] < minimum){
                            minimum = grades[index][count];
                            lowestIndex = index;
                        }

                  }   
                    average = total/grades.length;
                System.out.println("Subject " + (count +1));
                System.out.println("The highest scoring student is Student " + (largestIndex + 1) + " scoring " + maximum);
                System.out.println("The lowest scoring student is Student " + (lowestIndex + 1) + " scoring " + minimum);
                System.out.println("Total Score: " + total);
                System.out.println("Average Score: " + average);
                System.out.println("Number of Passes: " + pass);
                System.out.println("Number of Fails: " + fail);
                 

                System.out.println();         

               }

    }

































}
