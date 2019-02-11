package s22_matrices;

class MatrixFun {

    int[][] mat; //instance var / data field

    public MatrixFun(int numRows, int numCols) {
        //instantiate the matrix
        mat = new int[numRows][numCols];
    }

    public void setSpot(int row, int col, int val) {
        //set spot [row, col] to val
        mat[row][col] = val;
    }

    public String toString() {
        String output = "";
        for (int r = 0; r < mat.length; r++) {
            output += "row " + r + " ";
            for (int c = 0; c < mat[0].length; c++) {
                output += String.format("%4d", mat[r][c]);
            }
            output += "\n";
        }
        return output;
    }

}

public class MatrixInstanceVars {

    public static void main(String args[]) {
        MatrixFun theMat = new MatrixFun(2, 3);
        theMat.setSpot(1, 1, 6);
        theMat.setSpot(0, 1, 3);
        System.out.println(theMat);
    }
}
