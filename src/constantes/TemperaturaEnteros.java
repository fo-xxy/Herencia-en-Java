package constantes;

public enum TemperaturaEnteros {
    /*6: Se crea el mensaje*/
    CERO(0),
    NUEVE(9),
    CINCO(5),
    TREINTAYDOS(32);

    /*7: Se crea una tributos*/
    private int valor;

    /*8: Se crea una contructor */

    TemperaturaEnteros(int i) {
        this.valor = i;
    }

    /*9: Se crea un método Get*/

    public int getValor() {
        return valor;
    }
    /*10: Se cambia en el packcage y en la clase TemperaturaEnteros el 0*/
}
