/*
 * Ze zadané hrubé mzdy vypočítá výplatu
 */
package mzda;

import java.util.Scanner;

/**
 *
 * @author Pavlína Auerová
 */
public class Mzda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        float hrubaMzda;
        float dan;
        float zdravotniP;
        float socialniP;
        float zaloha;
        float vyplata;

        sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadejte hrubou mzdu zaměstnance");
        try {
            hrubaMzda = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }
        if (hrubaMzda <= 0) {
            System.err.println("Nesmíte zadat záporné číslo");
            return;
        }

        System.out.println("Zadejte zálohu zaměstnance");
        try {
            zaloha = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }
        if (zaloha <= 0) {
            System.err.println("Nesmíte zadat záporné číslo");
            return;
        }

        dan = hrubaMzda * 15 / 100;
        zdravotniP = hrubaMzda * 6 / 100;
        socialniP = hrubaMzda * 13 / 100;

        vyplata = hrubaMzda - dan - socialniP - zdravotniP - zaloha;

        System.out.printf("Vaše výplata je %.2f Kč.", vyplata);
        System.out.print(System.lineSeparator());
    }
}
