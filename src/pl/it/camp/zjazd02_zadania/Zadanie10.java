package pl.it.camp.zjazd02_zadania;

import java.util.Random;

/**
 * Napisz program generujący 3 tablice 10 elementowe (liczby -20 do 20).
 * Program ma sprawdzić czy w każdej z tablic znajdują się 3 takie same elementy,
 * jeśli nie to generuje tablice ponownie.
 * Program ma wypisywać wygenerowane tablice oraz ilość ponownych generacji tablic.
 */
public class Zadanie10 {
    public static void main(String[] args) {
        int[] tab1, tab2, tab3;

        int tabSize = 10;
        int minBound = -20;
        int maxBound = 20;

        int counter = 0;
        int checkingTable2 = 0;
        int checkingTable3 = 0;

        boolean isMatchInAll = false;
        while (true) {
            tab1 = generateTable(tabSize, minBound, maxBound);
            tab2 = generateTable(tabSize, minBound, maxBound);
            tab3 = generateTable(tabSize, minBound, maxBound);

            for (int i = 0; i < tab1.length; i++) {
                boolean isMatchInTab2 = false;
                boolean isMatchInTab3 = false;
                for (int j = 0; j < tab2.length; j++) {
                    checkingTable2++;
                    if (tab1[i] == tab2[j]) {
                        isMatchInTab2 = true;
                        break;
                    }
                }
                if (isMatchInTab2) {
                    for (int j = 0; j < tab3.length; j++) {
                        checkingTable3++;
                        if (tab1[i] == tab3[j]) {
                            isMatchInTab3 = true;
                            break;
                        }
                    }
                }
                isMatchInAll = (isMatchInTab2 && isMatchInTab3);
                if (isMatchInAll) {
                    break;
                }
            }
            if (isMatchInAll) {
                printTable(tab1);
                printTable(tab2);
                printTable(tab3);
                System.out.println("Ponowne generacje tablic: " + counter);
                System.out.println("Porównania w tablicy 2: " + checkingTable2);
                System.out.println("Porównania w tablicy 3: " + checkingTable3);
                break;
            }
            counter++;
        }
    }

    public static int[] generateTable(int tableSize, int minBound, int maxBound) {
        int[] table = new int[tableSize];
        Random random = new Random();

        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(minBound, maxBound + 1);
        }
        return table;
    }

    public static void printTable(int[] table) {
        System.out.print("{");
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%4d", table[i]);
            if (i < table.length - 1) {
                System.out.printf(",");
            }
        }
        System.out.println("}");
    }
}
