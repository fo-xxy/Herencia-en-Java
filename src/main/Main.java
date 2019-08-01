package main;

import conversion.TemperaturaLogica;

import javax.swing.*;
import static constantes.TemperaturaString.*;

public class Main {

    /*1: Se crea otro package con el nombre converion y una clase con el nombre TemperaturaEnteros*/

    /*15: Creamos el método princial*/
    public static void main(String[] args){
        /*16: Instanciamos la clase que tiene la logica en este caso es el padre pero llamamos al hijo ya que este tiene asceso a la clase padre*/
        TemperaturaLogica temperaturaLogica = new TemperaturaLogica();

        /*17: Pedimos que ingresen los datos */
        String valorTemperatura = JOptionPane.showInputDialog(null, MENSAJE_PETICION_GRADOS.getMensaje());

        /*18: se llama al metodo set con el objeto de la clase para darle el valor del dato*/
        temperaturaLogica.setCentigrados(Double.parseDouble(valorTemperatura));

        /*19: Para mostrar el resultado*/
        JOptionPane.showMessageDialog(null, MENSAJE_CONVERSION.getMensaje() + temperaturaLogica.getCentigrados() + MENSAJE_CENTIGRADOS_A_FARENHEIT.getMensaje() + temperaturaLogica.calcularTemperaturaFarenheit());

    }
}
