import java.util.List;
import java.util.Map;

public class Conserje extends Hotel{

    public Conserje(Map<String, Cliente> clientes, List<Habitacion> habitaciones) {
        super(clientes, habitaciones);
    }

    @Override
    public void iniciarSistema() {

    }
}
