package s22_matrices;

// A+ Computer Science
// www.apluscompsci.com
//Matrix output example 3 
import static java.lang.System.*;

public class MatrixOutThree {

    public static void main(String args[]) {
        int[][] mat = {{5, 6, 8, 9},
        {2, 3, 5, 0},
        {4, 5, 9, 3}};

        //add in a nested loop to print out mat
        for (int r = 0; r < mat.length; r++) {
            System.out.print("row " + r + "   ");
            for (int c = 0; c < mat[r].length; c++) {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println("");
        }
        /*
         * row 0 5 6 8 9
         * row 1 2 3 5 0
         * row 2 4 5 9 3
         */
    }
}
