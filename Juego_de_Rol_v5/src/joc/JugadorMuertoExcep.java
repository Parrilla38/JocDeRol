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
public class JugadorMuertoExcep extends Exception{
    
    public JugadorMuertoExcep(String message) {
        super(message);
    }

    public JugadorMuertoExcep() {
        super("El jugador esta muerto");
    }
    
}
