package ua.artcode.utils;

public class ArrayUtils {


    public static int[] genRandomMas(int size) {
        int[] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            int random = (int) (Math.random() * 100);// 75
            mas[i] = random;
        }
        return mas;
    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static int findMin(int[] mas){

        int min = mas[0];


        for (int i = 0; i < mas.length; i++) {
            if(mas[i] < min){
                min = mas[i];
            }
        }

        return min;
    }


}
