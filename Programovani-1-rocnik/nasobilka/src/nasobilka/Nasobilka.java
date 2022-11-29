/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasobilka;

/**
 *
 * @author auerovap
 */
public class Nasobilka {

    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.printf(" %d ", a * b);
            }
            System.out.println(" ");
        }
    }
}
