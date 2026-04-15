def is_isogram(string):
    new=[i.lower() for i in string if i.isalpha()]
    return len(new)==len(set(new))
