/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uso_de_la_libreriamath;

import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Uso_de_la_libreriaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =new Scanner(System.in);
        double radio = 0;
        double area= 0;
        double circunferencia= 0;
        
        System.out.println("Ingrese el radio del circulo: ");
        radio = teclado.nextDouble();
         
        area= Math.PI * Math.pow(radio ,2);
        circunferencia = 2* Math.PI * radio;
        
        System.out.printf("El area es %.2f\n", area);
        System.out.printf("La circunferencia es %.2f\n", circunferencia);
    }
    
}
