/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuento_tienda;

import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Descuento_tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int edad;
        String membresia;
        double compra, descuento, ftotal;

        System.out.print("Ingrese su edad:\n");
        edad = teclado.nextInt();
        System.out.print("ingrese el valor de la compra del juego:\n");
        compra = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.print("Usted tiene membresia si o no\n");
        membresia = teclado.nextLine().toUpperCase();

        if (edad >= 18) {

            if (edad > 65 || membresia.equals("SI")) {
                System.out.print("Su descuento es del 20%\n");
                descuento = compra * 0.20;
                ftotal = compra - descuento;
            } else {
                System.out.print("Su descuento es del 10%\n");
                descuento = compra * 0.10;
                ftotal = compra - descuento;
            }
        } else {
            if (edad > 12 || membresia.equals("SI")) {
                System.out.print("Su descuento es del 15%\n");
                descuento = compra * 0.15;
                ftotal = compra - descuento;
            } else {
                System.out.print("Usted no tiene descuento\n");
                descuento = 0;
                ftotal = compra - descuento;
            }
        }
        System.out.printf("el valor del juego es %.2f\n", compra);
        System.out.printf("su descuento es del %.2f \n", descuento);
        System.out.printf("El valor final a pagar es %.2f\n", ftotal);

    }

}
