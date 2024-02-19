package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Arqueo {
    private LocalDate fecha;
    private double totalIngresos;

    public Arqueo(LocalDate fecha, double totalIngresos) {
        this.fecha = fecha;
        this.totalIngresos = totalIngresos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getTotalIngresos() {
        return totalIngresos;
    }

    @Override
    public String toString() {
        return "Arqueo{" +
                "fecha=" + fecha +
                ", totalIngresos=" + totalIngresos +
                '}';
    }
}
