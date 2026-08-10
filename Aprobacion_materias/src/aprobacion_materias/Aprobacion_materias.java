/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aprobacion_materias;

import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Aprobacion_materias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre ;
        double examen1 ,examen2 ,promedio;
        System.out.println("Ingrese el nombre del estudiante:");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese la nota del primer examen:");
        examen1 = teclado.nextDouble();
        
        System.out.println("Ingrese la nota del segundo examen:");
        examen2 = teclado.nextDouble();
        
        promedio = (examen1 + examen2)/2;
        if (promedio >= 65){
            System.out.print("Aprobado\n");
            
        }else{
            System.out.print("Reprobado\n");
        }
    }
    
}
