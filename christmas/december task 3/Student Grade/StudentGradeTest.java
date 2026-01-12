import java.util.Scanner;
    public class StudentGradeTest {
        public static void main(String...Odili){
        
        Scanner input = new Scanner(System.in);
                    


         System.out.println("How many students do you have?");
             int numberOfStudents = input.nextInt();

          System.out.println("How many subject do they offer?");
              int numberOfSubjects = input.nextInt();

          System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successfully\n");
    
            int [][] grades = new int [numberOfStudents][numberOfSubjects];       



             StudentGrade.gradesOutput(grades, numberOfStudents, numberOfSubjects);

            System.out.println("*****************************************************************");
            System.out.print("STUDENT\t\t");

            for(int count = 0; count < numberOfSubjects; count ++){
    
                System.out.printf("SUB%1d\t", count + 1);
            }

               System.out.printf("TOTAL\tAVERAGE\t POSITION\n");
            System.out.println("*******************************************************************");
         
                    StudentGrade.output(grades);

             System.out.println("******************************************************************");


                StudentGrade.subjectSummary(grades);
                int maximum = StudentGrade.maximumScore(grades);
                int minimum = StudentGrade.minimumScore(grades);
                System.out.println("The maximum is " + maximum + "\nThe minimum is " + minimum);



  
       }



    }















