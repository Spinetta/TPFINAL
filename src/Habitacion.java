import java.time.LocalDate;
import java.time.Period;

public class Habitacion {
    private int id;
    private String estado;
    private Cliente pasajero; //null si esta libre
    private Period diasOcupada;

    public Habitacion(int id, String estado, Cliente pasajero, Period diasOcupada) {
        this.id = id;
        this.estado = estado;
        this.pasajero = pasajero;
        this.diasOcupada = diasOcupada;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getPasajero() {
        return pasajero;
    }

    public void setPasajero(Cliente pasajero) {
        this.pasajero = pasajero;
    }

    public Period getDiasOcupada() {
        return diasOcupada;
    }

    public void setDiasOcupada(Period diasOcupada) {
        this.diasOcupada = diasOcupada;
    }
}
