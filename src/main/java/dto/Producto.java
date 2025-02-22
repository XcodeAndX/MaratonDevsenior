package dto;

public abstract class Producto {

    private int ID;
    private int contID =1 ;
    private String nombre;
    private double precio;
    private int stock;
    private boolean  estado = true;

    public Producto(int ID, String nombre, double precio, int stock) {
        this.ID = contID++;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    



}
