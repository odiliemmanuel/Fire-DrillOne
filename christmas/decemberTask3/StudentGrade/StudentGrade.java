package Java.christmas.decemberTask3.StudentGrade;

import java.util.Scanner;
public class StudentGrade {



    public static void gradesOutput(int [][] grades, int numberOfStudents, int numberOfSubjects){
            Scanner input = new Scanner(System.in);

         for(int count = 0; count < numberOfStudents; count ++){
            for(int score = 0; score < numberOfSubjects; score ++){

                System.out.println("Entering score for student " + (count + 1));
                 System.out.println("Enter score for subject " + (score + 1));
                   int  scores =  input.nextInt();

                while(scores < 0 || Integer.toString(scores).isEmpty()){
                    System.out.println("Invalid Input");
                      
                       scores =  input.nextInt();
                }
                
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





    public static void maximumScore(int [][] grades){

        
                int studentIndex = 0;
                int subjectIndex = 0;
//             
// These variables are to be used to get the index of the largest  score for the student and the subject from the whole scores inputed and not a specific row or column.
    
        int maximum = grades[0][0];

        for(int row = 0; row < grades.length; row ++){
            for(int column = 0; column < grades[row].length; column ++){

                if(grades[row][column] > maximum){
            
                    maximum = grades[row][column];
                    studentIndex = row;
                    subjectIndex = column;
                }
            }
            
        }

        System.out.println("The overall Highest score is scored by Student " + (studentIndex + 1) + " in subject " + (subjectIndex + 1) + " scoring " + maximum) ;
        
    }




    
    public static void minimumScore(int[][] grades){

       
                int studentIndex = 0;
                int subjectIndex = 0;
           
// These variables are to be used to get the index of the smallest score for the student and the subject from the whole scores inputed and not a specific row or column.
    
        int minimum = grades[0][0];

        for(int row = 0; row < grades.length; row ++){
            for(int column = 0; column < grades[row].length; column ++){

                if(grades[row][column] < minimum){
            
                    minimum = grades[row][column];
                    studentIndex = row;
                    subjectIndex = column;
                }
            }
            
        }

        System.out.println("The overall Lowest score is scored by Student " + (studentIndex + 1) + " in subject " + (subjectIndex + 1) + " scoring " + minimum) ;
        
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
    




     public static void classTotalScore(int[][] grades){
            int sum = 0;
            int [] total = getTotal(grades);

        for(int count : total){

            sum += count;
        }

          System.out.println("The class total score is: " + sum);

     } 






    public static void classAverageScore(int [][] grades){
        
            int sum = 0;
            int [] total = getTotal(grades);

            for(int count : total){

                sum += count;
             }


        System.out.println("The class average score is: " + (double) sum/grades.length);

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

            for(int count = 0; count < grades[0].length ; count ++){
                maximum = grades[0][0];
                minimum = grades[0][0];
                total = 0;
                pass = 0;
                fail = 0;
//             These variables are being set back to 0 after the loop runs the first round and continues in other to get the purpose in which they would serve for each subject.
                
                for(int index = 0; index < grades.length; index ++){

                    total = total + grades[index][count];

                    if(grades[index][count] >= 50){
                         pass ++;
                
                     }

                     else{
                        fail ++;
                     }
//
                
                    if(grades[index][count] > maximum){
                        maximum = grades[index][count];
                        largestIndex = index;
                            
                        
                        
                     }   
                
                    else if(grades[index][count] < minimum){
                        minimum = grades[index][count];
                        lowestIndex = index;
                    }



               }   

                

                    average = (double)total/grades.length;
                System.out.println("Subject " + (count +1));
                System.out.println("The highest scoring student is Student " + (largestIndex + 1) + " scoring " + maximum);
                System.out.println("The lowest scoring student is Student " + (lowestIndex + 1) + " scoring " + minimum);
                System.out.println("Total Score: " + total);
                System.out.printf("Average Score: %.2f%n", average);
                System.out.println("Number of Passes: " + pass);
                System.out.println("Number of Fails: " + fail);
                 

                System.out.println();         

               }

    }







    public static void bestGraduatingStudent(int [][] grades) {

        int [] total = getTotal(grades);
        int maximum = total[0];
        int maximumIndex = 0;

        for(int count = 0; count < total.length; count ++){

            if(total[count] > maximum){
                maximum = total[count];
                maximumIndex = count;
            }

      }


        System.out.println("The Best Graduating Student is: Student " + (maximumIndex + 1) + " scoring " + maximum);
        
    }







public static void worstGraduatingStudent(int [][] grades) {

        int [] total = getTotal(grades);
        int minimum = total[0];
        int minimumIndex = 0;

        for(int count = 0; count < total.length; count ++){

            if(total[count] < minimum){
                minimum = total[count];
                minimumIndex = count;
            }

      }


        System.out.println("The Worst Graduating Student is: Student " + (minimumIndex + 1) + " scoring " + minimum);
        
    }





 













 






}
