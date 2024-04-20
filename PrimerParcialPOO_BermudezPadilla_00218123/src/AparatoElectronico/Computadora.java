package AparatoElectronico;

public class Computadora extends Aparato implements Articulo{
    public Computadora(String codigo, String modelo, double precio) {
        super(codigo,modelo,precio);
    }

    public Computadora() {

    }

    public double obtenerPrecio(double precio) {
        return precio;

    }

    public void descripcion() {
        super.getCodigo();
        super.getModelo();
    }
}
