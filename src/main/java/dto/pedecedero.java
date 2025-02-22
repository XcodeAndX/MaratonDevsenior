package dto;

public class pedecedero extends Producto {
    private String fechaCaducidad;

    public pedecedero(String fechaCaducidad, int ID, String nombre, double precio, int stock) {
        super(ID, nombre, precio, stock);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

}
