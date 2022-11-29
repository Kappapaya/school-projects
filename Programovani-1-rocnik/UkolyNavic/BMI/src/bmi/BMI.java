/*
 * Ze zadaných informací vypočítá BMI
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author Pavlína Auerová
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        float hmotnost;
        float vyska;
        float bmi;
        float vypocetVysky;

        sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadejte hmotnost (v kg) ");
        try {
            hmotnost = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }
        if (hmotnost <= 0) {
            System.err.println("Nesmíte zadat záporné číslo");
            return;
        }

        System.out.println("Zadejte výšku (v cm) ");
        try {
            vyska = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }
        if (vyska <= 0) {
            System.err.println("Nesmíte zadat záporné číslo");
            return;
        }

        vypocetVysky = vyska / 100;
        bmi = hmotnost / (vypocetVysky * vypocetVysky);
        System.out.printf("Vaše BMI je %.2f", bmi);
        System.out.print(System.lineSeparator());

        if (bmi < 18.5) {
            System.out.println("Máte podváhu.");
        } else if ((bmi >= 18.5) && (bmi <= 24.99)) {
            System.out.println("Máte optimální váhu.");
        } else {
            System.out.println("Máte nadváhu.");
        }
    }
}
