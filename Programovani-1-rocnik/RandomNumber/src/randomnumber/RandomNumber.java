/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;
/**
 * Náhodná čísla od 1 do 50 - nekonečné
 * @author Pavlína Auerová
 */
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int random;
        while (true) {
            random = (int) (Math.random() * 50 + 1);
            System.out.println(random);
        }
    }

}
