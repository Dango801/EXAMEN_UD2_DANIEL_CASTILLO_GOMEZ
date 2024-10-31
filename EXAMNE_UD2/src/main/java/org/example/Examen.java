package org.example;

import java.util.Scanner;
import java.util.Random;
import java.util.Calendar;

import static java.lang.Math.random;


public class Examen {

    public static void ejercicio1(){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ronda 1 ");
        System.out.print("Elige tu jugada: (a = Papel  t = Tijera  p = Piedra)");
        int jugadahumano = scanner.nextInt();
        int a = 1;
        int t = 2;
        int p = 3;

        if (jugadahumano == a) System.out.print("Has selecionado Papel");
        if (jugadahumano == t) System.out.print("Has selecionado Tijera");
        if (jugadahumano == p) System.out.print("Has selecionado Piedra");

        int jugadamaquina = random.nextInt(3) + 1;

        if (jugadamaquina == 1) System.out.print("La maquina ha sacado Papel");
        if (jugadamaquina == 2) System.out.print("La maquina ha sacado Tijeras");
        if (jugadamaquina == 3) System.out.print("La maquina ha sacado Piedra");

        //sin acabar, soy un poco tonto.
    }


    public static void ejercicio2() {
        Scanner scanner = new Scanner(System.in);

        int aactual = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Dame tu año de nacimiento: ");
        int anacimiento = scanner.nextInt();

        if (anacimiento < 1900 || anacimiento > aactual) {
            System.out.println("El año de nacimiento debe ser entre 1900 y el año actual.");
        }
        else {
            for (int año = anacimiento; año <= aactual; año++) {
                int edad = año - anacimiento;
                System.out.println(año + " – edad: " + edad);
            }
        }

        scanner.close();
    }



}
