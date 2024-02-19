package models;

import java.util.ArrayList;

public class ChoferAsignado {
    private String nombre;
    private int id;
    private int idcarro;
    private ArrayList<ChoferAsignado> asignaciones = new ArrayList<>();

    public ChoferAsignado(String nombre, int id, int idcarro) {
        this.nombre = nombre;
        this.id = id;
        this.idcarro = idcarro;
    }

    public ChoferAsignado() {
    }

    public void addAsignacion(ChoferAsignado asignado) {
        asignaciones.add(asignado);
    }

    public ArrayList<ChoferAsignado> getAsignaciones() {
        return asignaciones;
    }

    public int getIdcarro() {
        return idcarro;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ChoferAsignado{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", idcarro=" + idcarro +
                '}';
    }
}
