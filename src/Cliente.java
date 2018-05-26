public class Cliente extends Persona{
    private int id;
    private String ciudad;
    private String domicilio;
    private Boolean pasajero;

    public Cliente(String nombreYAp, String dni, tiposDePersona tipo, int id, String ciudad, String domicilio, Boolean pasajero) {
        super(nombreYAp, dni, tiposDePersona.CLIENTE); // YA FIJO QUE ES UN CLIENTE
        this.id = id;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
        this.pasajero = pasajero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Boolean getPasajero() {
        return pasajero;
    }

    public void setPasajero(Boolean pasajero) {
        this.pasajero = pasajero;
    }
}
