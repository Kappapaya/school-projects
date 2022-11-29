/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole03;

/**
 *
 * @author auerovap
 */
public class Pole03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nasobky = new int[10];
        nasobky[0] = 3;

        for (int i = 1; i <= 30; i++) {
            for (int j = 3; i <= 10; i++) {

                System.out.printf("%d", i * j);
                System.out.println(" ");
            }
        }
    }
}
