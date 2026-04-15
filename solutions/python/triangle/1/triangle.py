def is_triangle(sides):
    a,b,c=sides
    return a + b >= c and b + c >= a and a + c >= b

def equilateral(sides):
    return len(list(set(sides)))==1 and is_triangle(sides) and 0 not in sides


def isosceles(sides):
    return len(list(set(sides)))<=2 and is_triangle(sides)


def scalene(sides):
    return len(list(set(sides)))==3 and is_triangle(sides)
