class Matrix:
    def __init__(self, matrix_string):
        self.matrix=matrix_string.split("\n")
        
        for index in range(len(self.matrix)):
            self.matrix[index]=list(map(int,self.matrix[index].split()))
            

    def row(self, index):
        return self.matrix[index-1]

    def column(self, index):
        return [self.matrix[i][index-1] for i in range(len(self.matrix))]
