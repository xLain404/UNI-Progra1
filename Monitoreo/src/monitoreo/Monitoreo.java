/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monitoreo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lain
 */
public class Monitoreo {

    /**
     * Desarrolla un programa en Java que simule la lectura de sensores de
     * temperatura en un cuarto de servidores El programa debe solicitar el
     * nombre del operador encargado y cuántas lecturas de sensores se van a
     * simular Debe validar que la cantidad de lecturas sea mayor a 0 y menor o
     * igual a 50 Por cada lectura, el sistema generará una temperatura
     * aleatoria en grados Celsius El programa debe convertir cada lectura a
     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al
     * final, mostrar un resumen estadístico.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        String operador;
        int cantidad;
        int temperaturaC;
        double temperaturaF;

        int alertas = 0;
        int sumaTemperaturas = 0;
        int temperaturaMayor = 0;
        int temperaturaMenor = 0;
        double promedio;

        System.out.println("Ingrese el nombre del operador:");
        operador = teclado.nextLine();

        do {
            System.out.println("Ingrese la cantidad de lecturas: ");
            cantidad = teclado.nextInt();

            if (cantidad <= 0 || cantidad > 50) {
                System.out.println("Cantidad incorrecta. Debe ser entre 1 y 50.");
            }

        } while (cantidad <= 0 || cantidad > 50);

        for (int i = 1; i <= cantidad; i++) {
            temperaturaC = aleatorio.nextInt(15, 51);
            temperaturaF = (temperaturaC * 9.0 / 5.0) + 32;
            System.out.println("\nLectura#" + i);
            System.out.printf("Temperatura en celcius %d\n", temperaturaC);
            System.out.printf("Temperatura en Fahrenheit %.2f\n", temperaturaF);

            if (temperaturaC >= 35) {
                System.out.println("Alerta de sobrecalentamiento");
                alertas++;
            } else {
                System.out.println("Temperatura normal");
            }
            sumaTemperaturas += temperaturaC;
            if (i == 1) {
                temperaturaMayor = temperaturaC;
                temperaturaMenor = temperaturaC;
            } else if (temperaturaC > temperaturaMayor) {
                temperaturaMayor = temperaturaC;
            } else if (temperaturaC < temperaturaMenor) {
                temperaturaMenor = temperaturaC;
            }
        }
        promedio = (double) sumaTemperaturas / cantidad;
        System.out.println("");

        System.out.println("Resumen de la simulacion");
        System.out.printf("El nombre de quien realiza la simulacion es %s\n", operador);
        System.out.printf("Cantidad de %d alertas\n", alertas);
        System.out.printf("Suma de temperaturas %d\n", sumaTemperaturas);
        System.out.printf("La temperatura Mayor es %d\n", temperaturaMayor);
        System.out.printf("La temperatura Menor es %d\n", temperaturaMenor);
        System.out.printf("el promedio de las temperaturas es %.2f\n", promedio);
    }
}
