/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, opcion, resultado;
        double resultado2;
        
        System.out.print("Ingrese el primer numero:\n");
        numero1 = teclado.nextInt();
        
        System.out.print("Ingrese el segundo numero:\n");
        numero2 = teclado.nextInt();
        System.out.println("""
                         =========Calculadora de seleccion:==========
                         1. Suma
                         2. Resta
                         3. Division
                         4. Multiplicacion
                         5. Modulo %
                         eligir una opcion """);
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1 -> {
                resultado = numero1 + numero2;
                System.out.printf("El resultado de la suma es %d\n", resultado);
            }
            case 2 -> {
                resultado = numero1 - numero2;
                System.out.printf("El resultado de la resta es %d\n", resultado);
            }
            case 3 ->{
                resultado2 = (double)numero1 / numero2;
                System.out.printf("El resultado de la division es %.2f\n", resultado2);
            }
            case 4->{
                resultado = numero1 * numero2;
                System.out.printf("El resultado de la multiplicacion es %d\n", resultado);
            }
            case 5 ->{
                 resultado = numero1 % numero2;
                System.out.printf("El resultado del Modulo es %d\n", resultado);
            }
            default ->
                System.out.println("opcion invalida ");
        }
    }
}
