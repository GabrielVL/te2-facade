package com.ce.datosi.pulperia;

public class Chicles extends Producto {

    private final int precio = 100;

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String getProducto() {
        return "chicles";
    }

}
