/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package podminky1;
import java.util.Scanner;

/**
 *
 * @author auerovap
 */
public class Podminky1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte číslo:");
        int cislo = Integer.parseInt(sc.nextLine());
        if (cislo > 0) {
            System.out.println("Zadal jsi číslo větší než 0. Můžeš vypočítat odmocninu.");

            double odmocnina = Math.sqrt(cislo);
            System.out.println("Odmocnina z čísla " + cislo + " je " + odmocnina);
        } else {
            System.out.println("Odmocnina ze záporného čísla neexistuje");
        }
    }
}
