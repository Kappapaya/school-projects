/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulacka;
import java.util.Scanner;
/**
 *
 * @author tomas
 */
public class Kalkulacka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float prvniCislo;
        float druheCislo;
        char operator;
        float vysledek;
        Scanner sc;
        
        
        sc = new Scanner (System.in, "Windows-1250");
        System.out.println("Zadejte první číslo ");
        try{
            prvniCislo = Float.parseFloat(sc.nextLine());
        } 
        catch (Exception ex) 
        {
            System.out.println("Nebylo zadáno číslo!");
            return;
        }
        System.out.println("Zadejte operátor ");
        try
        {
            operator = sc.nextLine().charAt(0);
        }
        catch (Exception b)
        {
            System.out.println("Nebyl zadán operátor!");
            return;
        }
        // ošetření vstupu operátoru
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/')
        {
            System.out.println("Zadejte operátor + - * /");
            return;
        }
        System.out.println("Zadejte druhé číslo ");
        try 
        {
            druheCislo = Float.parseFloat(sc.nextLine());
        }
        catch (Exception e)
        {
            System.out.println("Nebylo zadáno číslo!");
            return;
        }
        vysledek = Vypocet(prvniCislo, druheCislo, operator);
        
        if (vysledek != Float.NaN)
        {
            System.out.println("Výsledek je " + vysledek);
        }
    }
    
    private static float Vypocet (float prvniCislo, float druheCislo, char operator){
    
        float vysledek = 0;
        
        switch (operator)
        {
            case '+':
                vysledek = prvniCislo + druheCislo;
                break;
            case '-':
                vysledek = prvniCislo - druheCislo;
                break;
            case '*':
                vysledek = prvniCislo * druheCislo;
                break;
            case '/':
                if (druheCislo == 0)
                {
                    System.out.println("Druhé číslo nesmí být 0");
                    return Float.NaN;
                }
             
                vysledek = prvniCislo / druheCislo;
                break;
                
                
        }
        
        return vysledek;
    }
    
}
