/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retezec;
import java.util.Scanner;
/**
 * Libovolný textový řetězec - funkce
 * @author Pavlína Auerová
 */
public class Retezec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadejte libovolný textový řetězec.");
        Scanner sc = new Scanner (System.in, "Windows-1250");
        String veta = sc.nextLine();
        //zjistíme počet znaků řetězce
        Zpracovatel z = new Zpracovatel(veta);
        System.out.println("Řetězec má " + z.pocetZnaku() + " znaků.");
        System.out.println("První znak je " + z.prvniZnak());
        System.out.println("Poslední znak je " + z.posledniZnak());
        System.out.println(z.malyPismena());
        System.out.println(z.velkyPismena());
        System.out.println(z.obracene());
        System.out.println(z.bezMezer());
    }
    
}


