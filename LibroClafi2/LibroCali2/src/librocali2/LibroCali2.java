/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librocali2;

import java.util.Scanner;

/**
 *
 * @author xaxbe
 */


public class LibroCali2 {
    private double promedio;
    private int contadorCalif;

    public void determinarPromedioClase() {
        Scanner scanner = new Scanner(System.in);
        int totalCalif = 0;

        System.out.print("Ingrese la calificación de un alumno ");
        int calificacion = scanner.nextInt();

        while (calificacion != -1) {
            if (calificacion >= 0 && calificacion <= 100) {
                totalCalif += calificacion;
                contadorCalif++;
            } else {
                System.out.println("La calificación debe estar entre 0 y 100.");
            }

            System.out.print("Ingrese la calificación de los demas ");
            calificacion = scanner.nextInt();
        }

        if (contadorCalif != 0) {
            promedio = (double) totalCalif / contadorCalif;
            System.out.println("El promedio de la clase es: " + promedio);
        } else {
            System.out.println("No se introdujeron calificaciones.");
        }
    }

    public static void main(String[] args) {
        LibroCali2 libro = new LibroCali2();
        libro.determinarPromedioClase();
    }
}
