def factors(n):
    res = []
    
    while n % 2 == 0:
        res.append(2)
        n //= 2
        
    i = 3
    while i * i <= n:
        while n % i == 0:
            res.append(i)
            n //= i
        i += 2
        
    if n > 1:
        res.append(n)

    return res
