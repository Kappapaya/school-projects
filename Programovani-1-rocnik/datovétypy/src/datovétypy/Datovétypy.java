/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datovétypy;

import java.util.Scanner;

/**
 *
 * @author auerovap
 */
public class Datovétypy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float f = 3.14F;
        double d = 2.72D;

        char c = 'A';

        boolean b = false;
        boolean vyraz = (15 > 5);
        System.out.println(b);
        System.out.println(vyraz);

        String s = "Smrkonosoplena";
        System.out.println(s.startsWith("smrk"));
        System.out.println(s.endsWith("lena"));
        System.out.println(s.contains("sopl"));

        String konfig = "Fullscreen shaDows autosave";
        konfig = konfig.toLowerCase(); // toUpperCase = velká písmena a toLowerCase = malá písmena
        System.out.println("Poběží hra ve fullscreenu?");
        System.out.println(konfig.contains("fullscreen"));
        System.out.println("Budou zapnuté stíny?");
        System.out.println(konfig.contains("shadows"));
        System.out.println("Přeje si hráč vypnout zvuk?");
        System.out.println(konfig.contains("nosound"));
        System.out.println("Přeje si hráč hru automaticky ukládat?");
        System.out.println(konfig.contains("autosave"));

        Scanner sc = new Scanner(System.in, "Windows-1250"); //trim
        System.out.println("Zadejte číslo:");
        String t = sc.nextLine();
        System.out.println("Zadal jste text: " + t);
        System.out.println("Text po funkci trim "
                + "" + t.trim());
        int a = Integer.parseInt(t.trim());
        System.out.println("Převedl jste zadaný text na číslo parsováním, zadal jste: " + a);

        String r = "C je nejlepší!"; //replace
        r = r.replace("C", "Java");
        System.out.println(r);

        int k = 10;
        int l = 20;
        int m = k + l;

        String n = String.format("Když sečteme %d a %d, dostaneme %d", a, b, c);
        System.out.println(n);

        System.out.println("Zadejte vaše jméno:"); //Length
        String jmeno = sc.nextLine();
        System.out.printf("Délka vašeho jména je: %d", jmeno.length());
    }
}
