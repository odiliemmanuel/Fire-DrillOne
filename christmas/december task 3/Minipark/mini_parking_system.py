# Create a parking lot of size 20
# Each element is either empty(0) or occupied(1)
# An element can only enter a particular index if it is 0 or empty 
# An element can be removed by specifying the particular index
# And at the end of the program i should dispay the parking status, showing the available spaces and filled up spaces.


def add_car(my_slot):
            
    condition = "no"
    answer = ""
    while(answer.lower() != condition):

        type_of_car = str(input("Enter car type "))
      
        index = int(input("Enter position between (0 - 19) "))

        while(my_slot[index] != "empty"):
            print("Position is occupied")
            index = int(input("Enter position between (0 - 19) "))
        
        

        if(my_slot[index] == "empty"):
            my_slot[index] = type_of_car

            answer = str(input("Any other customer (yes) or (no) "))
                      
    
        if(answer.lower() == (condition)):
            print("\nCondition, PHEWW😪️ time to watch flash\n")

                        
                           
    return my_slot






def remove_car(my_slot):

    condition = "no"
    answer = ""

    while(answer.lower() != condition):

        type_of_car = str(input("Enter Car Type "))
       

        index = int(input("Enter the position in which it was parked "))
     

        if(index >= 0 and index <= 19):
            while(my_slot[index] != "empty" and type_of_car == my_slot[index]):
                my_slot.pop(index)
                print("Car Successfully Removed")

                answer = str(input("Any other customer "))
                
        
        if(my_slot[index] == "empty"):
            print("Wrong Entry, no vehicle parked there") 

        if(type_of_car != my_slot[index]):
            print("Car parked and position doesn't match")                  
            
        else:
            print("Index out bounds")

    
        if(answer.lower() == condition):
            print("\nCondition, PHEWW😪️ time to watch flash\n")
         

        

 
    return my_slot
               
      


my_slot = []

size = 20
remove = "remove";
park = "park";
answer = "";

for count in range(20 + 1):
    my_slot.append("empty")

my_slot[0] = "camry"
my_slot[5] = "toyota"
my_slot[12] = "Rav 4"
my_slot[2] = "Honda"
my_slot[7] = "pivot"
my_slot[19] = "HighLander"



while(answer.lower() != remove or answer.lower() != park):
    answer = str(input("Do you want to (park) or (remove) your car "))


    if(answer.lower() == park):
        print(add_car(my_slot))
        break
       
    

    elif(answer.lower() == remove):
        remove_car(my_slot)
        break
        
  

    else:
        print("Invalid Input")

   





for element in my_slot:               

    print(f"|| {element}  || ")






       
