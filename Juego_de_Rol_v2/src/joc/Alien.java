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
public class Alien extends Player{
    
    public Alien(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
        System.out.println("He creado un Alien");
    }
    
}
