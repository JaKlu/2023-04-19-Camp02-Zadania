package pl.it.camp.zjazd02_zadania;

import java.util.Random;

/**
 * Napisz program który generuje 10 elementową tablicę liczb (0 - 100)
 * a następnie przesuwa tą tablicę o 3 elementy w prawo.
 * Program ma wypisywać na ekranie pierwotną oraz przesuniętą tablicę.
 * Przykład:
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * [8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
 */
public class Zadanie05 {
    public static void main(String[] args) {
        int tabSize = 10;
        int minBound = 0;
        int maxBound = 101;

        int[] tab = new int[tabSize];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(minBound, maxBound);
        }
        printTable(tab);

        moveTableElementsRight(tab, 3);
        printTable(tab);
    }


    public static void moveTableElementsRight(int[] tab, int jump) {
        int temp;
        int lastIndex = tab.length - 1;
        for (int i = 0; i < jump; i++) {
            temp = tab[lastIndex];
            for (int j = 0; j <= lastIndex - 1; j++) {
                tab[lastIndex - j] = tab[lastIndex - 1 - j];
            }
            tab[0] = temp;
        }
    }

    public static void moveTableElementsRight(int[] tab) {
        moveTableElementsRight(tab, 1);
    }

    public static void printTable(int[] table) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < table.length; i++) {
            sb.append(table[i]);
            if (i < table.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}
