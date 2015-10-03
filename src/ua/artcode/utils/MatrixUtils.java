package ua.artcode.utils;

/**
 * Created by serhii on 10/3/15.
 */
public class MatrixUtils {

    public static String rowToString(int[] row){

        String res = "";
        for(int i = 0; i < row.length; i++){
            res += row[i] + "  ";
        }

        return res;
    }

    public static String matrixToString(int[][] mat){
        String res = "";
        for(int i = 0; i < mat.length; i++){
            res += rowToString(mat[i]) + "\n";
        }

        return res;
    }

    public static String toString(int[][] mat){
        String res = "";
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                res += mat[i][j] + " ";
            }
            res += "\n";
        }

        return res;
    }
}
