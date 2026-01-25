import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class MultiFuelDispenser{
    
     static Scanner input = new Scanner(System.in);
     static ArrayList<String> transactions = new <String> ArrayList();
     static String productName = "";
     static int pricePerLitre = 0;



    public static int mainMenu(){

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




    public static int petroleumMenu(){
        
        int option = mainMenu();
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
                    
                                
                    LocalDateTime currentDate = LocalDateTime.now();

                    DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm");

                    String dateOutput = currentDate.format(datePattern);

                     for(int count = 0; count < transactions.size(); count ++)

                    System.out.println("==================================================\n" + transactions.get(count));
                    System.out.println(dateOutput);
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





    public static int petrolMenu(){

        int petroleumOption = petroleumMenu();
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
                    pricePerLitre = 650;
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
                  pricePerLitre = 720;
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
                    pricePerLitre = 550;
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
                    pricePerLitre = 480;
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





    public static String sellingCalculation(){
        int buyingType = petrolMenu();
        int amount = 0; 
        int litres = 0;
        String record = "";

        switch(buyingType){

            case 1:
                System.out.println("Litre");
                System.out.print("How many litres are you buying(650/L): ");
                    litres = input.nextInt();
                    while(litres < 0 && litres > 50){

                        System.out.println("Invalid Entry, number of litres must be within the space of 1 to 50");
                        litres = input.nextInt();
                    }
        
                      amount = litres * 650;

                 System.out.println("==================================================");               
                 record = String.format("Product: %s%nAmount: $%d%nLitre: %dlitres%n",productName, amount, litres);
                 System.out.println(record);
                 transactions.add(record);
                 System.out.println("Transactions now contains " + transactions.size() + " items.");
                 System.out.println("Thank you for your Patronage");
                 System.out.println("==================================================\nSaving Transaction History...");
                 
                 String selling = sellingCalculation();
                    break;
    

             case 2:
                   System.out.println("Amount");
                   System.out.print("How much " + productName +  " are you buying(650/L):  ");
                       amount = input.nextInt();

                        while(amount < 650 && amount){

                            System.out.println("Amount should be greater than litre");
                              amount = input.nextInt();
                         }

                       litres = amount/650;

                    System.out.println("============================================");
                     record = String.format("\nProduct: %s%nAmount: $%d%nLitre: %dlitres%n",productName, amount, litres);
                     System.out.println(record);
                     transactions.add(record);
                     System.out.println("Thank you for your Patronage");
                     System.out.println("============================================\nSaving Transaction History...");

                      selling = sellingCalculation();

                     break;
                
        }

                while(buyingType < 1 && buyingType > 2){

                  System.out.println("Invalid Input, enter either 1 or 2: ");
                    buyingType = input.nextInt();

               }




        return record;
    }






    public static int calculatingLitresForPetrol(int litres){

        int amount = litres * 650;

        return amount;
        
    }


    public static int calculatingAmountForPetrol





























}
