/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author Lain Desarrollar un algoritmo que me permite convertir valores de
 * longitud de acuerdo ala base que se tenga. pulgadas- centimetros
 * kilometros-millas grados celsius a grados farenheit
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declarar variables
        Scanner teclado = new Scanner(System.in);
        int pulgada = 0;
        double resultadoCM = 0;
        double kilometros = 100;
        double millas = 0;
        double celcio = 0;
        double faren = 0;

        System.out.println("Tenemos 5 pulgadas");
        System.out.println("Cuanto es eso en CM?");

        pulgada = 5;

        resultadoCM = pulgada * 2.54;
        System.out.printf("%d pulgadas es equivalente a %.2f cm \n", pulgada, resultadoCM);

        pulgada = 12;
        resultadoCM = pulgada * 2.54;

        System.out.printf("%.2f cm es equivalente a %d pulgadas\n", resultadoCM, pulgada);
        System.out.println("Dime cuantas millas son; ");

        kilometros = teclado.nextDouble();
        millas = kilometros / 1.6;

        System.out.printf("%.2f km es = a %.3f millas\n", kilometros, millas);
        System.out.print(kilometros + " km es equivalente a " + millas + " millas\n");
        System.out.print("Ingrese los celcius : ");
        celcio = teclado.nextDouble();
        faren = (celcio * 1.8) + 32;
        System.out.println(celcio + " Celsius son = " + faren + " Farenheit");

    }// fin de main

}// fin de class

