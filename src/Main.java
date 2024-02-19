import models.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner key = new Scanner(System.in);
    private static  ListaChoferes choferes = new ListaChoferes();
    private static  Unidades taxis = new Unidades();
    private static ChoferAsignado asignado = new ChoferAsignado();
    private static  Servicios servicios = new Servicios();

    public static void main(String[] args) {
        short eleccion;
        do {
            System.out.println("---- Panel de opciones ----");
            System.out.println("1 Administrador");
            System.out.println("2 Empleado");
            System.out.println("3 Salir");
            eleccion = key.nextShort();

            switch (eleccion) {
                case 1:
                    adminOptions();
                    break;
                case 2:
                    employeeOptions();
                    break;
            }

        } while (eleccion != 3);
    }

    public static void adminOptions() {
        short opcion;
        do {
            System.out.println("---- Panel de Administrador ----");
            System.out.println("1 Agregar unidad");
            System.out.println("2 Ver unidades");
            System.out.println("3 Agregar chofer");
            System.out.println("4 Ver choferes");
            System.out.println("5 Asignar Unidad a Chofer");
            System.out.println("6 Salir");
            opcion = key.nextShort();
            switch (opcion) {
                case 1:
                    addUnidades();
                    break;
                case 2:
                    verUnidades();
                    break;
                case 3:
                    addChofer();
                    break;
                case 4:
                    verChoferes();
                    break;
                case 5:
                    asignarUnidad();
                    break;
            }
        } while (opcion != 6);
    }

    public static void employeeOptions() {
        short opcion;
        do {
            System.out.println("---- Panel de Empleado ----");
            System.out.println("1 Registrar Servicio");
            System.out.println("2 Ver Servicios del Día");
            System.out.println("3 Ver Ingresos del Día");
            System.out.println("4 Salir");
            opcion = key.nextShort();
            switch (opcion) {
                case 1:
                    registrarServicio();
                    break;
                case 2:
                    verServiciosDelDia();
                    break;
                case 3:
                    verIngresosDelDia();
                    break;
            }
        } while (opcion != 4);
    }

    public static void addUnidades() {
        System.out.println("Ingrese la marca");
        String marca = key.next();
        System.out.println("Ingrese el modelo");
        String modelo = key.next();
        System.out.println("Ingrese el color");
        String color = key.next();
        System.out.println("Ingrese el ID numérico del carro");
        int id = key.nextInt();


        ArrayList<Unidades> unidadesList = taxis.getUnidades();
        for (Unidades u : unidadesList) {
            if (u.getId() == id) {
                System.out.println("Ya existe una unidad con ese ID. No se puede agregar.");
                return;
            }
        }

        System.out.println("Ingrese el año de la unidad");
        int año = key.nextInt();
        Unidades unit = new Unidades(marca, modelo, color, año, id);
        taxis.addUnidades(unit);
        System.out.println("Unidad registrada con éxito.");
    }

    public static void verUnidades() {
        ArrayList<Unidades> unidadesList = taxis.getUnidades();
        for (Unidades u : unidadesList) {
            System.out.println(u);
        }
    }

    public static void addChofer() {
        System.out.println("Ingrese el nombre del chofer:");
        String nombre = key.next();
        System.out.println("Ingrese el apellido del chofer:");
        String apellido = key.next();
        System.out.println("Ingrese el ID del chofer:");
        int id = key.nextInt();


        for (Chofer c : choferes.getChoferes()) {
            if (c.getId() == id) {
                System.out.println("Ya existe un chofer con ese ID. No se puede agregar.");
                return;
            }
        }


        Chofer chofer = new Chofer(nombre, apellido, id);
        choferes.addChoferes(chofer);
        System.out.println("Chofer registrado con éxito.");
    }


    public static void verChoferes() {
        ArrayList<Chofer> choferesList = choferes.getChoferes();
        for (Chofer c : choferesList) {
            System.out.println(c.getNombre());
        }
    }

    public static void asignarUnidad() {
        System.out.println("Ingrese el ID del chofer:");
        int idChofer = key.nextInt();
        System.out.println("Ingrese el ID de la unidad:");
        int idUnidad = key.nextInt();


        Chofer chofer = choferes.getChoferPorId(idChofer);
        Unidades unidades = taxis.getUnidadPorId(idUnidad);


        if (chofer == null) {
            System.out.println("No se encontró ningún chofer con el ID proporcionado.");
            return;
        }
        if (unidades == null) {
            System.out.println("No se encontró ninguna unidad con el ID proporcionado.");
            return;
        }

        // Asignar la unidad al chofer
        chofer.setUnidadAsignada(unidades);
        System.out.println("Unidad asignada con éxito al chofer.");
    }


    public static void registrarServicio() {
        System.out.println("Ingrese el lugar del servicio:");
        String lugar = key.next();
        System.out.println("Ingrese la hora del servicio (HH:MM):");
        String horaStr = key.next();
        LocalTime hora = LocalTime.parse(horaStr);
        System.out.println("Ingrese el monto del servicio:");
        double monto = key.nextDouble();
        Servicio servicio = new Servicio(lugar, hora, monto, LocalDate.now());
        servicios.addServicio(servicio);
        System.out.println("Servicio registrado con éxito.");
    }

    public static void verServiciosDelDia() {
        LocalDate today = LocalDate.now();
        ArrayList<Servicio> serviciosDelDia = (ArrayList<Servicio>) servicios.getServicios(today);
        for (Servicio s : serviciosDelDia) {
            System.out.println(s);
        }
    }

    public static void verIngresosDelDia() {
        LocalDate today = LocalDate.now();
        ArrayList<Servicio> serviciosDelDia = (ArrayList<Servicio>) servicios.getServicios(today);
        double totalIngresos = 0;
        for (Servicio s : serviciosDelDia) {
            totalIngresos += s.getMonto();
        }
        System.out.println("Ingresos del día:");
        System.out.println("Total ingresos: " + totalIngresos);
    }

}
