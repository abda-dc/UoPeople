# This is my Learning Journal Unit 7 for UoPeople

# Design the dictionary so that it could be useful for something meaningful to you. Create at least three different items in it. Invent the dictionary yourself.

# Next consider the invert_dict function from Section 11.5 of your textbook.

# Modify this function so that it can invert your dictionary. In particular, the function will need to turn each of the list items into separate keys in the inverted dictionary.

# Run your modified invert_dict function on your dictionary. Print the original dictionary and the inverted one.


# Task 1

d = {'ahmed':'jack', 'mohamed':'george', 'mona':'sara', 'fatma':'niki'}

# I created this dictionary to match random Arab names to foreign names

# Task 2

def invert_dict(d):
     inverse = dict()
     for key in d:
          val = d[key]
          if val not in inverse:
               inverse[val] = [key]
          else:
               inverse[val].append(key)
     return inverse

# This is the output for the original inverse_dict function

>>> invert_dict(d)
{'jack': ['ahmed'], 'george': ['mohamed'], 'sara': ['mona'], 'niki': ['fatma']}


# This is modifed function and the output

def invert_dict(d):
     inverse = dict()
     for key in d:
          val = d[key]
          if val not in inverse:
               inverse[val] = key
          else:
               inverse[val].append(key)
     return inverse

>>> invert_dict(d)
{'jack': 'ahmed', 'george': 'mohamed', 'sara': 'mona', 'niki': 'fatma'}

# The keys in the orignal dictionary are the Arab names but the keys in the inverted dictionary are the foreign names

Thank you
