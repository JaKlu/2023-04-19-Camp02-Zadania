package pl.it.camp.zjazd02_zadania;

/**
 * Program zawiera zmienną n. Napisz program, który sprawdzi jaką potęgą liczby 2 jest liczba n.
 * Program powinien wyświetlać potęgę lub komunikat jeśli liczba n nie jest potęgą liczby 2.
 * Przykład:
 * n = 4
 * 2
 * n = 16
 * 4
 * n = 128
 * 7
 * n = 199
 * to nie jest potęga dwójki
 */
public class Zadanie06 {
    public static void main(String[] args) {
        isTheNumberAPowerOf2(1);
        isTheNumberAPowerOf2(5);
        isTheNumberAPowerOf2(8);
        isTheNumberAPowerOf2(115);
        isTheNumberAPowerOfX(4096, 2);
        isTheNumberAPowerOfX(16384, 2);
        isTheNumberAPowerOfX(19894, 2);
        isTheNumberAPowerOfX(78125, 5);
        isTheNumberAPowerOfX(40353607, 7);
    }

    public static void isTheNumberAPowerOf2(int n) {
        if (n == 1) {
            System.out.println("Liczba 1 to 2 do potęgi 0");
        }
        if (n == 2) {
            System.out.println("Liczba 2 to 2 do potęgi 1");
        }
        int square = 2;
        int p;
        for (int i = 2; i < n; i++) {
            p = i;
            square = square * 2;
            if (square == n) {
                System.out.printf("Liczba %d to 2 do potęgi %d%n", n, p);
                break;
            } else if (square > n) {
                System.out.printf("Liczba %d nie jest potęgą liczby 2%n", n);
                break;
            }
        }
    }

    public static void isTheNumberAPowerOfX(int n, int x) {
        if (n < 1) {
            System.out.printf("Liczba %d nie jest potęgą liczby %d%n", n, x);
        }
        if (n == 1) {
            System.out.printf("Liczba %d to %d do potęgi 0", n, x, x);
        }
        if (n == x) {
            System.out.printf("Liczba %d to %d do potęgi 1", n, x, x);
        }
        int square = x;
        int p;
        for (int i = 2; i < n; i++) {
            p = i;
            square = square * x;
            if (square == n) {
                System.out.printf("Liczba %d to %d do potęgi %d%n", n, x, p);
                break;
            } else if (square > n) {
                System.out.printf("Liczba %d nie jest potęgą liczby %d%n", n, x);
                break;
            }
        }
    }
}
