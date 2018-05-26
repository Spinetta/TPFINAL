import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Hotel {
    private Map<String, Cliente> clientes;
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;
    private int cantPasajeros = 0;
    private int cantReservas = 0;

    public Hotel(Map<String, Cliente> clientes, List<Habitacion> habitaciones) {
        this.clientes = clientes;
        this.habitaciones = habitaciones;
        this.reservas = new ArrayList<>();
    }

    public Habitacion buscarHabitacionLibre() {
        for (Habitacion h : habitaciones) {
            if (h.getPasajero() == null) {
                return h;
            }
        }
        return null;
    }

    public Cliente buscarCliente(Cliente cliente) {
        Cliente buscado = clientes.get(cliente.getNombreYAp()); // busco al cliente pasado por parametro en el mapa y lo devuelvo
        return buscado;
    }


    public void checkIn(Cliente cliente) {
        Habitacion libre = buscarHabitacionLibre();
        Cliente buscado = buscarCliente(cliente);

        if (libre != null && buscado!=null) {
            cantPasajeros++;
            buscado.setPasajero(true);

        }

    }


}

