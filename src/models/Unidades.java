package models;

import java.util.ArrayList;

public class Unidades {
    private String marca ;
    private String color;
    private String modelo;
    private int año;
    private int id;
    private ArrayList<Unidades> unidades = new  ArrayList<>();


    public Unidades(String marca, String color, String modelo, int año, int id) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.año = año;
        this.id = id;
    }
    public void addUnidades(Unidades unit){
        unidades.add(unit);
    }

    public ArrayList<Unidades> getUnidades() {
        return unidades;
    }

    @Override
    public String toString() {
        return "Unidades{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", id=" + id +
                ", unidades=" + unidades +
                '}';
    }
}
