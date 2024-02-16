
import models.Chofer;
import models.ListaArqueo;
import models.ListaChoferes;
import models.Unidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner key = new Scanner(System.in);
    private static ListaChoferes choferes = new ListaChoferes();

    public static void main(String[] args) {
        short elecion;
        do{
            System.out.println("1 Administrador");
            System.out.println("2 Empleado");
            System.out.println("3 Salir");
            elecion = key.nextShort();

            switch (elecion){
                case 1:
                    short opcion;
                    do{
                        System.out.println("Ingrese una opción: ");
                        System.out.println("1 Agregar unidad: ");
                        System.out.println("2 Agregar chofer");
                        System.out.println("3 Asignar Unidad");
                        System.out.println("3 modelo de auto: ");
                        System.out.println("4 año del auto: ");
                        System.out.println("5 Salir");
                        opcion = key.nextShort();
                        switch (opcion){
                            case 1:
                                addUnidades();
                                break;
                            case 2:
                                addChofer();
                                break;
                            case 3: asignarUnidad();
                            break;
                        }
                    } while (opcion != 5);

            }

        } while (elecion != 3);
    }
    public static void addUnidades(){
       String marca = "";
        String modelo = "";
        String color = "";
        int id = 0;
        int año = 0;
        System.out.println("Ingrese la marca");
        marca = key.next();
        System.out.println("Ingrese el modelo");
        modelo = key.next();
        System.out.println("Ingrese el color");
        color = key.next();
        System.out.println("Ingrese el ID númerico del carro");
        id = key.nextInt();
        System.out.println("Ingrese el año de la unidad");
        año = key.nextInt();
        Unidades unit = new Unidades(marca,  modelo,  color,  id,  año);
        unit.addUnidades(unit);
    }
    public static void addChofer(){
        System.out.println("Ingrese el nombre del chofer");
        String nombre = key.next();
        System.out.println("Ingrese el ID del auto asignado");
        int idcarro = key.nextInt();
        System.out.println("Ingrese el ID del chofer");
        int id = key.nextInt();
        Chofer chofer = new Chofer(nombre, idcarro, id);
        choferes.addChoferes(chofer);
    }
    public static void asignarUnidad(){
        LocalDate dia = LocalDate.now();
        System.out.println(dia);

    }

}