import java.time.LocalDate;
import java.time.Period;

public class Reserva {
    private int idReserva;
    private int idHabitacion;
    private Cliente cliente;
    private Period diasReservada;

    public Reserva(int idReserva, int idHabitacion, Cliente cliente, Period diasReservada) {
        this.idHabitacion = idHabitacion;
        this.cliente = cliente;
        this.diasReservada = diasReservada;
    }
}
