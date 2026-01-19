import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class MultiFuelDispenser{

     static ArrayList<String> transactions = new <String> ArrayList();
     static String productName = "";



    public static int mainMenu(Scanner input){

        String menu = """
        Welcome to GBeda Station !!

        1. Buy Petroleum

        2. Show Transaction History

        3. Exit

        """;
        System.out.println(menu);
        System.out.print("Enter any option from the above (1, 2 or 3):  ");
         int option = input.nextInt();  
            

        while(option < 1 || option > 3){
           System.out.println("Ivalid Input, enter 1, 2 or 3: ");
             option = input.nextInt();
         
         }
               

        return option;

    }




    public static int petroleumMenu(Scanner input){
        
        int option = mainMenu(input);
        int petroleumOption = 0;
        

        switch(option){

           case 1:
                 System.out.println("Buy Petroleum\n");
                 String petrolMenu = """
                 Available Petroleum

                 1. Petrol    =>  650/litre

                 2. Diesel    =>  720/litre

                 3. Kerosene  =>  550/litre

                 4. Gas       =>  480/litre 
                 """;
                 System.out.println(petrolMenu);
                 System.out.print("Please select an option: ");
                    petroleumOption = input.nextInt();break;


            case 2:
                  System.out.println("Show Transaction History");
                  System.out.println("Loading transaction history>>>>>>>>>");
       

                     for(int count = 0; count < transactions.size(); count ++)

                    System.out.println("==================================================\n" + transactions.get(count));
                    System.out.println("==================================================\n");break;

                  


            case 3:
                  System.out.println("Exit");
                  System.out.println("You have successfully exited the program!");break;

                      
          } 
            
                       
            while(petroleumOption < 1 && petroleumOption > 4){

               System.out.println("Invalid Input, enter either 1, 2, 3, or 4: ");
                   petroleumOption = input.nextInt();
            }
            

        return petroleumOption;

    }





    public static int petrolMenu(Scanner input){

        int petroleumOption = petroleumMenu(input);
        int buyingType = 0;
        
       


        switch(petroleumOption){

           case 1:
                  System.out.println("\nPETROL");
                  String buyingOption = """

                   1. Litre 

                      OR

                   2. Amount
                   """;
                  System.out.println(buyingOption);
                    productName = "Petrol";
                  System.out.println("Litre or amount for " + productName);
                  System.out.print("Enter any option 1 or 2: ");
                     buyingType = input.nextInt();
                    
                    break;

                    
             
           case 2:
                  System.out.println("\nDIESEL");
                     buyingOption = """

                   1. Litre 

                      OR

                   2. Amount
                   """;
                  System.out.println(buyingOption);
                  productName = "Diesel";
                  System.out.println("Litre or amount for " + productName);
                  System.out.print("Enter any option 1 or 2: ");
                     buyingType = input.nextInt();
                    

                    break;

                

            case 3:
                  System.out.println("\nKEROSENE");
                     buyingOption = """

                   1. Litre 

                      OR

                   2. Amount
                   """;
                  System.out.println(buyingOption);
                    productName = "Kerosene";
                  System.out.println("Litre or amount for " + productName);
                  System.out.print("Enter any option 1 or 2: ");
                     buyingType = input.nextInt();

                        break;


            case 4:
                  System.out.println("\nGAS");
                     buyingOption = """

                   1. Litre 

                      OR

                   2. Amount
                   """;
                  System.out.println(buyingOption);
                    productName = "Gas";
                  System.out.println("Litre or amount for " + productName);
                  System.out.print("Enter any option 1 or 2: ");
                     buyingType = input.nextInt();
                    break;
                
                
                
            }

             while(buyingType < 1 && buyingType > 4){

                System.out.println("Invalid Input, enter either 1, 2, 3, or 4: ");
                    buyingType = input.nextInt();

             }

        return buyingType;
            
    }





    public static String sellingCalculation(Scanner input){
        int buyingType = petrolMenu(input);
        int amount = 0; 
        int litres = 0;
        String record = "";


        switch(buyingType){

            case 1:
                System.out.println("Litre");
                System.out.print("How many litres are you buying(650/L): ");
                    litres = input.nextInt();
                      amount = litres * 650;

                 System.out.println("==================================================");               
                 record = String.format("Product: %s%nAmount: $%d%nLitre:%dlitres%n",productName, amount, litres);
                 System.out.println(record);
                 transactions.add(record);
                 System.out.println("Transactions now contains " + transactions.size() + " items.");
                 System.out.println("Thank you for your Patronage");
                 System.out.println("==================================================\nSaving Transaction History...");
                 
                 String selling = sellingCalculation(input);
                    break;
    

             case 2:
                   System.out.println("Amount");
                   System.out.print("How much " + productName +  " are you buying(650/L):  ");
                       amount = input.nextInt();
                       litres = amount/650;

                    System.out.println("============================================");
                     record = String.format("\nProduct: %s%nAmount:$%d%nLitre:%dlitres%n",productName, amount, litres);
                     System.out.println(record);
                     transactions.add(record);
                     System.out.println("Thank you for your Patronage");
                     System.out.println("============================================\nSaving Transaction History...");

                      selling = sellingCalculation(input);

                     break;
                
        }

                while(buyingType < 1 && buyingType > 2){

                  System.out.println("Invalid Input, enter either 1 or 2: ");
                    buyingType = input.nextInt();

               }




        return record;
    }







































}
