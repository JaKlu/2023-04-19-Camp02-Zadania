package pl.it.camp.zjazd02_zadania;

/**
 * https://codingbat.com/prob/p117019
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
 * Return 0 if they both go over.
 * blackjack(19, 21) → 21
 * blackjack(21, 19) → 21
 * blackjack(19, 22) → 19
 */
public class Zadanie03 {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));

    }

    public static int blackjack(int a, int b) {
        int valueOfA = a;
        if (valueOfA > 21 || valueOfA <= 0) {
            valueOfA = 0;
        }

        int valueOfB = b;
        if (valueOfB > 21 || valueOfB <= 0) {
            valueOfB = 0;
        }

        if (valueOfA > valueOfB) {
            return valueOfA;
        } else {
            return valueOfB;
        }
    }

    public static int blackjackBestICan(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }

        if (a > 21 && b > 21) {
            return 0;
        }
        if (a <= 21 && b <= 21) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        } else if (a <= 21 || b <= 21) {
            if (a > b) {
                return b;
            } else {
                return a;
            }
        } else if (a > b) {
            return b;
        } else {
            return a;
        }
    }

}
