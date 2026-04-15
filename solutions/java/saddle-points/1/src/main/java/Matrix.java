import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Matrix {

    private List<List<Integer>> matrix;
    private int rows; private int cols;
    private int[] rowMax; private int[] colMin;

    Set<MatrixCoordinate> saddle_points = new HashSet<>();

    Matrix(List<List<Integer>> values) {
this.matrix=values;

if (matrix.isEmpty())return;
        
 this.rows = matrix.size();
 this.cols = matrix.get(0).size();

this.rowMax = new int[rows];
this.colMin = new int[cols];

for (int c = 0; c < cols; c++) {
    colMin[c] = Integer.MAX_VALUE;
}

for (int r = 0; r < rows; r++) {
    int maxValue = Integer.MIN_VALUE;
    for (int c = 0; c < cols; c++) {
        int value = matrix.get(r).get(c);
        if (value > maxValue) maxValue = value;
        if (value < colMin[c]) colMin[c] = value;
        }
rowMax[r] = maxValue;
}}

    Set<MatrixCoordinate> getSaddlePoints() {
        for (int r = 0; r < rows; r++) {
    for (int c = 0; c < cols; c++) {
        int value = matrix.get(r).get(c);
        if (rowMax[r]==value && colMin[c]==value){
            this.saddle_points.add(new MatrixCoordinate(r+1, c+1));
        }
    }}
        
        return saddle_points;
    }
}