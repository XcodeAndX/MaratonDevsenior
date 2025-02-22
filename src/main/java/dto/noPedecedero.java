package dto;

public class noPedecedero extends Producto  {

    private String marca;
    private String tipo;

    public noPedecedero(String marca, String tipo, int ID, String nombre, double precio, int stock) {
        super(ID, nombre, precio, stock);
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    


}
