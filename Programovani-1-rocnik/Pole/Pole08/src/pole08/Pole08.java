/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole08;

import java.util.Scanner;

/**
 *
 * @author auerovap
 */
public class Pole08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Kolik známek chcete zprůměrovat?");
        int pocet = Integer.parseInt(sc.nextLine());
        int[] cisla = new int[pocet];
        for (int i = 0; i < pocet; i++) {
            System.out.printf("Zadejte %d číslo: ", i + 1);
            cisla[i] = Integer.parseInt(sc.nextLine());
        }
        int soucet = 0;
        for (int i : cisla) {
            soucet += i;
        }
        float prumer = soucet / cisla.length;
        System.out.printf("Průměr známek je: %f", prumer);
    }

}
