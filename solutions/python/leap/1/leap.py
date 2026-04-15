def leap_year(year):
    if  not year%400:
        return True

    return (year%4==0) and year%100!=0
