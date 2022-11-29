/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole07;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author auerovap
 */
public class Pole07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        int[] cisla = {5, 8, 15, 6, 3, 2, 1, 20, 30};
        System.out.println("Zadej číslo ");
        int cislo = Integer.parseInt(sc.nextLine());
        Arrays.sort(cisla);
        int index = Arrays.binarySearch(cisla, cislo);
        if (index >= 0) {
            System.out.println("Číslo je v seznamu");
        } else {
            System.out.println("Číslo není v seznamu");
        }
    }
}
