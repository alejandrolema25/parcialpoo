package com.mercado.app;

public class Producto {
    private int codigo;
    private String nombre;
    private int cantidad;
    private int precio;
    private TipoProducto tipo;

    public Producto(int codigo,String nombre,int cantidad,int precio, TipoProducto tipo){
        this.codigo= codigo;
        this.nombre= nombre;
        this.cantidad= cantidad;
        this.precio= precio;
        this.tipo= tipo;
    }
    public TipoProducto getTipo(){
        return tipo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int getCodigo(){
        return codigo;
    }
    public int getPrecio(){
        return precio;
    }

}
