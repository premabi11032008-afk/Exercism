def transform(legacy_data):
    new={}
    for key in legacy_data:
        for letter in legacy_data[key]:
            new[letter.lower()]=key

    return new
