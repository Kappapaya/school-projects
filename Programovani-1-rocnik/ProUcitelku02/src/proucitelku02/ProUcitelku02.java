/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proucitelku02;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class ProUcitelku02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        int pocet;
        int cislo;
        int[] cisla;
        int median;

        sc = new Scanner(System.in, "Windows-1250");
        // zadání počtu čísel
        System.out.println("Zadej počet čísel:");
        try {
            pocet = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.err.println("Chyba, musíte zadat číslo");
            return;
        }

        cisla = new int[pocet];
        // cyklus pro zadání všech čísel
        for (int i = 0; i < pocet; i++) {
            int pocitadlo = i + 1;
            System.out.printf("Zadej %d. číslo: ", pocitadlo);
            try {
                cislo = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("Chyba, musíte zadat číslo");
                return;
            }
            cisla[i] = cislo;
        }
        // výpočet mediánu
        Arrays.sort(cisla);
        median = cisla[pocet / 2];
        // zjištění odchylek od mediánu
        for (int i = 0; i < pocet; i++) {
            float odchylka = cisla[i] - median;
            System.out.printf("%d se od mediánu odchyluje o %f", cisla[i], odchylka);
            System.out.print(System.lineSeparator());
        }
    }

}
