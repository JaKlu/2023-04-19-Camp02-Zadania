package pl.it.camp.zjazd02_zadania;

import java.util.Random;

/**
 * Napisz program, który generuje 30 elementową tablicę (liczby 0 - 100).
 * Program powinien wypisywać na ekranie wygenerowaną tablicę oraz drugą największą liczbę w tablicy.
 * Przykład:
 * [1,2,3,4,5,6]
 * 5
 * [2,3,6,9,34,35}
 * 34
 * [65,23,76,45,34,12}
 * 65
 */
public class Zadanie07 {
    public static void main(String[] args) {
        int[] tab = generateTable(10, 0, 100);

        printTable(tab);

        printNextMax(tab, 2);
    }

    public static int findMax(int[] table) {
        int max = table[0];
        for (int i = 0; i < table.length; i++) {
            if (table[i] > max) {
                max = table[i];
            }
        }
        return max;
    }

    public static int findMin(int[] table) {
        int min = table[0];
        for (int i = 0; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
            }
        }
        return min;
    }

    public static void printNextMax(int[] table, int whichMax) {
        if (whichMax>table.length || whichMax<0){
            System.out.println("Błędny zakres");
            return;
        }
        int currentMax = findMax(table);
        int min = findMin(table);
        for (int i = 0; i < whichMax - 1; i++) {
            int max = min;
            for (int j = 0; j < table.length; j++) {
                if (table[j] > max && table[j] < currentMax) {
                    max = table[j];
                }
            }
            currentMax = max;
        }
        System.out.println(currentMax);
    }

    public static int[] generateTable(int tableSize, int minBound, int maxBound) {
        int[] tab = new int[tableSize];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(minBound, maxBound + 1);
        }
        return tab;
    }

    public static void printTable(int[] table) {
        StringBuilder sb = new StringBuilder().append("[");
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
