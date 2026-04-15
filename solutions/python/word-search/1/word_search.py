class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y


class WordSearch:
    def __init__(self, puzzle):
        self.puzzle=puzzle

    def search(self, word):
        puzzle=self.puzzle
        rows = len(puzzle)
        cols = len(puzzle[0])
        
        directions = [
            (-1, -1), (-1, 0), (-1, 1),
            ( 0, -1),          ( 0, 1),
            ( 1, -1), ( 1, 0), ( 1, 1)
        ]
    
        def in_bounds(r, c):
            return 0 <= r < rows and 0 <= c < cols
    
        results = None
        for r in range(rows):
                for c in range(cols):
                    if puzzle[r][c] != word[0]:
                        continue
                    for dr, dc in directions:
                        rr, cc = r, c
                        i = 0
                        while i < len(word) and in_bounds(rr, cc) and puzzle[rr][cc] == word[i]:
                            rr += dr
                            cc += dc
                            i += 1
                        if i == len(word):
                            start = Point(c, r)
                            end = Point(cc - dc, rr - dr)
                            return (start, end)
        return results

            
