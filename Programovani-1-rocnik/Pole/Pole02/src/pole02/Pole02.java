/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole02;

/**
 *
 * @author auerovap
 */
public class Pole02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pole = new int[21];
        pole[0] = 20;

        for (int i = 20; i > 0; i--) {
            pole[i] = i - 1;
            System.out.println(i);
        }
    }
}
