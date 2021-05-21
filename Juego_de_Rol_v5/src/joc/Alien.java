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
    
    public Alien(String name, int attackPoints, int defensePoints, int life)
    {
        
        super(name, attackPoints, defensePoints, life);
        System.out.println("He creado un Alien");
        
        
        
    }
    
    @Override
    public void attack(Player p)
    {
        
        
        if(this.getLife() > 20)
        {
            
            this.setAttackPoints(this.getAttackPoints() + 3);
            
            if (this.getDefensePoints() >= 3)
            {
                
                this.setDefensePoints(this.getDefensePoints() - 3);
                p.hit(this.getAttackPoints());
                
            }
            else if (this.getDefensePoints() < 0)
            {
                
                this.setDefensePoints(0);
                p.hit(this.getAttackPoints());
                
            }
            else
            {
                
                p.hit(this.getAttackPoints());
                
            }
            
            
            
        }
        else if (this.getLife() <= 20)
        {
            
            p.hit(this.getAttackPoints());
            
        }
        
        System.out.println(this.getName() + " está atacando a " + p.getName() + " con " + this.getAttackPoints() + " puntos de ataque." +  p.getName() + " se defiende quedandose con " + p.getDefensePoints() + " puntos de defensa y se queda con " + p.getLife() + " puntos de vida.");
        
        
    }
}
