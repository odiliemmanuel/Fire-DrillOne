def address():
    return "SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 0329382343\nDate:   18-Dec-25  10:14:12 am\n"

    
    



def name():

    customer_name = str(input("What is the customer's Name:  \n"))                  
      
    
    return customer_name




def item():

    item_name = str(input("What did the user buy: \n"))
   
    return item_name
    



def quantity():
    
    size = int(input("How many pieces: \n"))
          
    return size
    



def price_of_items():
      
    price = int(input("How much per unit: \n"))
                   
    return price
        

   
def total_quantity(quantity, price_of_items):

    return int(quantity * price_of_items)
    



def reply():
 
    answer = input("Add more items?:\n")
       
    while(answer.casefold() != "yes".casefold() and answer.casefold() != "no".casefold()):
        print("Invalid input")
        answer = input("Add more items: ")

    return answer




    
def cashier():

    cashier_name = input("Cashier's Name: ")
           
    return cashier_name




def discounts():
    discount = int(input("How much discount will he get: \n"))

    while(discount < 1):

     discount = int(input("How much discount will he get: \n"))
     if(discount > 1):
        return discount

    if(discount < 1):
        print("Invalid Input")
        
       
       
    return discount
    




def amount(total):

    amount_given = float(input("How much did the customer give you: ? "))

    while(amount_given < total):

        if amount_given < total:
            amount_given = float(input("How much did the customer give you ? "))
            print("Insufficient fundz")
                


        if(amount_given >= total):
            return amount_given
        


    return float(amount_given)
    








total = 0.0
addresses = ""            
item_name = ""
size = 0
price = 0.0
sub_total = 0.0
discount = 0.0
vat = 0.0
answer = ""
total_bill = 0.0


customer_name = name()
item_list = []
size_list = []
price_list = []
total_list = []

condition = "no"


while(answer.casefold() != condition.casefold()):

    item_name = item()
    item_list.append(item_name)


    size = quantity()
    size_list.append(size)


    price = price_of_items()
    price_list.append(price)


    total = price * size
    total_list.append(total) 

    sub_total += total


    answer = reply()          

            


cashier_name = cashier()
    
                

discounted = discounts()

discount = discounted * sub_total / 100

vat = 17.50 * sub_total / 100

total_bill = sub_total + vat - discount




print("Cashier: ", cashier_name)
print("Customer Name: ", customer_name)
print("====================================================================")
print("\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)")
print("--------------------------------------------------------------------")

if(len(item_list) == len(size_list) and len(item_list) and len(price_list) and len(item_list) and len(total_list)):

    for count in range(0,len(item_list)):

        print("\t" + item_list[count], "\t\t", size_list[count], "\t\t" , price_list[count] , "\t\t" , total_list[count])


print("--------------------------------------------------------------------")
print("\t\t\t\t\t", "Subtotal: \t" , sub_total , "\n\t\t\t\t\t", "Discount: \t" , discount , "\n\t\t\t\t\tVAT @17.50%: \t" ,vat)
print("====================================================================")
print(f"\t\t\t\t\tBill Total: \t {total_bill:.2f}")
print("====================================================================")
print(f" THIS IS NOT AN RECEIPT KINDLY PAY\t{total_bill:.2f}")
print("====================================================================")

payment = amount(total)

balance = payment - total_bill

 
while(payment < total_bill): 

    payment = amount(total)
    print("Insufficient Fundz")

    if(payment >= total_bill):
        print("\n",address())
        print("Cashier: " , cashier_name)
        print("Customer Name: ", customer_name)
        print("====================================================================")
        print("\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)")
        print("--------------------------------------------------------------------")

        if(len(item_list) == len(size_list) and len(item_list) and len(price_list) and len(item_list) and len(total_list)):

            for count in range(0,len(item_list)):

                print("\t" + item_list[count], "\t\t", size_list[count], "\t\t" , price_list[count] , "\t\t" , total_list[count])

        print("--------------------------------------------------------------------")
        print("\t\t\t\t\t" , "Subtotal: \t" , sub_total , "\n\t\t\t\t\t" , "Discount: \t" , discount , "\n\t\t\t\t\tVAT @17.50%: \t" , vat)
        print("====================================================================")
        print(f"\t\t\t\t\tBill Total: \t{total_bill:.2f}\n\t\t\t\t\tAmount Paid: \t{payment:.2f}\n\t\t\t\t\tBalance: \t{balance:.2f}")
        print("====================================================================")
        print("\t\t THANK YOU FOR YOUR PATRONAGE !!! ")
        print("====================================================================")


            
        
                








