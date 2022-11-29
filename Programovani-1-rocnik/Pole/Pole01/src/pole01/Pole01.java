/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole01;

/**
 *
 * @author auerovap
 */
public class Pole01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //pole je množina proměnných stejného datového typu
        int[] pole = new int[10]; //vytvořili jsme si pole (v závorce je počet)
        pole[0] = 1; //v indexu 0 je nastavena hodnota 1

        for (int i = 0; i < 10; i++) {
            pole[i] = i + 1;
        }
        for (int i = 0; i < pole.length; i++) {
            System.out.printf("%d", pole[i]);
        }
    }
}
