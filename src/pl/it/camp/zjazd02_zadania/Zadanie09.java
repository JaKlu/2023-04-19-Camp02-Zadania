package pl.it.camp.zjazd02_zadania;

import java.util.Random;

/**
 * Napisz program generujący tablicę liczb 10 elementową (liczby -7 do 7).
 * Program sprawdza czy tablica zawiera duplikaty, jeśli zawiera to generuje nową.
 * Program ma wyświetlić wygenerowaną tablicę bez duplikatów oraz ilość powtórnych generacji tablicy.
 */
public class Zadanie09 {
    public static void main(String[] args) {
        int tableSize = 10;
        int minBound = -7;
        int maxBound = 7;

        int[] tab = generateTable(tableSize, minBound, maxBound);
        int counter = 0;

        boolean flag = true;
        while (flag) {
            flag = false;
            outerLoop:
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (tab[i] == tab[j]) {
                        counter++;
                        tab = generateTable(tableSize, minBound, maxBound);
                        flag = true;
                        break outerLoop;
                    }
                }
            }
        }
        printTable(tab);
        System.out.println(counter);
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
