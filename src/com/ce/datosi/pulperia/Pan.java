package com.ce.datosi.pulperia;

public class Pan extends Producto{

    private final int precio = 800;

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String getProducto() {
        return "pan";
    }

}
