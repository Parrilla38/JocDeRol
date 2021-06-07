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
public class AtaquePropioExcep extends Exception{
    
    public AtaquePropioExcep(String message) {
        super(message);
    }

    public AtaquePropioExcep() {
        super("El jugador no se puede atacar a si mismo");
    }
    
}
