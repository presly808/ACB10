package ua.artcode.week1;

/**
 * Created by serhii on 20.09.15.
 */
public class _2DataTypeOperation {


    public static void main(String[] args) {
        // data types fighting
        int i = 23 + 45;

        // 4 <- 8
        double a = 45 * 23.2;
        // 8 <- 4
        double d = 34 * 234;

        /*
        *                  char
        *                    |
        * byte -> short -> int -> long
        *                    !  \
        *                  float  double
        *
        * */
        int i1 = 23;
        long l1 = i1;
        float f1 = i1;
        double d1 = l1;


        i1 = (int) l1;


        double d2 = 678.73;
        int cast = (int)d2;
        System.out.println(cast);



    }

    public static void go(){
        int a = 89;
        a++;
        System.out.println(a);
    }

    public static void foo(){
        System.out.println("Hello");
    }

}
