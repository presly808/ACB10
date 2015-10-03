package ua.artcode.week3;

import java.util.Arrays;

/**
 *
 */
public class TestString {

    public static void main(String[] args) {
        // create

        String s1 = "abcdf";

        String s2 = new String("Kolia");

        char[] mas = {'a','g','s'};
        String s3 = new String(mas);

        // use

        // show inner structure
        // go to javadoc, find class
        char ch0 = s1.charAt(0); // a

        int unicodeIndex = s1.codePointAt(0);

        int compareRes = s1.compareTo("bbbb"); // negative number

        String sum = s1.concat("bbbb"); // s1 + "bbbb"

        boolean contains = s1.contains("bc");

        boolean contEq = "abc".contentEquals("abc");
        boolean eqRes = "some".equals("abc");


        "some".endsWith("e");
        "sss".compareToIgnoreCase("SSS");

        String abcd = "accbacdc";
        int position = abcd.indexOf("c"); // find first
        char ch = abcd.charAt(position);


        boolean isEmpty = "".isEmpty();
        int charCount = "asdfsdaf".length();

        // String.length();

        int lastIndex = "asdfasdfdfsdafa".lastIndexOf("f");

        char[] arr = "asdfs".toCharArray();

        String lower = "sSfSDfDF".toLowerCase();
        String upper = "ssdfsdf".toUpperCase();

        String names = "Kolia Vasia Andrey";
        //              0123456789
        // [6,11)
        String name = names.substring(6,11);


        String[] parts = names.split(" ");

        System.out.println(Arrays.toString(parts));



    }
}
