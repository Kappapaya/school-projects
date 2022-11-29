/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retezec;

/**
 * Zpracovatel textového řetězce
 *
 * @author Pavlína Auerová
 */
public class Zpracovatel {

    /**
     * Zpracovávaný řetězec
     */
    private final String retezec;

    /**
     * Konstruktor
     *
     * @param retezec
     */
    public Zpracovatel(String retezec) {
        this.retezec = retezec;
    }

    public int pocetZnaku() {
        int pocet = this.retezec.length();
        return pocet;
    }

    public char prvniZnak() {
        return this.retezec.charAt(0);
    }

    public char posledniZnak() {
        int pocetZnaku = this.retezec.length();
        return this.retezec.charAt(pocetZnaku - 1);
    }

    public String malyPismena() {
        return this.retezec.toLowerCase();
    }

    public String velkyPismena() {
        return this.retezec.toUpperCase();
    }

    public String obracene() {
        return new StringBuilder(this.retezec).reverse().toString();
    }

    public String bezMezer() {
        return this.retezec.replaceAll("\\s+", "");

    }
}
