package models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ListaChoferes {
    private LocalDate diaTrabajo;
    private LocalTime horaTrabajo;
    private ArrayList<Chofer> listaChoferes = new ArrayList<Chofer>();
    public void addChoferes(Chofer chofer){
        listaChoferes.add(chofer);
    }
    public ArrayList<Chofer> getChoferes() {
        return listaChoferes;
    }
}

