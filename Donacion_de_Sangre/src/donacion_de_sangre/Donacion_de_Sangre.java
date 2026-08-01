/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacion_de_sangre;

import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Donacion_de_Sangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Desarrollar un algoritmo que permita determinar si el usuario puede
         * donar sangre o no, basandose en su edad (18 - 65) y peso (Mas de 110
         * lbs). Si se llega a cumplir los criterios antes expuestos, solo se
         * podra donar sangre si ha comido.
         *
         * Otro elemento que se tiene que considerar para poder donar sangre es
         * tener el nivel de hierro/hemoglobina en la sangre en los niveles
         * adecuados. Para los hombres tiene que ser mas de 14 y las mujeres mas
         * de 12
         *
         */
        Scanner teclado = new Scanner(System.in);
        int edad = 0;
        double peso = 0;
        double sangre = 0;
        boolean respuesta;
        String sexo;
        char comida = '0';
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();

        System.out.println("Ingrese su peso: ");
        peso = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Usted ya desayuno? si o no");
        comida = teclado.nextLine().charAt(0);

        if (edad >= 18 && edad <= 65 && peso >= 110 && comida == 'S' || comida == 's') {
            System.out.println("Cual es el nivel de hierro en la sangre :");

            sangre = teclado.nextDouble();

            teclado.nextLine();

            System.out.println("escriba si es hombre o mujer:");
            sexo = teclado.nextLine();
            respuesta = sexo.equalsIgnoreCase("hombre");
            if (sangre >= 12 && !respuesta) {
                System.out.println("Puede donar sangre siendo mujer.");
            } else if (sangre >= 14 && respuesta) {
                System.out.println("siendo hombre puede donar sangre. ");

            }else{
                System.out.println("No puede donar sangre no cumple con los requisitos");
            }

        } else {
            System.out.println("lastimosamente no puede donar sangre");
        }
    }

}
