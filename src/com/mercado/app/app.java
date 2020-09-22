package com.mercado.app;
public class app {
    private static final Object CAPACIDAD_MAXIMO = 29;

    public static void main (String[]args){
        TipoProducto tipo= new TipoProducto();
        Producto pera=new Producto(1,"pera",7,750,false, TipoProducto.FRUTA);
        Producto curuba=new Producto(2,"curuba",3,300,false,TipoProducto.FRUTA);
        Producto durazno=new Producto(3,"durazno",12,400,false,TipoProducto.FRUTA);
        Producto bagre=new Producto(4,"bagre",5,5000,false,TipoProducto.CARNE);
        Producto pollo=new Producto(5,"pollo",17,3500,false,TipoProducto.CARNE);
        Producto jabali=new Producto(6,"janali",10,6500,false,TipoProducto.CARNE);
        Producto zanahoria=new Producto(7,"zanahoria",25,500,false,TipoProducto.VERDURA);
        Producto berengena=new Producto(8,"berengena",7,450,false,TipoProducto.VERDURA);
        Producto cebolla=new Producto(9,"cebolla",19,250,false,TipoProducto.VERDURA);
        Producto yogurt=new Producto(10,"yogurt",12,2500,false,TipoProducto.LACTERO);
        Producto cremadeleche=new Producto(11,"cremadelecha",14,1500,false,TipoProducto.LACTERO);
        Producto lecheenpolvo=new Producto(12,"lecheenpolvo",23,900,false,TipoProducto.LACTERO);
        Producto panintegral=new Producto(13,"panintegral",12,1000,false,TipoProducto.LACTERO);
        Producto papelhigenico=new Producto(14,"papelhigenico",3,3000,false,TipoProducto.IMPLEMENTOS_ASEO);
        Producto jabon=new Producto(15,"jabon",15,2700,false,TipoProducto.IMPLEMENTOS_ASEO);
        Producto pastadental=new Producto(16,"pastadenta",12,2300,false,TipoProducto.IMPLEMENTOS_ASEO);
        Producto chocolatina=new Producto(17,"chocolatina",24,2000,false,TipoProducto.DULCERIA);
        Producto chocoramo=new Producto(18,"chocoramo",23,1600,false,TipoProducto.DULCERIA);
        Producto gomita=new Producto(19,"gomita",12,1200,false,TipoProducto.DULCERIA);
        Producto barriletes=new Producto(20,"barriletes",13,800,false,TipoProducto.DULCERIA);
        Producto purina=new Producto(21,"purina",11,3400,false,TipoProducto.PRODUCTOS_MASCOTAS);
        Producto juguete=new Producto(22,"juguetes",21,2400,false,TipoProducto.PRODUCTOS_MASCOTAS);
        Producto premios=new Producto(23,"premios",10,1200,false,TipoProducto.PRODUCTOS_MASCOTAS);
        Producto res =new Producto(24,"res",12,4500,false,TipoProducto.CARNE);
        Producto mango=new Producto(25,"mango",19,1000,false,TipoProducto.FRUTA);
        Producto arequipe=new Producto(26,"arequipe",20,2600,false,TipoProducto.DULCERIA);
        Producto yuca=new Producto(27,"yuca",7,700,false,TipoProducto.VERDURA);
        Producto tostadas=new Producto(28,"tostadas",25,3800,false,TipoProducto.PAN);
        Producto cepillodediente=new Producto(29,"cepillodedientes",6,800,false,TipoProducto.IMPLEMENTOS_ASEO);
        Mercado mercado= new Mercado();
        Mercado.agregarProducto(pera);
        Mercado.agregarProducto(curuba);
        Mercado.agregarProducto(durazno);
        Mercado.agregarProducto(bagre);
        Mercado.agregarProducto(pollo);
        Mercado.agregarProducto(jabali);
        Mercado.agregarProducto(zanahoria);
        Mercado.agregarProducto(berengena);
        Mercado.agregarProducto(cebolla);
        Mercado.agregarProducto(yogurt);
        Mercado.agregarProducto(cremadeleche);
        Mercado.agregarProducto(lecheenpolvo);
        Mercado.agregarProducto(panintegral);
        Mercado.agregarProducto(papelhigenico);
        Mercado.agregarProducto(jabon);
        Mercado.agregarProducto(pastadental);
        Mercado.agregarProducto(chocolatina);
        Mercado.agregarProducto(chocoramo);
        Mercado.agregarProducto(gomita);
        Mercado.agregarProducto(barriletes);
        Mercado.agregarProducto(purina);
        Mercado.agregarProducto(juguete);
        Mercado.agregarProducto(premios);
        Mercado.agregarProducto(res);
        Mercado.agregarProducto(mango);
        Mercado.agregarProducto(arequipe);
        Mercado.agregarProducto(yuca);
        Mercado.agregarProducto(tostadas);
        Mercado.agregarProducto(cepillodediente);



    }



}
