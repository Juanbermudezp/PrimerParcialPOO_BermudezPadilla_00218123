package AparatoElectronico;

public class Telefono extends Aparato implements Articulo{

    public Telefono(String codigo, String modelo, double precio) {
        super(codigo,modelo,precio);
    }

    public Telefono() {

    }

    public double obtenerPrecio(double precio) {
        return precio;

    }

    public void descripcion() {
        super.getCodigo();
        super.getModelo();
    }
}
