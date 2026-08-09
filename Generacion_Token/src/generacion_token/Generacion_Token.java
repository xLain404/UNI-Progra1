/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generacion_token;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Generacion_Token {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        String nombreDispositivo;
        String token = "";

        boolean longitudCorrecto;
        boolean prefijoCorrecto;
        boolean isValido;

        int tipoCaracter;
        int numeroToken;
        char letraToken;
         // Parte 1: Registro del nombre del dispositivo
        do {

            System.out.print("Ingrese el nombre del dispositivo: ");
            nombreDispositivo = teclado.nextLine();

            longitudCorrecto = nombreDispositivo.length() == 8;

            prefijoCorrecto = nombreDispositivo.startsWith("RT")
                    || nombreDispositivo.startsWith("SW");

            isValido = longitudCorrecto && prefijoCorrecto;

        } while (!isValido);

        System.out.println("Registro Correcto");
        // Parte 2: Generación del Token
        while (token.length() < 12) {

            tipoCaracter = random.nextInt(2);

            if (tipoCaracter == 0) {

                numeroToken = random.nextInt(10);
                token = token + numeroToken;

            } else {

                letraToken = (char) (random.nextInt(26) + 65);
                token = token + letraToken;

            }

        } // Fin de while Generando Token
        System.out.println("Token generado: " + token);
    }// FIN DE MAIN
    
}
