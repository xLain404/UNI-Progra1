/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meteoriologia;

import java.util.Scanner;

/**
 *objetivos:
 * 1Conoces las estructuras de repeticion q hay
 * 2. estructura general de todo ciclo de repeticion
 * mostrar el pago general y un mensaje de caliente o frio para cada jornada 
 * @author Lain
 */
public class Meteoriologia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =new Scanner(System.in);
        int temperatura=0;
        int dia=1;
        double promedio=0;
        double suma=0;
        while(dia <=7){
            System.out.printf("Dia %d la Temperatura es:",dia);
            temperatura= teclado.nextInt();
            dia++;
            suma+=temperatura;
        }
        dia--;
        System.out.printf("el dia %d ", dia);
        promedio = suma /dia;
        System.out.printf("la temperatura total es: %.2f\n", suma);
        System.out.printf("El promedio es: %.2f\n", promedio);
        
    }//fin de main
    
}
