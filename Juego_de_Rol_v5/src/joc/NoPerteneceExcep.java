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
public class NoPerteneceExcep extends Exception{
    
    public NoPerteneceExcep(String message) {
        super(message);
    }

    public NoPerteneceExcep() {
        super("El jugador no pertenece al Equipo");
    }
    
}
