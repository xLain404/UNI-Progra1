/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estado_de_clase;

import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Estado_de_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int cantidad =0;
        char respuesta ='@';
        String respuestaA;
        System.out.println("el bote es de 500 ml");
        System.out.println("cuanto liquido dices que tiene? ");
        cantidad= teclado.nextInt();
        
        if (cantidad >= 250){
            System.out.println("Si tiene mas de la mitad");                 
            System.out.println("lo puedes beber ");
            System.out.println("no nos quedamos sin nada.. hay suficiente");
        }
        teclado.nextLine();
        System.out.println("El liquido que contiene es H2O? (a= si, b= no)");
        respuesta = teclado.nextLine().charAt(0);
        
        
        
        if (respuesta== 'a'){
            System.out.println("""
                               Si es agua lo que contiene
                               no es otra cosa..... nada embriagante""");
        }else {
            System.out.println("""
                               Disfruta que 
                               es cerveza""");
        }
        System.out.printf("\nEse bote que contiene %d mL",cantidad);
        System.out.println("ES amigable al medio ambiente");
        respuestaA = teclado.nextLine();
       /* System.out.printf("\nEse bote que contiene %s mL",respuestaA);
        
        System.out.println("Seguro");
        respuestaA= teclado.nextLine().toUpperCase();
        System.out.printf("\ndato de variable %s",respuestaA);
        
        System.out.println("SEGURO");
        respuestaA= teclado.next().toLowerCase();
        System.out.printf("dato de variable: %s",respuestaA);
        */
        if (respuestaA.equalsIgnoreCase("si")){
            System.out.println("ES amigable");
        }else {
            System.out.println("No es amigable");
        }
        
    }// fin main
    
}//fin class
