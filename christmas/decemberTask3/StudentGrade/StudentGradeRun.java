package Java.christmas.decemberTask3.StudentGrade;

import java.util.Scanner;
    public class StudentGradeRun {
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

                StudentGrade.maximumScore(grades);
                StudentGrade.minimumScore(grades);
                
System.out.println("=====================================================================\n\nCLASS SUMMARY\n");
System.out.println("=====================================================================");

                StudentGrade.bestGraduatingStudent(grades);

System.out.println("=====================================================================\n");
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                StudentGrade.worstGraduatingStudent(grades);

System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");

System.out.println("=====================================================================");

                StudentGrade.classTotalScore(grades);
                StudentGrade.classAverageScore(grades);
System.out.println("=====================================================================");



  
       }



    }















