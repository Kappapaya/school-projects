/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole10;

import java.util.Scanner;

/**
 *
 * @author auerovap
 */
public class Pole10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        int slov;
        String pokracovat;
        String slovo;
        boolean nalezenoOvoce;
        boolean nenalezenoOvoce;
        boolean nalezenaZelenina;

        sc = new Scanner(System.in, "Windows-1250");
        String[] ovoce = {"jablko", "hruška", "banán", "pomeranč", "broskev", "jahoda"};
        String[] zelenina = {"paprika", "rajče", "cibule", "česnek", "mrkev", "salát", "brokolice"};

        slov = 0;
        pokracovat = "ano";

        while (pokracovat.equals("ano")) {
            System.out.println("Zadejte název libovolného ovoce nebo zeleniny:");
            slovo = sc.nextLine().toLowerCase().trim();

            nalezenoOvoce = false;
            nalezenaZelenina= false;

            for (String s : ovoce) {
                if (slovo.equals(s)) {
                    System.out.println("Nalezeno ovoce");
                    nalezenoOvoce = true;
                }
            }
            if (!nalezenoOvoce) {
                for (String s : zelenina) {
                    if (slovo.equals(s)) {
                        System.out.println("Nalezena zelenina");
                        nalezenaZelenina = true;
                    }}
                    if (!nalezenoOvoce && !nalezenaZelenina) {
                        System.out.println("Tvoje slovo nemám v seznamu");
                    }
                    slov++;
                    System.out.println("Přeješ si další slovo? (ano/ne)");
                    pokracovat = sc.nextLine().trim().toLowerCase();
                }
                System.out.printf("Zadal jsi %d slov", slov);
            }
        }
    }

