package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion) {
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 0: {
                while (!sc.hasNextInt()) {
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1: {
                while (!sc.hasNextDouble()) {
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return validado;
    }

    public static boolean validarNota(int nota) {
        boolean validado = true;
        if (nota > 10 || nota < 0) {
            validado = false;
        }
        return validado;
    }

    public static String daNota(int nota) {
        String notaString = "";
        switch (nota) {
            case 0:
                notaString = "CERO";
                break;
            case 1:
                notaString = "UNO";
                break;
            case 2:
                notaString = "DOS";
                break;
            case 3:
                notaString = "TRES";
                break;
            case 4:
                notaString = "CUATRO";
                break;
            case 5:
                notaString = "CINCO";
                break;
            case 6:
                notaString = "SEIS";
                break;
            case 7:
                notaString = "SIETE";
                break;
            case 8:
                notaString = "OCHO";
                break;
            case 9:
                notaString = "NUEVE";
                break;
            case 10:
                notaString = "DIEZ";
                break;
        }
        return notaString;
    }

    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Vamos a mostrar una nota numñerica en forma alfabética!");
        System.out.print("Introduce una nota: ");
        nota = (int) validador(0);
        while (!validarNota(nota)) {
            System.out.print("¡La nota debe ser entre 0 y 10! ");
            nota = (int) validador(0);
        }
        sc.close();
        System.out.printf("La nota %d se escribe: %s\n", nota, daNota(nota));
    }
}
