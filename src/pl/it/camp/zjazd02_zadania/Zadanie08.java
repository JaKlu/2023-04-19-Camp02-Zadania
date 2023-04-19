package pl.it.camp.zjazd02_zadania;

/**
 * Napisz program w którym jest tablica zawierająca liczby od 2 do 101 (włącznie).
 * Program ma wypisać liczby pierwsze znajdujące się w tej tablicy.
 * Należy wykorzystać sito Eratostenesa. Sito Eratostenesa znajdziecie na wikipedii.
 */
public class Zadanie08 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        for (int i = 2; i < tab.length + 2; i++) {
            tab[i - 2] = i;
        }
        printTable(tab);

        sieveOfEratosthenes(tab);
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

    public static void sieveOfEratosthenes(int[] table) {
        int counter = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 2; j < Math.sqrt(table[table.length - 1]); j++) {
                if (table[i] % j == 0) {
                    table[i] = 0;
                    counter++;
                    break;
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i] > 0) {
                System.out.print(table[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Counter: " + counter);
    }
}
