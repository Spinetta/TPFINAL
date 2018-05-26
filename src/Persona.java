public class Persona {
    private String nombreYAp;
    private String dni;
    private tiposDePersona tipo;

    public Persona(String nombreYAp, String dni, tiposDePersona tipo) {
        this.nombreYAp = nombreYAp;
        this.dni = dni;
        this.tipo = tipo;
    }

    public enum tiposDePersona{
        CLIENTE,
        CONSERJE,
        ADMINISTRADOR;
    }

    public String getNombreYAp() {
        return nombreYAp;
    }

    public void setNombreYAp(String nombreYAp) {
        this.nombreYAp = nombreYAp;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public tiposDePersona getTipo() {
        return tipo;
    }

    public void setTipo(tiposDePersona tipo) {
        this.tipo = tipo;
    }
}

