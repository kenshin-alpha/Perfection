# difference between

def howsum(targetSum,numbers,memo=None):
    if memo == None:
        memo = {}

def howsum(targetSum,numbers,memo={}):
    pass

# This is a common gotcha. The default values for a 
# function’s arguments are evaluated once, when the 
# function is defined, not every time the function is called. 
# This means that if you have a mutable default value, 
# any mutation will be preserved from call to call. 
# The default value itself is attached to the function object,
# so it never goes out of scope.

# The standard idiom for dealing with this is to use the default value of None, and check for it in the body of your function. Something like:

# def canSum(targetSum, numbers, memo=None):
#     if memo is None:
#         memo = {}
