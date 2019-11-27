#!/usr/bin/python

# This is Part 1 for Learning Journal Unit 3 - UoPeople

# This is the function for countdown
def countdown(n):
     if n <= 0:
          print('Blastoff!')
     else:
          print(n)
          countdown(n-1)

# This is the function for countup

def countup(n):
    if n > -1:
        print('Blastoff!')

    else:
        print(n)
        countup(n+1)



# This asks a user for a number and store it in a variable "n"
n = int(input('Enter a number: '))

# Note!: I added int () so I can use Python 3 because Python 2 converts the types for input but Python 3 doesn't.

# If "n" is less than 0, call the countup function OR else call countdown
if n < 0:
    countup(n)
else:
    countdown(n)

# If n is ZERO so it will call "countdown" function because in this function if n <= 0 it prints Blastoff
