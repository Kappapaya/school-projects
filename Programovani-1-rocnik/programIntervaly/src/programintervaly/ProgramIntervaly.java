/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programintervaly;
import java.util.Scanner;

/**
 *
 * @author auerovap
 */
public class ProgramIntervaly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadejte levou mez 1. intervalu: ");
        int levaMez1 = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte pravou mez 1. intervalu: ");
        int pravaMez1 = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte levou mez 2. intervalu: ");
        int levaMez2 = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte pravou mez 2. intervalu: ");
        int pravaMez2 = Integer.parseInt(sc.nextLine());

        int soucet;
        for (int a = levaMez1; a <= pravaMez1; a++) {
            for (int b = levaMez2; b <= pravaMez2; b++) {
                soucet = a + b;
                if (((soucet <= pravaMez2) && (soucet >= levaMez2)) || ((soucet <= pravaMez1) && (soucet >= levaMez1))) {
                    System.out.println("[%d,%d]" + "," + a + b);
                }
            }
        }
    }
}
