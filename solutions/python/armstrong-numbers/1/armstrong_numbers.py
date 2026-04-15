def is_armstrong_number(number):
    n=len(str(number))
    return sum([int(i)**n for i in str(number)])==number
