const prompt = require('prompt-sync')();

function address(){
    return "SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 0329382343\nDate:   18-Dec-25  10:14:12 am\n"

 }   
    

function name(){

    let customerName = prompt("What is the customer's Name:  \n")                 
      
    
    return customerName

 }


function item(){

    itemName = prompt("What did the user buy: \n")
   
    return itemName
    
 }


function quantity(){
    
    let size = prompt("How many pieces: \n")
          
    return size
    
 }


function priceOfItems(){
      
    let price = prompt(Number("How much per unit: \n"))
                   
    return price
        
 }

   
function totalQuantity(quantity, priceOfIitems){

    return Number(quantity * priceOfItems)
    
 }


function reply(){
 
    let answer = prompt("Add more items?:\n")
       
    while(answer.toLowerCase() != "yes".toLowerCase() && answer.toLowerCase != "no".toLowerCase()){
        print("Invalid input")
        answer = input("Add more items: ")

    }

    return answer


 }

    
function cashier(){

    let cashierName = prompt("Cashier's Name: ")
           
    return cashierName


 }

function discounts(){
    let discount = prompt(Number("How much discount will he get: \n"))

    while(discount < 1){

         discount = prompt(Number("How much discount will he get: \n"))
         if(discount > 1){
            return discount
         }

        if(discount < 1){
            print("Invalid Input")

        }
        
  }   
       
    return discount
    

 }
 

function amount(total){

     let amountGiven = prompt("How much did the customer give you: ? ")

    while(amountGiven < total){

        if(amountGiven < total){
            amountGiven = prompt(Number("How much did the customer give you ? "))
            print("Insufficient fundz")
        }         


        if(amountGiven >= total){
            return amountGiven

        }

    }    


    return float(amountGiven)


 }
    

