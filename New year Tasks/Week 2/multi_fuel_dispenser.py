def main_menu():

    String menu = ("""
    Welcome to GBeda Station !!

    1. Buy Petroleum

    2. Show Transaction History

    3. Exit

    """)
        System.out.println(menu);
        System.out.print("Enter any option from the above (1, 2 or 3):  ");
         int option = input.nextInt();  
            

        while(option < 1 || option > 3){
           System.out.println("Ivalid Input, enter 1, 2 or 3: ");
             option = input.nextInt();
         
         }
               

        return option;

    }


