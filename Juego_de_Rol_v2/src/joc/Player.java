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
public abstract class Player {
    
    private String name;
    private int attackPoints;
    private int defensePoints;
    private int life;

    public Player(String name, int attackPoints, int defensePoints, int life) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
    }
    
    
    public void attack(Player p)
    {
        
        p.hit(this.attackPoints);
        System.out.println(this.name + " está atacando a " + p.name);
        
    }
    
    protected void hit(int attack)
    {
        
        this.life -= attack;
        
    }
    
    
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", attackPoints=" + attackPoints + ", defensePoints=" + defensePoints + ", life=" + life + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the attackPoints
     */
    public int getAttackPoints() {
        return attackPoints;
    }

    

    /**
     * @return the defensePoints
     */
    public int getDefensePoints() {
        return defensePoints;
    }

    /**
     * @return the life
     */
    public int getLife() {
        return life;
    }
    
    
    
    
    
}
