#!/usr/bin/python

# This is Part 1 for Programming Assign. Unit 7 - UoPeople

# Write a function called has_duplicates that takes a string parameter and returns True if the string has any repeated characters. Otherwise, it should return False.
# Implement has_duplicates by creating a histogram using the histogram function above. Do not use any of the implementations of has_duplicates that are given in your textbook.
# Instead, your implementation should use the counts in the histogram to decide if there are any duplicates.

def histogram(s):
     d = dict()
     for c in s:
          if c not in d:
               d[c] = 1
          else:
               d[c] += 1
     return d


def has_duplicates(str):
    h = histogram(str)
    flag = False
    for i in h:
        if h[i] > 1:
            flag = True
    return flag

test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"]


for str in test_dups:
    result = has_duplicates(str)
    if result == True:
        print(str, "has duplicates")
    else:
        print(str, "has no duplicates")

# Part 2
# Write a function called missing_letters that takes a string parameter and returns a new string with all the letters of the alphabet that are not in the argument string.
# The letters in the returned string should be in alphabetical order.
alphabet = "abcdefghijklmnopqrstuvwxyz"
test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"]

def missing_letters(str):
    result = ''
    count = histogram(alphabet)
    for c in str:
        if c in alphabet:
            count[c] += 1
    for d in count:
        if count[d] == 1:
            result += d
    return result

for str in test_miss:
    result = missing_letters(str)
    if result == '':
        print(str, "uses all the letters")
    else:
        print(str, "is missing letters", result)
