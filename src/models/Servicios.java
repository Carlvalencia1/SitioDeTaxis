package models;

import models.Servicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Servicios {
    private List<Servicio> servicios;

    public Servicios() {
        this.servicios = new ArrayList<>();
    }



    public List<Servicio> getServicios(LocalDate fecha) {
        List<Servicio> serviciosDelDia = new ArrayList<>();
        for (Servicio servicio : servicios) {
            if (servicio.getFecha().equals(fecha)) {
                serviciosDelDia.add(servicio);
            }
        }
        return serviciosDelDia;
    }

    public void addServicio(Servicio servicio) {

    }
}
