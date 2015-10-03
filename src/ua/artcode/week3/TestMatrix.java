package ua.artcode.week3;

import ua.artcode.utils.*;

public class TestMatrix {

    public static void main(String[] args) {
        int[][] mat = new int[5][3];

        /*  | | |
        * -
        * -
        * -
        * -
        * -
        *
        * */


        int[][] mat2 = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] mat4 = {{1,2,3},
                        {4,5,6,34},
                        {7,7,7}};

        /*System.out.println(mat4.length);
        System.out.println(mat4[0].length);*/

        int cell = mat4[1][1];

        int[] lastRow = mat4[mat4.length - 1];

        String res = MatrixUtils.toString(mat2);
        System.out.println(res);

    }
}
