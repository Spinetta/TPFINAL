import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args){
        List<Habitacion> habitacions = new ArrayList<>();
        Map<String,Cliente> clientes = new TreeMap<>();

        for (int i=0 ; i<50; i++){
            habitacions.add(new Habitacion(i+1,"Libre",null, null));
        }

        //Hotel miHotel = new Hotel(clientes, habitacions);



    }
}
