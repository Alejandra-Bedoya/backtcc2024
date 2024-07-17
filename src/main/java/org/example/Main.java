package org.example;

import org.example.modelos.Mercancia;
import org.example.modelos.Vehiculo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo();
        Mercancia mercancia = new Mercancia();

        System.out.print("Digite el Id del vehículo: ");
        vehiculo.setId(lea.nextInt());
        lea.nextLine();
        System.out.println("El id del vehículo es: " + vehiculo.getId());

        System.out.print("Digite la marca del vehículo: ");
        vehiculo.setMarca(lea.nextLine());
        System.out.println("La marca del vehículo es: " + vehiculo.getMarca());

        System.out.print("Digite el modelo del vehículo: ");
        vehiculo.setModelo(lea.next());
        System.out.println("El modelo del vehículo es: " + vehiculo.getModelo());

        System.out.print("Digite el kilometraje: ");
        vehiculo.setKilometraje(lea.nextDouble());
        System.out.println("El kilometraje del vehículo es: " + vehiculo.getKilometraje());

        lea.nextLine();

        System.out.print("Digite el Color del vehículo: ");
        vehiculo.setColor(lea.nextLine());
        System.out.println("El color del vehículo es: " + vehiculo.getColor());

        System.out.print("Digite la descripción del vehículo: ");
        vehiculo.setDescripcion(lea.nextLine());
        System.out.println("La descripción del vehículo es: " + vehiculo.getDescripcion());


        System.out.print("Digite el tipo de vehículo: ");
        vehiculo.setTipo(lea.nextLine());
        System.out.println("El tipo de vehículo es: " + vehiculo.getTipo());


        System.out.print("Digite la autonomía del vehículo: ");
        vehiculo.setAutonomia(lea.nextInt());
        System.out.println("La autonomía del vehículo es: " + vehiculo.getAutonomia());

        System.out.print("Digite la capacidad de carga del vehículo: ");
        vehiculo.setCapacidadCarga(lea.nextDouble());
        System.out.println("La capacidad de carga del vehículo es: " + vehiculo.getCapacidadCarga());

        System.out.print("Digite el avalúo del vehículo: $ ");
        vehiculo.setAvaluo(lea.nextInt());
        System.out.println("El avalúo del vehículo es: " + vehiculo.getAvaluo());
//

        //Mercancía


//
//        System.out.print("Digite el id de la mercancía: ");
//        mercancia.setId(lea.nextInt());
//        System.out.println("El id de la mercancía es: " + mercancia.getId());
//
//
//        System.out.print("Digite el volumen ocupado: ");
//        mercancia.setVolumenOcupado(lea.nextDouble());
//        System.out.println("El volumen ocupado es: " + mercancia.getVolumenOcupado());
//
//
//        System.out.print("Digite el tipo de mercancía: ");
//        lea.nextLine(); // Limpiar el buffer después de nextDouble
//        mercancia.setTipo(lea.nextLine());
//        System.out.println("El tipo de mercancía es: " + mercancia.getTipo());
//
//
//        System.out.print("Digite el peso de la mercancía: ");
//        mercancia.setPeso(lea.nextDouble());
//        System.out.println("El peso de la mercancía es: " + mercancia.getPeso());
//
//
//        System.out.print("Digite la descripción de la mercancía: ");
//        lea.nextLine(); // Limpiar el buffer después de nextDouble
//        mercancia.setDescripcion(lea.nextLine());
//        System.out.println("La descripción de la mercancía es: " + mercancia.getDescripcion());
//
//
//        System.out.print("Digite el avalúo de la mercancía: $");
//        mercancia.setAvaluo(lea.nextInt());
//        System.out.println("El avalúo de la mercancía es: $" + mercancia.getAvaluo());
//
//
//        System.out.print("Digite la dirección del remitente: ");
//        lea.nextLine(); // Limpiar el buffer después de nextInt
//        mercancia.setDireccionRemitente(lea.nextLine());
//        System.out.println("La dirección del remitente es: " + mercancia.getDireccionRemitente());
//
//
//        System.out.print("Digite la dirección del destinatario: ");
//        mercancia.setDireccionDestinatario(lea.nextLine());
//        System.out.println("La dirección del destinatario es: " + mercancia.getDireccionDestinatario());
//
//
        lea.close();
    }
}