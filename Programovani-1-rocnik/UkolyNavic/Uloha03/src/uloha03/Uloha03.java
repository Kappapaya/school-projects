/*
 * Uživatel zadá starou a novou cenu, potom se vypíše rozdíl a o kolik % se cena změnila
 */
package uloha03;

import java.util.Scanner;

/**
 *
 * @author Pavlína Auerová
 */
public class Uloha03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        float staraCena;
        float novaCena;
        float rozdil;
        double procenta;
        
        sc = new Scanner(System.in, "Windows-1250");
        
        System.out.println("Zadejte starou cenu výrobku");
        try {
            staraCena = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }
        
        System.out.println("Zadejte novou cenu výrobku");
        try {
            novaCena = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }
        
        if (staraCena<novaCena) {
            System.err.println("Stará cena musí být vyšší než nová");
            return;
        }
        
        rozdil = staraCena - novaCena;
        procenta = rozdil * 100.00 / staraCena;

        
        System.out.print("Rozdíl mezi starou a novou cenou je: ");
        System.out.printf("%.2f", rozdil);
        System.out.print(System.lineSeparator());
        
        System.out.print("O kolik procent se změnila cena: " + procenta + "%");
        System.out.print(System.lineSeparator());
    }
}
