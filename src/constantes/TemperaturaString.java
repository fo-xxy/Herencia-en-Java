package constantes;

public enum TemperaturaString {

    /*Se crean los mensajes*/
    MENSAJE_PETICION_GRADOS("Ingrese temperatura en centigrados a convertir en Farenheit: "),
    MENSAJE_CONVERSION("La converción de"),
    MENSAJE_CENTIGRADOS_A_FARENHEIT("°C a Farenheit es: " );

    private String mensaje;


    TemperaturaString(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
