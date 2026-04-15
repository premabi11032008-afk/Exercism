def saddle_points(matrix):
    if not matrix or not matrix[0]:
        return []

    rows = len(matrix)
    cols = len(matrix[0])
    points = []
    try:
        for i in range(rows):
            for j in range(cols):
                value = matrix[i][j]
                if value == max(matrix[i]):
                    if value == min([row[j] for row in matrix]):
                        points.append({"row":i+1,"column":j+1}) 
        return points
    except:
        raise ValueError("irregular matrix")
