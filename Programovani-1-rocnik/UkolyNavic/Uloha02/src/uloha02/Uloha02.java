/*
 * Program vyzve uživatele, aby zadal 3 strany trojúhelníku a následně vypíše obvod a obsah
 */
package uloha02;

import java.util.Scanner;

/**
 *
 * @author Pavlína Auerová
 */
public class Uloha02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        float a;
        float b;
        float c;
        float obvod;
        float pulObvod;
        double obsah;

        sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadejte první stranu trojúhelníku ");
        try {
            a = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }
        if (a <= 0) {
            System.err.println("Nesmíte zadat záporné číslo");
            return;
        }

        System.out.println("Zadejte druhou stranu trojúhelníku ");
        try {
            b = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }
        if (b <= 0) {
            System.err.println("Nesmíte zadat záporné číslo");
            return;
        }
        
        System.out.println("Zadejte třetí stranu trojúhelníku ");
        try {
            c = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }
        if (c <= 0) {
            System.err.println("Nesmíte zadat záporné číslo");
            return;
        }

        obvod = a + b + c;
        pulObvod = obvod / 2;
        obsah = Math.sqrt(pulObvod * (pulObvod - a) * (pulObvod - b) * (pulObvod - c));

        System.out.print("Obvod: ");
        System.out.printf("%.2f", obvod);
        System.out.print(System.lineSeparator());
  
        System.out.print("Obsah: ");    
        System.out.printf("%.2f", obsah);   
        System.out.print(System.lineSeparator());   
    }

}
