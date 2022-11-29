/*
 * Na vstupu se zadají dvě čísla a program vypíše součet, rozdíl, součin a podíl
 */
package uloha01;

import java.util.Scanner;

/**
 *
 * @author Pavlína Auerová
 */
public class Uloha01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float a;
        float b;
        float soucet;
        float rozdil;
        float soucin;
        float podil;
        Scanner sc;

        sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadejte první číslo ");
        //kontrola jestli to je číslo
        try {
            a = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }
        
        System.out.println("Zadejte druhé číslo ");
        try {
            b = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }

        soucet = a + b;
        System.out.print("Součet: ");
        System.out.printf("%.2f", soucet);
        System.out.print(System.lineSeparator());
        
        rozdil = a - b;
        System.out.print("Rozdíl: ");
        System.out.printf("%.2f", rozdil);
        System.out.print(System.lineSeparator());
        
        soucin = a * b;
        System.out.print("Součin: ");
        System.out.printf("%.2f", soucin);
        System.out.print(System.lineSeparator());
        
        if (b > 0) {      
            podil = a / b;
            System.out.print("Podíl: ");
        System.out.printf("%.2f", podil);
        System.out.print(System.lineSeparator());
        } else {
            System.err.println("Nulou nelze dělit");
            return;
        }
    }
}
