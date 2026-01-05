const prompt = require('prompt-sync')();

function addCar(mySlot){
            
    let condition = "no";
    let answer = "";

    while(answer.toLower() != condition){

        typeOfCar = prompt("Enter car type ");
      
        index = prompt(Number("Enter position between (0 - 19) "));

        while(mySlot[index] != "empty"){
            console.log("Position is occupied");
            index = prompt(Number("Enter position between (0 - 19) "));
        
        }

        if(mySlot[index] == "empty"){
            mySlot[index] = typeOfCar;

            answer = prompt("Any other customer (yes) or (no) ");
         }             
    
        if(answer.toLower() == condition){
            console.log("\nCondition, PHEWW😪️ time to watch flash\n");
         }

    }                        
                           
    return mySlot;
 }





function removeCar(mySlot){

    condition = "no";
    answer = "";

    while(answer.toLower() != condition){

        let typeOfCar = prompt("Enter Car Type ")
       

        let index = prompt(Number("Enter the position in which it was parked "))
     

        if(index >= 0 && index <= 19){
            if(mySlot[index] != "empty" && typeOfCar == mySlot[index]){
                mySlot.pop[index];
                console.log("Car Successfully Removed");
            }


                let answer = prompt("Any other customer ");
                
        
           if(mySlot[index] == "empty"){
                console.log("Wrong Entry, no vehicle parked there");
            } 

        }                   
            
        else{
            console.log("Index out bounds");
        }
   }
 
    return mySlot;

 }







let mySlot = [];

let size = 20;
let remove = "remove";
let park = "park";
let answer = "";

     for(count = 0; count < size; count ++){
         mySlot.add("empty");
     }

    mySlot[0] = "camry";
    mySlot[5] = "toyota";
    mySlot[12] = "Rav 4";
    mySlot[2] = "Honda";
    mySlot[7] = "pivot";
    mySlot[19] = "HighLander";

    console.log("Welcome to FLASH'S mini park\n");

    while(answer.toLower() != remove || answer.toLower() != park){
       answer = prompt("Do you want to (park) or (remove) your car ");


        if(answer.toLower() == park){
            console.log(addCar(mySlot))
            break
        }   
        

        if(answer.toLower() == remove){
            console.log(removeCar(mySlot));
            break
         }   
      

        else{
            console.log("Invalid Input");
        }
    }













