def square(number):
    if 0<number<=64:
        return 2**(number-1)

    raise ValueError("square must be between 1 and 64")

def total():
    new=0
    for i in range(64):
        new+=2**i

    return new
