package com.ce.datosi.pulperia;

public class Papas extends Producto{

    private final int precio = 500;

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String getProducto() {
        return "papas";
    }

}
