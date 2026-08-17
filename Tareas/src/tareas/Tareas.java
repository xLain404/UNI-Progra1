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
public class Tareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tempe;
         double suma = 0;
        double mayor = 0;
        double menor = 0;
        double promedio;
        double diferencia;
        
        int contador =0;
        
        System.out.println("Ingrese la temperatura");
        tempe =teclado.nextDouble();
        
        while (tempe !=-999){
            System.out.println("Ingrese otra temperatura");
            tempe = teclado.nextDouble();
            if(tempe <-273.15){
                System.out.println("La temperatura no puede ser menos al cero absoluto");
            }else{
                suma+= tempe;
                contador++;
            }
            if (tempe==1){
                mayor= tempe;
                menor=tempe;
            }else{
                if(tempe>mayor){
                    mayor= tempe;
                }if(tempe<menor){
                    menor= tempe;
                }
            }
        }
       promedio = suma/contador;
       diferencia = mayor-menor;
       System.out.printf("resultados");
       System.out.printf("EL promedio de temperatura es %.2f C\n",promedio);
       System.out.printf("Temperatura mas alta es %.2f C\n", mayor);
       System.out.printf("La temperatura mas baja es  %.2f C\n", menor);
       System.out.printf("La diferencia es %.2f C\n", diferencia);
       teclado.close();
       
        
    }
    
}
