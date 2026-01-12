def grades_output(grades, number_of_students, number_of_subjects):
  
    for count in range(number_of_students):
        for score in range(number_of_subjects):

            print("Entering score for student ", (count + 1))
            scores = int(input("Enter score for subject ", (score + 1))
    
            grades [count][score] = scores
            print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successfully\n")

   
        print()
    



def get_total(grades):

    total_grades = [len(grades)];
    total = 0

    for row in range (len(grades)):
        total = 0
        for column in range (len(grades[row])):

            total += grades[row][column]

            total_grades[row] = total


    return total_grades





def get_average(grades):

    total = get_total(grades)
    average = [len(grades)]

    for count in range (len(grades)):

        average[count] = float(total[count] / len(grades[count]))


    return average;

        
    




def maximum_score(grades):
    
    maximum = grades[0][0]

    for row in range (len(grades)):
        for column in range (len(grades[row])):

            if(grades[row][column] > maximum):

                maximum = grades[row][column]

   
    return maximum
    




    
def minimum_score(grades):

    minimum = grades[0][0]

    for row in range (len(grades)):
        for column in range (len(grades[row])):

            if(grades[row][column] < minimum){

                minimum = grades[row][column]

   
    return minimum
        
    





def  position_rank(total):

    positions = [len(total)]

    for pick in range (len(total)):

        positionIndex = 1

        for compare in range (len(total)):

            if(total[pick] < total[compare]):
                position += 1


            positions[pick] = positionIndex;

            }
        }

            return positions;
    
    }




                
    
    
