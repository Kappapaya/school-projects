/*
 * Program vypíše Fibonacciho posloupnost čísel
 */
package fibonaccihoposloupnost;

import java.util.Scanner;

/**
 *
 *
 * @author Pavlína Auerová
 */
public class FibonaccihoPosloupnost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] fibonacci = new int[16];

        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 16; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int i = 0; i < 16 - 1; i++) {
            System.out.print(fibonacci[i] + ",");
        }
        System.out.println(fibonacci[16 - 1]);

        System.out.print(System.lineSeparator());

        //druhý způsob
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte limit");
        int limit = Integer.parseInt(sc.nextLine());
        int vysledek = 0;
        int cislo1 = 1;
        int cislo2 = 0;

        System.out.printf("%d, ", cislo2);
        System.out.printf("%d, ", cislo1);

        while (vysledek <= limit) {
            vysledek = cislo1 + cislo2;
            cislo2 = cislo1;
            cislo1 = vysledek;

            if ((vysledek >= cislo2) && (vysledek <= limit)) {
                System.out.printf("%d, ", vysledek);
            }
        }
    }
}
