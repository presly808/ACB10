package ua.artcode.utils;

/**
 * Created by serhii on 10/3/15.
 */
public class MatrixUtils {

    public static String rowToString(int[] row) {

        String res = "";
        for (int i = 0; i < row.length; i++) {
            res += row[i] + "  ";
        }

        return res;
    }

    public static String matrixToString(int[][] mat) {
        String res = "";
        for (int i = 0; i < mat.length; i++) {
            res += rowToString(mat[i]) + "\n";
        }

        return res;
    }

    public static String toString(int[][] mat) {
        String res = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                res += mat[i][j] + " ";
            }
            res += "\n";
        }

        return res;
    }

    /*
    * even row - with even numbers
    * odd row -odd numbers
    *
    * */
    public static int[][] genSpecificMas(int rowSize, int columnSize) {
        // genRandomNum -> Odd, Even
        // genRow -> Odd, Even
        // create matrix
        // put row into matrix
        int[][] matrix = new int[rowSize][columnSize];

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                matrix[i] = createEvenArr(columnSize);
            } else {
                matrix[i] = createOddArr(columnSize);
            }
        }
        return matrix;
    }

    private static int[] createEvenArr(int size) {
        int[] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = generateEvenNum();
        }

        return mas;
    }

    private static int[] createOddArr(int size) {
        int[] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = generateOddNum();
        }

        return mas;
    }

    private static int generateEvenNum() {
        int random = genRandomNum(25, 100);
        if (random % 2 == 0) {
            return random;
        } else {
            return random + 1;
        }
    }

    private static int generateOddNum() {
        int random = genRandomNum(25, 100);
        if (random % 2 == 0) {
            return random + 1;
        } else {
            return random;
        }
    }

    private static int genRandomNum(int left, int right) {
        return left + (int) (Math.random() * (right - left));
        //                       100 - 25
        //                        25 +  0...75
        //                        25 ... 100
    }
}
