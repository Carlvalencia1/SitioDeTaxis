package models;

import java.util.ArrayList;

public class Unidades {
    private String marca;
    private String color;
    private String modelo;
    private int año;
    private int id;
    private ArrayList<Unidades> unidades = new ArrayList<>();

    public Unidades(String marca, String modelo, String color, int año, int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.id = id;
    }

    public Unidades() {

    }

    public void addUnidades(Unidades unit) {
        unidades.add(unit);
    }

    public ArrayList<Unidades> getUnidades() {
        return unidades;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Unidades{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", año=" + año +
                ", id=" + id +
                ", unidades=" + unidades +
                '}';
    }

    public Unidades getUnidadPorId(int idUnidad) {
        return null;
    }
}
