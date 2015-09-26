package ua.artcode.week2;

/**
 * Created by serhii on 26.09.15.
 */
public class _05WhileArray {

    public static void main(String[] args) {

        int[] mas = {45,23,11,67,56};

        int index = 0;// mas.length - 1;
        while(index < mas.length){
            System.out.print(mas[index] + " ");
            index++;
        }

        for(int i = mas.length - 1; i >= 0; i--){
            System.out.print(mas[i] + " ");
        }

    }



}
