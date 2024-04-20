import AparatoElectronico.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Aparato> ap = new ArrayList<>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        int opcion;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Agregar aparato electronico");
            System.out.println("2. Modificar Precio");
            System.out.println("3. Mostrar Lista");
            System.out.println("4. Salir del sistema");
            System.out.print("Ingrese su opcion > ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    agregar();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    mostrarLista();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (opcion != 4);
    }

    private static void agregar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Telefono");
        System.out.println("2. Computadora");
        System.out.print("Elija su opcion > ");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                Telefono telefono = new Telefono();
                System.out.println("Ingrese el codigo del telefono: ");
                telefono.setCodigo(sc.nextLine());
                sc.nextLine();
                System.out.println("Ingrese el modelo del telefono: ");
                telefono.setModelo(sc.nextLine());
                System.out.println("Ingrese el precio del telefono: $");
                telefono.setPrecio(sc.nextDouble());
                ap.add(telefono);
                break;
            case 2:
                Computadora computadora = new Computadora();
                System.out.println("Ingrese el codigo de la Computadora: ");
                computadora.setCodigo(sc.nextLine());
                sc.nextLine();
                System.out.println("Ingrese el modelo de la Computadora: ");
                computadora.setModelo(sc.nextLine());
                System.out.println("Ingrese el precio de la Computadora: $");
                computadora.setPrecio(sc.nextDouble());
                ap.add(computadora);
                break;
        }
    }

    private static void modificarPrecio(){
        Scanner sc = new Scanner(System.in);


        System.out.println("Elija su opcion");
        System.out.println("1. Telefono");
        System.out.println("2. Computadora");
        System.out.print("Su opcion > ");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                Telefono telefono = new Telefono();
                System.out.println("Ingrese el codigo del telefono:");
                String codigo = sc.nextLine();
                if (telefono.getCodigo() == codigo){
                    System.out.println("Ingrese el nuevo precio del telefono");
                    telefono.setPrecio(sc.nextDouble());
                    System.out.println("Se ha modificado el precio con extito");
                }

                break;
            case 2:
                Computadora computadora = new Computadora();
                System.out.println("Ingrese el codigo de la computadora:");
                codigo = sc.nextLine();
                if (computadora.getCodigo() == codigo){
                    System.out.println("Ingrese el nuevo precio del computadora");
                    computadora.setPrecio(sc.nextDouble());
                    System.out.println("Se ha modificado el precio con extito");
                }
                break;

        }
    }

    private static void mostrarLista(){
        for (int i = 0; i < ap.size(); i++) {
            System.out.println("Modelo del aparato: " + ap.get(i).getModelo());
            System.out.println("Precio del aparato: " + ap.get(i).getPrecio());
            System.out.println("\n");
        }
    }

}