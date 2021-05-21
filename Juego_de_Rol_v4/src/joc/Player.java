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
    private int veces_equipo = 0;

    public Player(String name, int attackPoints, int defensePoints, int life) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
        this.veces_equipo = 0;
    }
    
    
    public void attack(Player p)
    {
        
        p.hit(this.attackPoints);
        System.out.println(this.name + " está atacando a " + p.name + " con " + this.attackPoints + " puntos de ataque." +  p.name + " se defiende con sus " + p.defensePoints + " puntos de defensa y se queda con " + p.life + " puntos de vida.");
        
    }
    
    protected void hit(int attack)
    {
        
        int attack_new = attack - this.defensePoints;
        this.setLife(this.life - attack_new);
        
    }
    
    public void add(Team t)
    {
        
        this.setVeces_equipo(this.getVeces_equipo() + 1);
        this.add(t);
          
    }
    
    public void remove(Team t)
    {
        
        this.remove(t);
                
    }
    
    public boolean equals(Player p)
    {
        
        boolean respuesta = false;
        
        if (this.name == p.getName() && this.attackPoints == p.getAttackPoints() && this.defensePoints == p.getDefensePoints() && this.life == p.getLife())
        {
            
            respuesta = true;
            
        }
        else if (this.name != p.getName())
        {
            
            respuesta = false;
            
        }
        
        
        return respuesta;
        
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

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param attackPoints the attackPoints to set
     */
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    /**
     * @param defensePoints the defensePoints to set
     */
    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    /**
     * @param life the life to set
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     * @return the veces_equipo
     */
    public int getVeces_equipo() {
        return veces_equipo;
    }

    /**
     * @param veces_equipo the veces_equipo to set
     */
    public void setVeces_equipo(int veces_equipo) {
        this.veces_equipo = veces_equipo;
    }
    
    
    
    
    
}
