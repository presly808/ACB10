package ua.artcode.week2;

import ua.artcode.utils.ArrayUtils;

/**
 * Created by serhii on 27.09.15.
 */
public class _06TestArrayUtils {

    public static void main(String[] args) {
        String desc = "user class, method main";

        int size = 10;

        int[] mas = ArrayUtils.genRandomMas(size);
        ArrayUtils.printArr(mas);


        int minValue = ArrayUtils.findMin(mas);

        System.out.println("MIN IN ARR " + minValue);

    }


}
