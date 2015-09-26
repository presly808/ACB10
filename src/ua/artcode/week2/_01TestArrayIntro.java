package ua.artcode.week2;


public class _01TestArrayIntro {

    public static void main(String[] args) {

        // just create arr, default init
        // <type>[] <name> = new <type>[<size>];
        // create and init
        // <type>[] <name> = {<el1>,<el2>,<el3>,...};
        // <type>[] <name> = {};
        // <type>[] <name> = {<el1>};


        int[] mas = new int[5]; // 0,0,0,0,0
                                // 0 1 2 3 4 ...
        int first = mas[0];
        int size = mas.length;
        int last = mas[mas.length - 1];

        System.out.println();

        //           new char[0] - {}
        char[] arr = {'a','b','c'};

        char[] newArr = new char[arr.length + 1];
        newArr[0] = arr[0];
        newArr[1] = arr[1];
        newArr[2] = arr[2];
        newArr[3] = 'd';

        String[] friends = {"Kostia","Tania","Jenia","Serhii"};

        String[] contacts = new String[5];

        contacts[0] = friends[0];
        contacts[1] = friends[0];

        System.out.println();

        System.out.println(friends[0] + " " + friends[1] + " " + friends[2] + " " + friends[3]);

    }
}
