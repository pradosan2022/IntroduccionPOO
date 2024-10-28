package Entidades;

public class Persona {

    //Atributos

    private String DNI;              //30840597
    private String nombre;           //Sandra Prado
    private int efectivo;            //1000
    private boolean tieneSuenio;     //false
    private boolean tieneHambre;     //true

    public Persona(String DNI, String nombre, int efectivo, boolean tieneSuenio, boolean tieneHambre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.efectivo = efectivo;
        this.tieneSuenio = tieneSuenio;
        this.tieneHambre = tieneHambre;
    }

    public Persona() {
    }

    //Métodos

    public void comprar(Producto producto){
        if(producto.getStock() ==0){
            System.out.println("Producto sin Stock");
        }else{
            if(producto.getPrecio() <= efectivo){
                System.out.println("Voy a comprar 1: "+producto.getNombre());
                efectivo = efectivo - producto.getPrecio();
                producto.disminuirStock(1);
                System.out.println("Ahora me queda de saldo: $"+efectivo);
            }
        }

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public boolean isTieneSuenio() {
        return tieneSuenio;
    }

    public void setTieneSuenio(boolean tieneSuenio) {
        this.tieneSuenio = tieneSuenio;
    }

    public boolean isTieneHambre() {
        return tieneHambre;
    }

    public void setTieneHambre(boolean tieneHambre) {
        this.tieneHambre = tieneHambre;
    }
}
