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
public class ObjetoRepetidoExcep extends Exception{
    
    public ObjetoRepetidoExcep(String message) {
        super(message);
    }

    public ObjetoRepetidoExcep() {
        super("El Objeto ya existe");
    }
    
}
