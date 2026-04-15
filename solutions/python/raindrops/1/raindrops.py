def convert(number):
    new=""
    if number%3==0:
        new+= "Pling"
    if number%5==0:
        new+= "Plang"
    if number%7==0:
        new+= "Plong"

    if new:
         return new
        
    else:
        return str(number)

   
        
