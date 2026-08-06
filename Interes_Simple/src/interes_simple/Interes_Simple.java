/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes_simple;

import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Interes_Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double interes = 0;
        double capital = 0;
        double tiempo = 0;
        int interes_anual = 0;

        System.out.println("Ingrese el capital :");
        capital = teclado.nextDouble();

        System.out.println("Ingrese el interes anual:");
        interes_anual = teclado.nextInt();

        System.out.println("ingres el tiempo en años:");
        tiempo = teclado.nextDouble();
        
        
        interes = ((capital * interes_anual * tiempo) / 100);
        
        System.out.printf("El interes generado es: %.2f\n", interes);

    }

}
