import java.util.ArrayList;
import java.util.Scanner;

    public class MiniParkingSystem {
        public static void main(String...Odili) {

            Scanner input = new Scanner(System.in);
         ArrayList<String> slots = new ArrayList <>();

            
            int size = 20;
            String remove = "remove";
            String park = "park";
            String answer = "";
           
            for(int count = 0; count < size; count ++)
                slots.add("empty");

                slots.set(0, "camry");
                slots.set(5, "toyota");
                slots.set(12, "Rav 4");
                slots.set(2, "Honda");
                slots.set(17, "pivot");
                slots.set(19, "HighLander");
                

           System.out.println("Welcome to FLASH'S mini park\n");

           while(!answer.equalsIgnoreCase(remove) || !answer.equalsIgnoreCase(park)) {

                 System.out.println("Do you want to (park) or (remove) your car");
                     answer = input.next();
                   

                    if(answer.equalsIgnoreCase(park)){
                         parkAddCar(slots, input);break;
                    }


                  else if(answer.equalsIgnoreCase(remove)){
                         parkRemoveCar(slots, input);break;
                    }  

                    else{
                        System.out.println("Invalid Input");
                    }                    

              }       
                    for(String element : slots)                
                    
                    System.out.print("|| " + element + " || ");

        }
          
            

        public static ArrayList<String> parkAddCar(ArrayList<String>slots, Scanner input){
            
            String condition = "no";
            String another = "";
            while(!another.equalsIgnoreCase(condition)){
            
            System.out.println("Enter car type");
                String type = input.next();
         
            System.out.println("Enter position between (0 - 19)");
                int index = input.nextInt();


                   while(slots.get(index) != "empty"){
                          System.out.println("Position is occupied");
                            System.out.println("Enter position between (0 - 19)");
                                index = input.nextInt();
                        }

                         if(slots.get(index) == "empty"){
                        slots.set(index, type);
                    }
//
                    System.out.println("Any other customer");
                        another = input.next();
    
                    if(another.equalsIgnoreCase(condition))
                        System.out.println("Condition, PHEWW😪️ time to watch flash");
                     
            }
                    
                   
                   
                        return slots;

        }

                   


        public static ArrayList<String> parkRemoveCar(ArrayList<String>slots, Scanner input) {

                    String condition = "no";
                     String another = "";

            while(!another.equalsIgnoreCase(condition)){

            System.out.println("Enter Car Type");
                String type = input.next();

            System.out.println("Enter the position in which it was parked");
                int index = input.nextInt();

             if(index >= 0 && index <= 19){
                    if(slots.get(index) != "empty" && type.equals(slots.get(index))){
                        slots.remove(index);
                        System.out.println("Car Successfully Removed");

                        System.out.println("Any other customer");
                            another = input.next();
                    
                    }
                    else if(slots.get(index) == "empty"){
                        System.out.println("Wrong Entry, no vehicle parked there");                    
                    }

            }


            else{
                System.out.println("Index out bounds");
            }

            
//            
            }
      
                return slots;
               
        }     
                    
        
    


                
        
           
       
      

// Create a parking lot of size 20
// Each element is either empty(0) or occupied(1)
// An element can only enter a particular index if it is 0 or empty 
// An element can be removed by specifying the particular index
// And at the end of the program i should dispay the parking status, showing the available spaces and filled up spaces.




    }











   
