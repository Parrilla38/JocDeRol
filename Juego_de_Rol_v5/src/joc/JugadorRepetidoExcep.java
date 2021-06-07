/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

/**
 *
 * @author Jesús Parra <Jesús Parra>
 */
public class JugadorRepetidoExcep extends Exception{
    
    public JugadorRepetidoExcep(String message) {
        super(message);
    }

    public JugadorRepetidoExcep() {
        super("El jugador está repetido");
    }
    
}
