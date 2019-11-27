<pre>

# Example 1
with open('files.txt', 'r') as f:
    pass
try:
    print(f.read())
except:
    print('file closed')

# Output of example 1 WITHOUT using try & except

Traceback (most recent call last):
  File "test.py", line 5, in <module>
    print(f.read())
ValueError: I/O operation on closed file.

# Output of example 1 after using try & except

file closed

# because this "files.txt" is already closed and we cannot read it even if we have access to the variable
# What I'm going to do is use context manager so I can open the file and run the code again

# Original code without any errors
with open('files.txt', 'r') as f:
    a_readmyfile = f.read()
    print(a_readmyfile)

# Output of the original code
This is Abdelrahman from UoPeople
I created this file for testing my code
This is discussion assignment Unit 8

# ================== Example 2 ====================== #
with open('files.txt', 'r') as f:

    try:
        f.write('files.txt')
    except:
        print('this file is not writable')

# Output of example 2 WITHOUT using except & try:

Traceback (most recent call last):
  File "test.py", line 4, in <module>
    f.write('files.txt')
io.UnsupportedOperation: not writable

# Output of example 2 after using try & except

this file is not writable

# because this file is not open and doesn't have persmssion to be writable

# Original code without any errors
with open('files.txt', 'w') as f:
    f.write('files.txt')

# No output because I changed the R to W so I can write on the file



# ================== Example 3 ====================== #

with open('test.txt', 'r') as f:
    pass

    try:
        f.write('test.txt')
    except:
        print('this file is not exist')

# Output of example 3 WITHOUT using except & try:

Traceback (most recent call last):
  File "test.py", line 1, in <module>
    with open('test.txt', 'r') as f:

FileNotFoundError: [Errno 2] No such file or directory: 'test.txt'

# Output of example 3 after using try & except
this file is not exist

# Because simply this file is not exist!

# Original code without any errors

with open('files.txt', 'r') as f:
    pass
print(f.closed)

# Output of the original code
True



# Using try, except blocks and "print" are very helpful because it gives me fast and efficient ways to debug the code and solve it.

</pre>
