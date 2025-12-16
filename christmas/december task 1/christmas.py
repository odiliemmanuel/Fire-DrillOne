from christmas_function import *

song_lyrics = ("""
TWELVE DAYS OF CHRISTMAS
 
1. First Day
2. Second Day
3. Third Day
4. Fourth Day
5. Fifth Day
6. Sixth Day
7. Seventh Day
8. Eight Day
9. Ninth Day
10. Tenth Day
11. Eleventh day
12. Twelfth Day

""")

print(song_lyrics)
days = input("Enter any option\n")

match(days):
    case "1":
        print(firstDay(days))
       

    case "2":
        print(secondDay(days))
         

    case "3":
        print(thirdDay(days))

    case "4":
        print(fourthDay(days))

    case "5":
        print(fifthDay(days))

    case "6":
        print(sixthDay(days))

    case "7":
        print(seventhDay(days))

    case "8":
        print(eightDay(days))

    case "9":
        print(ninthDay(days))

    case "10":
        print(tenthDay(days))

    case "11":
        print(eleventhDay(days))

    case "12":
        print(twelfthDay(days))











