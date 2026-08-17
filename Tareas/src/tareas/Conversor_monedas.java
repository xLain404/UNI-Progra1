/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareas;

import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Conversor_monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double medida_pie;
        double kilo_a_libra;
        double cm_pulgada;
        int opcion;
        double medida;
        do{
            System.out.println("Ingrese la magnitud a covertir no pueden ser negativos");
            medida =teclado.nextDouble();
            if(medida==0){
                System.out.println("error vuelva a ingresar el dato");
            }
        }while(medida<0);
        do {
            System.out.println("""
                               ===== Menu de conversiones
                               1. metros a pies
                               2. Kilogramos a libras
                               3. Centimetros a pulgadas
                               4. salir
                               elija una opcion""");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1 ->{
                   System.out.println("convirtiendo metros a pies");
                   medida_pie = medida *3.28;
                   System.out.printf("El resultado de la conversion es %.3f\n", medida_pie);
                }
                case 2 ->{
                    System.out.println("Convirtiendo de kilogramos a libras");
                    kilo_a_libra= medida *2.20;
                    System.out.printf("El resultado de la conversion es %.2f\n",kilo_a_libra);
                }
                case 3 ->{
                    System.out.println("Convirtiendo de centimetros a pulgadas");
                    cm_pulgada =medida /2.54;
                    System.out.printf("el resultado de la conversion es %.2f\n",cm_pulgada);
                }
                case 4->
                    System.out.println("Saliendo del programa de conversion");
                 
                default ->
                    System.out.println("Opcion invalida");
                    
                    
            }

        }while(opcion!=4);
        teclado.close();
       
      
    }

}
