/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebajava;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class PruebaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Mi primer programa");
        ArrayList<Integer> enteros=new ArrayList<>();
        enteros.add(10);
        enteros.add(12);
        for (Integer entero : enteros) {
            System.out.println(entero);
        }
    }
    
}
