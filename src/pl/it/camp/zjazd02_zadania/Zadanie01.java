package pl.it.camp.zjazd02_zadania;

/**
 * https://codingbat.com/prob/p183562
 * We want to make a row of bricks that is goal inches long.
 * We have a number of small bricks (1 inch each) and big bricks (5 inches each).
 * Return true if it is possible to make the goal by choosing from the given bricks.
 * This is a little harder than it looks and can be done without any loops.
 * makeBricks(3, 1, 8) → true
 * makeBricks(3, 1, 9) → false
 * makeBricks(3, 2, 10) → true
 */
public class Zadanie01 {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        if (goal > 5 * big + small) return false;
        if (goal % 5 > small) return false;
        return true;

    }

    public static boolean makeBricksBestICanWithoutLoop(int small, int big, int goal) {
        int bigBlocksToMultiply;
        if (big > goal / 5) {
            bigBlocksToMultiply = goal / 5;
        } else {
            bigBlocksToMultiply = big;
        }
        if (5 * bigBlocksToMultiply + small >= goal) {
            return true;
        }
        return false;
    }

    public static boolean makeBricksLoop(int small, int big, int goal) {
        for (int i = 0; i <= 5 * big; i += 5) {
            for (int j = 0; j <= small; j++) {
                if (i + j == goal) {
                    return true;
                }
            }
        }
        return false;
    }
}
