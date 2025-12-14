from christmas_function import firstDay, secondDay, thirdDay, fourthDay, fifthDay, sixthDay, seventhDay, eightDay, ninthDay, tenthDay, eleventhDay, twelfthDay

song_lyrics = ("""

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
song = input("Enter any option")

match(song):
    case "1":
        result = firstDay
        print(result)









