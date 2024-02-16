package models;

public class Chofer {
    private String nombre;
    private int idcarro;
    private int id;

    public Chofer(String nombre, int idcarro, int id) {
        this.nombre = nombre;
        this.idcarro = idcarro;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
