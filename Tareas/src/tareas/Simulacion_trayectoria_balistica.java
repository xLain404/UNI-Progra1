package tareas;

import java.util.Scanner;

public class Simulacion_trayectoria_balistica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double velocidad;
        double grados;
        double radianes;
        double altura;
        double alturaMaxima = 0;
        int segundoMaximo = 0;

        do {
            System.out.println("Ingrese la velocidad inicial");
            velocidad = teclado.nextDouble();

            if (velocidad <= 0) {
                System.out.println("Ingrese una velocidad mayor a 0");
            }

            System.out.println("Ingrese el angulo");
            grados = teclado.nextDouble();

            if (grados <= 1 || grados >= 89) {
                System.out.println("Angulo incorrecto");
            }

        } while (velocidad <= 0 || grados <= 1 || grados >= 89);

        radianes = Math.toRadians(grados);

        for (int tiempo = 1; tiempo <= 10; tiempo++) {

            altura = (velocidad * Math.sin(radianes) * tiempo)
                    - (0.5 * 9.8 * tiempo * tiempo);

            System.out.printf("Segundo %d: %.2f metros%n", tiempo, altura);

            if (altura < 0) {
                System.out.println("El proyectil impacto el suelo");
                break;

            } else {

                if (altura > alturaMaxima) {
                    alturaMaxima = altura;
                    segundoMaximo = tiempo;
                }
            }
        }

        System.out.printf("Altura maxima: %.2f en el segundo %d%n",
                alturaMaxima, segundoMaximo);
        teclado.close();
    }
}