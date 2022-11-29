/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole09;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author auerovap
 */
public class Pole09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        String neznama;

        sc = new Scanner(System.in, "Windows-1250");

        String[] pecivo = {"rohlík", "chleba", "houska", "croissant", "bageta", "vánočka", "kobliha", "preclík", "dalamánek", "buchta"};
        Arrays.sort(pecivo);
        System.out.println("Zadejte pečivo:");
        neznama = sc.nextLine().toLowerCase();
        if (Arrays.binarySearch(pecivo, neznama) >= 0) {
            System.out.println("Tvoje pečivo jsem nalezl");
        } else {
            System.out.println("Tvoje pečivo neznám");
        }
    }
}
