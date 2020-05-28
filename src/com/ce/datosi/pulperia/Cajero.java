package com.ce.datosi.pulperia;

import com.ce.datosi.estructurasDatos.Lista;

import java.util.Scanner;

//clase Facade
public class Cajero {

    private int recibo;
    private Lista<String> carrito = new Lista<>();

    public void atenderCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido! En qué lo puedo ayudar?\n" +
                "Presione 1 para comprar papas\n" +
                "Presione 2 para comprar chicles\n" +
                "Presione 3 para comprar pan\n" +
                "Presione salir para salir\n");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1" -> {
                    Papas papas = getPapas();
                    recibo += papas.getPrecio();
                    carrito.add(papas.getProducto());
                }
                case "2" -> {
                    Chicles chicles = getChicles();
                    recibo += chicles.getPrecio();
                    carrito.add(chicles.getProducto());
                }
                case "3" -> {
                    Pan pan = getPan();
                    recibo += pan.getPrecio();
                    carrito.add(pan.getProducto());
                }
                case "salir" -> {
                    carrito.print();
                    System.out.println("El total sería " + recibo + " colones");
                    System.out.println("Gracias por venir!");
                    System.exit(1);
                }
                default -> System.out.println("Disculpe, solo ofrecemos papas, chicles y pan");
            }
        }
    }

    public Papas getPapas() {
        Papas papas = new Papas();
        System.out.println("Serían " + papas.getPrecio() + " colones");
        return papas;
    }

    public Chicles getChicles() {
        Chicles chicles = new Chicles();
        System.out.println("Serían " + chicles.getPrecio() + " colones");
        return chicles;
    }

    public Pan getPan() {
        Pan pan = new Pan();
        System.out.println("Serían " + pan.getPrecio() + " colones");
        return pan;
    }
}
