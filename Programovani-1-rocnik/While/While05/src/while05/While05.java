/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while05;

import java.util.Scanner;

/**
 *
 * @author auerovap
 */
public class While05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        int suma = 0;
        System.out.println("Zadejte číslo");
        int a = Integer.parseInt(sc.nextLine());
        while (a != 25) {
            suma += a;
            System.out.println("Zadejte číslo");
            a = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Suma je: " + suma);
    }
}
