package models;

import java.util.ArrayList;

public class ListaChoferes {
    private ArrayList<Chofer> listaChoferes = new ArrayList<>();

    public void addChoferes(Chofer chofer) {
        listaChoferes.add(chofer);
    }

    public ArrayList<Chofer> getChoferes() {
        return listaChoferes;
    }

    public Chofer getChoferPorId(int id) {
        for (Chofer chofer : listaChoferes) {
            if (chofer.getId() == id) {
                return chofer;
            }
        }
        return null;
    }
}
