/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclo_for;

import java.util.Scanner;

/**
 *
 * @author Lain 1 utlizar la estructura de repeticion del ciclo for 2. emplear
 * las constantes en programacion
 */
public class Ciclo_For {

    /**
     * algoritmo que permita calcular el porcentaje de votantes (mujeres
     * ,hombres) q hay en una cabina. indicar quienes fueron los que mas
     * votaron.
     */
    public static void main(String[] args) {
        /* System.out.println("Cilco for 1");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Cilco %d\n", i);
        }
        System.out.println("Cilco for 2");
        for (int i = 2; i < 10; i+=2) {
             System.out.printf("Cilco %d\n", i);
        }
         */
        Scanner teclado = new Scanner(System.in);

        final int NUMEROVOTANTES = 20;
        int numeVarones = 0;
        int numeMujeres = 0;
        char seleccion;
        for (int i = 0; i < NUMEROVOTANTES; i++) {
            System.out.println("""
                               Genero de votante
                               V. Varon-- M: Mujer""");
            seleccion = teclado.next().toUpperCase().charAt(0);
            switch (seleccion) {
                case 'V' -> {
                    System.out.println("""
                                       Varon entrando 
                                       ala cabina""");
                    numeVarones++;
                }
                case 'M' -> {
                    System.out.println("""
                                       Mujer entrando
                                       ala cabina""");
                    numeMujeres++;
                }

                default ->
                    System.out.println("Error de informacion");
            }
        }
        System.out.printf("EL numero de votantes Hombres es %d\n", numeVarones);
        System.out.printf("El numero de votantes mujeres es %d\n",numeMujeres);
    }
}