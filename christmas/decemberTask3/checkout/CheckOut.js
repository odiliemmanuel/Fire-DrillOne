const prompt = require('prompt-sync')();


    function address(){
        return "SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 0329382343\nDate:   18-Dec-25  10:14:12 am\n"

     }  
 
    

    function name(){

        let customerName = prompt("What is the customer's Name:   ")                 
          
        
        return customerName

     }



    function item(){

        itemName = prompt("What did the user buy:  ")
       
        return itemName
        
     }




    function quantity(){
        
        let size = prompt("How many pieces:  ")
              
        return size
        
     }




    function priceOfItems(){
          
        let price = Number(prompt("How much per unit:  "))
                       
        return price
            
     }



       
    function totalQuantity(quantity, priceOfIitems){

        return Number(quantity * priceOfItems);
        
     }




    function reply(){

        let answer = prompt("Add more items?: ");           

        while(answer.toLowerCase() != "yes".toLowerCase() && answer.toLowerCase() != "no".toLowerCase()){
          
            console.log("Invalid");
            answer = prompt("Add more items?: "); 
        }

        return answer;


     }



    
    function cashier(){

        let cashierName = prompt("Cashier's Name: ")
               
        return cashierName


     }



function discounts(){
    let discount = Number(prompt("How much discount will he get: "))

    while(discount < 1){

         discount = Number(prompt("How much discount will he get: "))
         if(discount > 1){
            return discount
         }

        if(discount < 1){
            console.log("Invalid Input")

        }
        
  }   
       
    return discount
    

 }
 

function amount(total){

     let amountGiven = Number(prompt("How much did the customer give you: ? "));

    while(amountGiven < total){

             console.log("Insufficient fundz");

            amountGiven = Number(prompt("How much did the customer give you ? "))

            if(amountGiven >= total) {

                return amountGiven;
            }
        

        }    


    return amountGiven;


 }









let total = 0.0;

let addresses = "";
           
let itemName = "";

let size = 0;

let price = 0.0;

let subTotal = 0.0;

let discount = 0.0;

let vat = 0.0;

let answer = "";

let totalBill = 0.0;


customerName = name()

itemList = []
sizeList = []
priceList = []
totalList = []

let condition = "no"


    while(answer.toLowerCase() != "no"){

        itemName = item()
        itemList.push(itemName)


        size = quantity()
        sizeList.push(size)


        price = priceOfItems()
        priceList.push(price)


        total = price * size
        totalList.push(total) 

        subTotal += total


        answer = reply()  


    }                


cashierName = cashier();
    
                
discounted = discounts();

discount = discounted * subTotal / 100;

vat = 17.50 * subTotal / 100;

totalBill = subTotal + vat - discount;




console.log("Cashier: " +  cashierName)
console.log("Customer Name: " +  customerName)
console.log("====================================================================")
console.log("\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)")
console.log("--------------------------------------------------------------------")

    if(itemList.length == sizeList.length && itemList.length  == priceList.length  && itemList.length  == totalList.length){

        for(count = 0; count < itemList.length; count ++){

            console.log("\t" +  itemList[count] + "\t\t" +  sizeList[count] + "\t\t" + priceList[count] + "\t\t"  + totalList[count]);

        }

    }



console.log("--------------------------------------------------------------------");
console.log("\t\t\t\t\tSubtotal: \t" + subTotal + "\n\t\t\t\t\tDiscount: \t" + discount + "\n\t\t\t\t\tVAT @17.50%: \t" + vat);
console.log("====================================================================");
console.log("\t\t\t\t\tBill Total: \t " + Number(totalBill));
console.log("====================================================================");
console.log(" THIS IS NOT AN RECEIPT KINDLY PAY\t" + Number(totalBill));
console.log("====================================================================");

let payment = amount(total);

let balance = payment - totalBill;


while(payment >= totalBill){

        console.log("\n" + address());
        console.log("Cashier: " + cashierName);
        console.log("Customer Name: " + customerName);
        console.log("====================================================================");
        console.log("\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
        console.log("--------------------------------------------------------------------");


        if(itemList.length == sizeList.length && itemList.length  == priceList.length  && itemList.length  == totalList.length){

            for(count = 0; count < itemList.length; count ++){
 
                console.log("\t" + itemList[count] + "\t\t" + sizeList[count] +  "\t\t" + priceList[count] + "\t\t" + totalList[count]);

            }
        }

        console.log("--------------------------------------------------------------------");
        console.log("\t\t\t\t\tSubtotal: \t" + subTotal + "\n\t\t\t\t\tDiscount: \t" + discount + "\n\t\t\t\t\tVAT @17.50%: \t" + vat);
        console.log("====================================================================");
        console.log("\t\t\t\t\tBill Total: \t" + Number(totalBill) + "\n\t\t\t\t\tAmount Paid: \t" + Number(payment) + "\n\t\t\t\t\tBalance: \t" + Number(balance));
        console.log("====================================================================");
        console.log("\t\t THANK YOU FOR YOUR PATRONAGE !!! ");
        console.log("====================================================================");

        break;
      

    }

    

