# This is my solution for Learning Journal assignment Unit 8 - UoPeople

# This is my modifed code from Learning Journal Uni 7

import ast

# I used this library to work with data

# Here's the modified function from Unit 7

def invert_dict(d):
     inverse = dict()
     for key in d:
          val = d[key]
          if val not in inverse:
               inverse[val] = key
          else:
               inverse[val].append(key)
     return inverse

# Here's the code for reading the original dictionary text file using ast library to process data and then I inverted the dictionary

with open('dictionary.txt', 'r') as f:
    a_readmyfile = ast.literal_eval(f.read())
    inverted = invert_dict(a_readmyfile)

# Here's the code for creating the inverted dictionary text file and writing the inverted dictionary as a string

with open('inverted_dictionary.txt', 'w') as i:
    i.write(str(inverted))
