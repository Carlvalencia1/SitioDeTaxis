package models;
import models.Unidades;

public class Chofer {
    private String nombre;
    private String apellido;
    private int id;
    private Unidades unidadAsignada;

    public Chofer(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Unidades getUnidadAsignada() {
        return unidadAsignada;
    }

    public void setUnidadAsignada(Unidades unidadAsignada) {
        this.unidadAsignada = unidadAsignada;
    }

    @Override
    public String toString() {
        return "Chofer{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                '}';
    }
}
