# Click on submit to see the result

x = 10  # Global variable

def my_function():
    x = 20  # Local variable with the same name as the global variable
    print(x)  # Accesses the local variable

my_function()  # Output: 20
print(x)  # Output: 10 (global variable is not affected)
