def find_anagrams(word, candidates):
    word_=sorted(word.lower())
    new=[]
    for w in candidates:
        if w.lower()!=word.lower() and word_==sorted(w.lower()):
            new.append(w)

    return new
        
