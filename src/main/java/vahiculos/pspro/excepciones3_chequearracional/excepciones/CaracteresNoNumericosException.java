/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vahiculos.pspro.excepciones3_chequearracional.excepciones;

/**
 *
 * @author Nitro
 */
public class CaracteresNoNumericosException extends Exception {
    public CaracteresNoNumericosException(){
        super("Se han introducido caracteres no numéricos");
    }
}
