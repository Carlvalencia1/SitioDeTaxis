package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Servicio {
    private String lugar;
    private LocalTime hora;
    private double monto;
    private LocalDate fecha;

    public Servicio(String lugar, LocalTime hora, double monto, LocalDate fecha) {
        this.lugar = lugar;
        this.hora = hora;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "lugar='" + lugar + '\'' +
                ", hora=" + hora +
                ", monto=" + monto +
                ", fecha=" + fecha +
                '}';
    }
}
