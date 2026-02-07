const prompt = require('prompt-sync')();

function addCar(mySlot){
            
    let condition = "no";
    let answer = "";

    while(answer.toLowerCase() != condition){

        typeOfCar = prompt("Enter car type ");
      
        index = Number(prompt("Enter position between (0 - 19) "));

        while(mySlot[index] != "empty"){
            console.log("Position is occupied");
            index = Number(prompt("Enter position between (0 - 19) "));
        
        }

        if(mySlot[index] == "empty"){
            mySlot[index] = typeOfCar;
            console.log("Vehicle entered Successfully")
            

            answer = prompt("Any other customer (yes) or (no) ");
         }             
    
        if(answer.toLowerCase() == condition){
            console.log("\nCondition, PHEWW😪️ time to watch flash\n");
         }

    }                        
                           
    return mySlot;
 }





function removeCar(mySlot){

    condition = "no";
    answer = "";

    while(answer.toLowerCase() != condition){

        let typeOfCar = prompt("Enter Car Type:  ")
       

        let index = Number(prompt("Enter the position in which it was parked:  "))
     

        while(mySlot[index] == "empty"){

            console.log("No car Parked There");

            index = Number(prompt("Enter the position in which it was parked:  "))
            
        }

        if(mySlot[index] != "empty"){

            mySlot.splice(index,1)

            console.log("Car Removed Successfully");
       
          answer = prompt("Any other customer (yes) or (no):  ");

         }             
    
        if(answer.toLowerCase() == condition){
            console.log("\nCondition, PHEWW😪️ time to watch flash\n");
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
         mySlot.push("empty");
     }

    mySlot[0] = "camry";
    mySlot[5] = "toyota";
    mySlot[12] = "Rav 4";
    mySlot[2] = "Honda";
    mySlot[7] = "pivot";
    mySlot[19] = "HighLander";

    console.log("Welcome to FLASH'S mini park\n");

    while(answer.toLowerCase() != remove || answer.toLowerCase() != park){
       answer = prompt("Do you want to (park) or (remove) your car ");


        if(answer.toLowerCase() == park){
            console.log(addCar(mySlot))
            break
        }   
        

        if(answer.toLowerCase() == remove){
            console.log(removeCar(mySlot));
            break
         }   
      

        else{
            console.log("Invalid Input");
        }
    }













