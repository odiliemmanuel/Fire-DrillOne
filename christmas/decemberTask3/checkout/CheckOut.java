import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public class CheckOut {
         static Scanner input = new Scanner(System.in);
        public static void main(String...Odili) {
            

            double total = 0.0;
            String addresses = "";            
            String itemName = "";
            int size = 0;
            double price = 0.0;
            double subTotal = 0.0;
            double discount = 0.0;
            double vat = 0.0;
            String answer = "";
            double totalBill = 0.0;
            
                
            address();

            


            String customerName = name();

            List<String> itemArray = new ArrayList<>();
            List<Integer> sizeArray = new ArrayList<>();
            List<Double> priceArray = new ArrayList<>();
            List<Double> totalArray = new ArrayList<>();

            String condition = "no";

        
            while(!answer.equalsIgnoreCase(condition)){

                itemName = item();
                    itemArray.add(itemName);


                size = quantity();
                    sizeArray.add(size);


               price = price();
                    priceArray.add(price);


                total = price * size;
                   totalArray.add(total); 

                subTotal += total;


                answer = reply();          
                        
            }

                 String cashierName = cashier();
    
                
                
                double discounted = discounts();
            
                discount = (discounted * subTotal) / 100;

                vat = (17.50 * subTotal)/100;

                totalBill = subTotal + vat - discount;
               
                
                System.out.println("\n" + address());
                System.out.println("Cashier: " + cashierName);
                System.out.println("Customer Name: " + customerName);
                System.out.println("====================================================================");
                System.out.println("\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
                System.out.println("--------------------------------------------------------------------");

                if(itemArray.size() == sizeArray.size() && itemArray.size() == priceArray.size() && itemArray.size() == totalArray.size()){

                    for(int count = 0; count < itemArray.size(); count ++){

                        System.out.println("\t" + itemArray.get(count) + "\t\t" + sizeArray.get(count) + "\t\t" + priceArray.get(count) + "\t\t" + totalArray.get(count));
                    }
                 }

                System.out.println("--------------------------------------------------------------------");
                System.out.println("\t\t\t\t\t" +"Subtotal: \t" + subTotal + "\n\t\t\t\t\t"+ "Discount: \t" + discount + "\n\t\t\t\t\t" + "VAT @ 17.50%: \t" + vat); 
                System.out.println("====================================================================");
                System.out.println("\t\t\t\t\t" + "Bill Total: \t" + totalBill);
                System.out.println("====================================================================");
                System.out.println(" THIS IS NOT AN RECEIPT KINDLY PAY " + totalBill);
                System.out.println("====================================================================");

                double payment = amount(total);

                double balance = payment - totalBill;



                  while(payment >= totalBill){                  

                        
                System.out.println("\n" + address());
                System.out.println("Cashier: " + cashierName);
                System.out.println("Customer Name: " + customerName);
                System.out.println("====================================================================");
                System.out.println("\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
                System.out.println("--------------------------------------------------------------------");

                if(itemArray.size() == sizeArray.size() && itemArray.size() == priceArray.size() && itemArray.size() == totalArray.size()){

                    for(int count = 0; count < itemArray.size(); count ++){

                        System.out.println("\t" + itemArray.get(count) + "\t" + sizeArray.get(count) + "\t\t" + priceArray.get(count) + "\t\t" + totalArray.get(count));
                    }
                 }

                System.out.println("--------------------------------------------------------------------");
                System.out.println("\t\t\t\t\t" +"Subtotal: \t" + subTotal + "\n\t\t\t\t\t" + "Discount: \t" + discount + "\n\t\t\t\t\t" + "VAT @ 17.50%: \t" + vat); 
                System.out.println("====================================================================");
                System.out.println("\t\t\t\t\t" + "Bill Total: \t" + totalBill + "\n\t\t\t\t\t" + "Amount Paid: \t" + payment + "\n\t\t\t\t\t" + "Balance: \t" + balance);
                System.out.println("====================================================================");
                System.out.println("\t\t THANK YOU FOR YOUR PATRONAGE !!! ");
                System.out.println("====================================================================");break;

                

            }
       

           
              } 



    public static  String address () {

        String addresses = "SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 0329382343\nDate: 18-Dec-25  10:14:12 am\n";

        return addresses;
    }





    public static  String name() {

        String customerName = "";
        while(!customerName.matches("[A-Za-z]+")){

                  
      System.out.println("What is the customer's Name");
       customerName = input.next();

            if(!customerName.matches("[A-Za-z]+")){
                       
            System.out.println("Invalid Input");
            }

        else{
                return customerName;
            }
        }
            return customerName;

    }






    public static String item(){
          
        System.out.println("What did the user buy ");
            String itemName = input.next();

                   
        return itemName;        
    }





    public static  int quantity () {

        System.out.println("How many pieces");
            int size = input.nextInt();
            
            return size;
    }





    public static double price() {
   
        System.out.println("How much per unit");
            double price = input.nextDouble();
                   
          return price;
        
        }


   
    public static double total(int quantity, double price){
        


        return quantity * price;
    }



    public static String reply(){

        System.out.println("Add more items?");
        String answer = input.next();

        while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
            System.out.println("Invalid input?");
            answer = input.next();
        }

        return answer;
    }




    
    public static String cashier() {
    
        System.out.println("Cashier's Name ");
            String cashierName = input.next();


        return cashierName;
    }





    public static double discounts() {

        System.out.println("How much discount will he get");
          double discount = input.nextDouble();

        while(discount < 1){

        System.out.println("Invalid Input");
         discount = input.nextDouble();
        
        }

          
        return discount;
    }


    public static double amount(double total) {
        
        System.out.println("How much did the customer give you ?");
           double amountGiven = input.nextDouble();

            while(amountGiven < total){
                System.out.println("Insufficient Balance \n Enter amount :");
                  amountGiven = input.nextDouble();
            }


        return amountGiven;
    }
































    }
