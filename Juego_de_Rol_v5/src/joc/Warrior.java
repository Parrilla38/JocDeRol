/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

import joc.Player;

/**
 *
 * @author Jesús Parra <Jesús Parra>
 */
public class Warrior extends Human{


    public Warrior(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
        System.out.println("He creado un Guerrero");
    }
    
    protected void hit(int attack)
    {
        
        if(attack < 5)
        {
            
            attack = 0;
            this.setLife(this.getLife() - attack);
            
        }
        else
        {
            
           int attack_new = attack - this.getDefensePoints();
           this.setLife(this.getLife() - attack_new);     
                
                
        }
        
    }
    
    
    
}
