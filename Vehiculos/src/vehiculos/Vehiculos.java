/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.util.Scanner;

/**
 *
 * @author Lain objetivos: 1 seleccion simple a. estructura , tipos de condicion
 * 2. profundizar en formateo de cadenas (printf)
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* desarrollar un algoritmo q seleccion una marca que mejor situe a nuestro gusto
        siendo entonces cumplir
        el gusto de escoger un modelo particulas , mostras el mensaje alusivo
         */
        Scanner teclado = new Scanner(System.in);
        int respuesta = 0;
        System.out.println("Catalogo de vehiculos importados: ");
        System.out.printf("|%-20s| |%15s|\n", "Eriz Shop!!", "Importadora");
        System.out.println("""
                           -------------------
                           1.Toyota
                           2.Honda
                           3.Mitsubishi
                           4.Ferrari
                           5.Volkwagen
                           Seleccione su respuesta del 1-5: """);

        respuesta = teclado.nextInt();
        switch (respuesta) {
            case 1 -> {
                int elegir = 0;
                System.out.print("""
                                 ====== Catalogo de toyota ======
                                 1. Corolla
                                 2. Hilux
                                 3. 4Runner
                                 4. Tacoma
                                 Seleccione una respuesta del 1-4:\n """);
                elegir = teclado.nextInt();
                switch (elegir) {
                    case 1 ->
                        System.out.println("Disfrute su toyota Corolla");
                    case 2 ->
                        System.out.println("Disfrute de su Toyota Hilux");
                    case 3 ->
                        System.out.println("Disfrute de su Toyota 4Runner");
                    case 4 ->
                        System.out.println("Disfrute de su Toyota Tcacoma");
                    default ->
                        System.out.println("No esta en las opciones");

                }

            }

            case 2 ->{
                int elegir = 0;
                System.out.print("""
                                 ====== Catalogo de Honda ======
                                 1. Civic
                                 2. Acord
                                 3. CRV
                                 4. Pilot
                                 Seleccione una respuesta del 1-4:\n """);
                elegir = teclado.nextInt();
                switch (elegir) {
                    case 1 ->
                        System.out.println("Disfrute su Honda Civic");
                    case 2 ->
                        System.out.println("Disfrute de su Honda Acord");
                    case 3 ->
                        System.out.println("Disfrute de su Honda CRV");
                    case 4 ->
                        System.out.println("Disfrute de su Honda Pilot");
                    default ->
                        System.out.println("No esta en las opciones");
                }

                }
                
            case 3 ->{
                int elegir = 0;
                System.out.print("""
                                 ===== Catalogo de Mitsubishi ====
                                 1. L200
                                 2. Montero
                                 Seleccione una respuesta del 1-2:\n """);
                elegir = teclado.nextInt();
                switch (elegir) {
                    case 1 ->{
                        System.out.println("Disfrute de su L200");
                        System.out.printf("%s Carro de trabajo%s","\u001B[32m","\u001B[0m\n");
                    }
                        
                    case 2 ->{
                        System.out.println("Disfrute de su Montero");
                        System.out.printf("%s Carro de Lujo%s","\u001B[34m","\u001B[0m\n");
                    }
                    default ->
                        System.out.println("No esta en las opciones");
                }

                }
                
            case 4 ->{
                int elegir = 0;
                System.out.print("""
                                 ====== Catalogo de Ferrari ======
                                 1. Ferrari F80
                                 2. Ferrari Luce
                                 Seleccione una respuesta del 1-2:\n """);
                elegir = teclado.nextInt();
                switch (elegir) {
                    case 1 ->
                        System.out.println("Disfrute su Ferrari F80");
                    case 2 ->
                        System.out.println("Disfrute de su Ferrari Luce");
                  
                    default ->
                        System.out.println("No esta en las opciones");
                }

                }
                
            case 5 ->{
                int elegir = 0;
                System.out.print("""
                                 ===== Catalogo de Volkwagen =====
                                 1. Volkwagen Tiguan
                                 2. Volkwagen Tyron
                                 Seleccione una respuesta del 1-2:\n """);
                elegir = teclado.nextInt();
                switch (elegir) {
                    case 1 ->
                        System.out.println("Disfrute su Volkwagen Tiguan");
                    case 2 ->
                        System.out.println("Disfrute de su Volkwagen Tyron");
                  
                    default ->
                        System.out.println("No esta en las opciones");
                }

                }
                
            default ->
                System.out.print("No selecciono ninguna opcion del Menu \n");

        }// fin de main

    }
}
