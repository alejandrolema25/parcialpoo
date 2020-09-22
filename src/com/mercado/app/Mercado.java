package com.mercado.app;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Mercado {
    public static byte CAPACIDAD=29;
    private String SUPERMERCADO;
    private ArrayList<Producto> getlistaProductos(){
        return listaProductos;
    }
    private ArrayList<Producto> listaProductos;{
        this.listaProductos= new ArrayList<Producto>();
    }
    public boolean agregarProducto(Producto p, Object mercado) {
        boolean agrego = true;
        Mercado mercadobuscado= buscarPorCodigo(mercado.getCodigo());
        if (mercadobuscado==null&& this.mercado.size()<CAPACIDAD) {
            this.mercados.add(mercado);
            CAPACIDAD--;
        }else {
            agrego= false;
    }
        return agrego;
    }
    public boolean retirar (String nombre){
        return producto.removeif(p1->p1.getNombre().equals(nombre));

        return false;
    }
    public Producto buscarPorCodigo(int codigo){
        AtomicReference<Producto> tipocodigo=null;
        productos.forEach(buscador->{
            if (buscador.getCodigo()==codigo) {
                tipocodigo.set(buscador);
            }
        });
        return tipocodigo.get();
    }
    public Producto buscar(String nombre){
        AtomicReference<Producto>nombreBuscar=null;
        productos.forEach(buscador->{
            if (nombre.equalsIgnoreCase(buscador.getNombre())){
                nombreBuscar.set(buscador);
            }
        });
        return nombreBuscar.get();
    }
    public int calcularTotal()

    {
        int precioTotal = listaProductos.stream().mapToInt(intera -> intera.getPrecio() * intera.getCantidad()).sum();
        return precioTotal;
    }
}

