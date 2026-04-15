def classify(number):
    """ A perfect number equals the sum of its positive divisors.

    :param number: int a positive integer
    :return: str the classification of the input integer
    """
    if number<1:
        raise ValueError("Classification is only possible for positive integers.")

    if number==1:
        return "deficient"
        
    result=sum(x for x in range(2,number) if number%x==0)+1

    if result==number:
        return "perfect"
    return "abundant" if result > number else "deficient"
    
