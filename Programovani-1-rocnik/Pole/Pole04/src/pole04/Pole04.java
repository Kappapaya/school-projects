/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole04;

import java.util.Arrays;

/**
 *
 * @author auerovap
 */
public class Pole04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] simpsonovi = {"Homer", "Marge", "Lisa", "Bart", "Maggie"};
        Arrays.sort(simpsonovi);
        for (String a : simpsonovi) {
            System.out.printf("%d", a);
        }
    }
}
