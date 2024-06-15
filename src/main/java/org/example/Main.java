package org.example;

import org.example.modelos.Vehiculo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();

        Scanner les = new Scanner(System.in);
        System.out.print("Digite la autonomía: ");
        vehiculo.setAutonomia(les.nextInt());

    }

}