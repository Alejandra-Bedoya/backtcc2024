package org.example;

import org.example.modelos.Mercancia;
import org.example.modelos.Vehiculo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Vehiculo vehiculo = new Vehiculo();
        Mercancia mercancia = new Mercancia();

//        Scanner lea = new Scanner(System.in);
//        System.out.println("Digite el id del vehículo: ");
//        vehiculo.setId(lea.nextInt());
//        System.out.println(vehiculo.getId());
//
//
//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el modelo del vehículo: ");
//        vehiculo.setModelo(lea.next());
//        System.out.println(vehiculo.getModelo());

        Scanner lea = new Scanner(System.in);
        System.out.println("Digite la marca del vehículo:  ");
        vehiculo.setMarca(lea.nextLine());
        System.out.println(vehiculo.getMarca());


        Scanner lea = new Scanner(System.in);
        System.out.println("Digite la marca del vehículo:  ");
        vehiculo.setMarca(lea.nextLine());
        System.out.println(vehiculo.getMarca());

        kilometraje


        Scanner lea = new Scanner(System.in);
        System.out.println("Digite la autonomía:  ");
        vehiculo.setAutonomia(lea.nextInt());
        System.out.println(vehiculo.getAutonomia());


    }
}