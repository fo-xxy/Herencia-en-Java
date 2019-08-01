package conversion;
import static constantes.TemperaturaEnteros.*;

public class Temperatura {

    /*2: Se crea los atributos*/
    private double centigrados;

    /*3: Se crea un constructor*/
    public Temperatura() {
        this.centigrados = CERO.getValor() ;
        /*11: Se crea otra clase, temperaturaLogica*/
    }

    /*4: Se crea los métodos Setter y Getter*/
    public double getCentigrados() {
        return centigrados;
    }

    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
    }

    /*5: Se crea la constante del constructor del valor 0, es buena practica no tener el valor quemado*/
}
