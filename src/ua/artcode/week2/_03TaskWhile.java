package ua.artcode.week2;

/**
 * Ctrl + Alt + L
 */
public class _03TaskWhile {
    public static void main(String[] args) {
        int i = 100;

        while (i >= 0) {
            i /= 2;
            System.out.print(i + " ");
            i -= 2; // i = i - 2
        }
    }
}
