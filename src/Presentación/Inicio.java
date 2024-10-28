package Presentación;

import Entidades.Persona;
import Entidades.Producto;

public class Inicio {
    public static void main(String[] args) {

        Persona p1 = new Persona("30478512","Sandra",2500,false,true); //constructor por defecto o constructor sin  parámetros
        Persona p2;
        Persona p3 = new Persona("32548793","Pepito",1200500,true,true);

        Producto papasLays = new Producto("Papas Lays 125 grs","papas fritas 100% originales elaboradas en no se donde",50,10);
        Producto lataPepsi = new Producto("Pepsi Zero","Bebida fantasia 350 cc.",50,1);
        Producto otroProducto = new Producto();

        otroProducto.setStock(10);
        papasLays.setPrecio(100);
        p1.comprar(papasLays);

        System.out.println("Por favor ingrese el Nombre del Cliente");
        String nombreCliente = Leer.dato();

        System.out.println("Por favor ingrese el DNI del Cliente");
        String DNICliente = Leer.dato();

        System.out.println("Por favor ingrese Saldo en efectivo del Cliente");
        int saldoCliente = Leer.datoInt();

        System.out.println("¿Tiene hambre?");
        Boolean tieneHambre = Leer.datoBoolean();

        System.out.println("¿Tiene suenio?");
        Boolean tieneSuenio = Leer.datoBoolean();

        p2 = new Persona(DNICliente,nombreCliente,saldoCliente,tieneHambre,tieneSuenio);

        System.out.println("Se registra el cliente: "+p2.getNombre() +" satisfactoriamente");

    }
}
