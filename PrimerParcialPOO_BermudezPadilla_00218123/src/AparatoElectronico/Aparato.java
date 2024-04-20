package AparatoElectronico;

public abstract class Aparato {

    private String codigo;
    private String modelo;
    private double precio;

    public Aparato(String codigo, String modelo, double precio){
        this.codigo = codigo;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Aparato(){
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
