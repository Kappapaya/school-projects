/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole05;

import java.util.Arrays;

/**
 *
 * @author auerovap
 */
public class Pole05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] cisla = {5, 8, 15, 1, 4, 3, 10};
        Arrays.sort(cisla);
        for (int s : cisla ) {
            System.out.printf("%d", s);
            System.out.println(" ");
        }
    }
}
