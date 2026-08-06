/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo_con_dos_variables;

import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Calculo_con_dos_Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double base =0;
        double altura= 0;
        double area = 0;
        double perimetro = 0;
        System.out.print("ingrese la altura :\n");
        altura = teclado.nextDouble();
        
        System.out.print("Ingrese la base :\n");
        base = teclado.nextDouble();
        
        area = base * altura;
        
        perimetro = (base*2)+(altura*2);
        
       System.out.printf("El area del rectangulo es %.2f:\n",area);
       
       System.out.printf("el perimetro del rectangulo es %.2f\n", perimetro);
               
        
        
    }
    
}
