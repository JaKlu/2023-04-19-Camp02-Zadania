package pl.it.camp.zjazd02_zadania;

/**
 * Napisz program w którym zdefiniowana jest zmienna n.
 * Program ma wyświetlać n elementów ciągu Fibonacciego.
 * Co to jest ciąg Fibonacciego znajdziecie na wikipedii.
 * Przykład:
 * n = 3
 * 0 1 1
 * n = 8
 * 0 1 1 2 3 5 8 13
 */
public class Zadanie04 {
    public static void main(String[] args) {
        fibonacci(0);
        fibonacci(1);
        fibonacci(2);
        fibonacci(3);
        fibonacci(8);
        fibonacci(93);  //max value while using long before overflow
    }

    public static void fibonacci(int n) {
        if (n <= 1) {
            System.out.println("0");
            return;
        }
        if (n == 2) {
            System.out.println("0 1");
            return;
        }

        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (long element : fib) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
