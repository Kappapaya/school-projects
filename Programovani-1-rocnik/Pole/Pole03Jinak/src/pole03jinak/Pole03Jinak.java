/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole03jinak;

/**
 *
 * @author auerovap
 */
public class Pole03Jinak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pole = new int[10];
        pole[0] = 1;
        int j = 3;

        for (int i = 0; i < 10; i++) {
            pole[i] = i * j;
            System.out.printf("%d", pole[i]);
        }
    }
}
