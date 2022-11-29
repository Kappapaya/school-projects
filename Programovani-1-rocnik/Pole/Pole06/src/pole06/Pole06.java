/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole06;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author auerovap
 */
public class Pole06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        
        String[] simpsonovi = {"Marge", "Homer", "Bart", "Lisa", "Maggie"};
        System.out.println("Zadej jméno Simpsonových");
        String simpson = sc.nextLine();
        Arrays.sort(simpsonovi);
        int pozice = Arrays.binarySearch(simpsonovi, simpson);
        if (pozice >= 0) {
            System.out.println("Je to Simpson");
        } else {
            System.out.println("Hele, tohle není Simpson");
        }
    }
}
