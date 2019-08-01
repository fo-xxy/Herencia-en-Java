package conversion;
import static constantes.TemperaturaEnteros.*;

/*12: se hace la herencia con la clase*/
public class TemperaturaLogica extends Temperatura {

    /*13: Se crea un Metodo para otro calculo y se llama un metodo get de la clase TemperaturaEnteros*/
    public double calcularTemperaturaFarenheit(){
        return(this.getCentigrados()* NUEVE.getValor()  /CINCO.getValor()) + TREINTAYDOS.getValor();
        /*14: Nos vamos al main*/

    }


}
