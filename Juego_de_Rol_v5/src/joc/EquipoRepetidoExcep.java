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
public class EquipoRepetidoExcep extends Exception{
    
    public EquipoRepetidoExcep(String message) {
        super(message);
    }

    public EquipoRepetidoExcep() {
        super("El equipo esta repetido");
    }
    
}
