package Entidades;

public class Producto {
    //Atributos
    private String nombre;
    private String Descripción;
    private int Precio;
    private int Stock;

    //Constructor con parámetros
    public Producto(String nombre, String descripción, int precio, int stock){
        this.nombre = nombre;
        this.Descripción = descripción;
        this.Precio = precio;
        this.Stock = stock;
    }

    public Producto(){

    }

    public void disminuirStock(int cantidad){
        Stock = Stock - cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String descripción) {
        Descripción = descripción;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}
