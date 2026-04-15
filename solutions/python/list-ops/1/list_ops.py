def append(list1, list2):
    return list1+list2

def concat(lists):
    new=[]
    for i in lists:
        new+=i
    return new
    
def filter(function, list):
    return [i for i in list if function(i)]
        
def length(list):
    return len(list)

def map(function, list):
    return [function(i) for i in list]

def foldl(function, list, initial):
    for i in list:
        initial=function(initial,i)
    return initial
        
def foldr(function, list, initial):
    for i in list[::-1]:
        initial=function(initial,i)
    return initial

def reverse(list):
    return list[::-1]
