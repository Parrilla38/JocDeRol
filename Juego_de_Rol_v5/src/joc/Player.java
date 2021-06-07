/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;
import java.util.*;
/**
 *
 * @author Jesús Parra <Jesús Parra>
 */
public abstract class Player {
    
    private ArrayList<Team> Teams;
    Item items[] = new Item[3];
    
    private String name;
    private int attackPoints;
    private int defensePoints;
    private int life = 100;
    private int veces_equipo = 0;
    private int contador = 0;
    
    public Player() {
    }

    public Player(String name, int attackPoints, int defensePoints, int life) {
        this.name = name;
        this.Teams = new ArrayList<Team>();
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
        this.veces_equipo = 0;
        this.contador = 0;
    }
    
    
    public void attack(Player p) throws JugadorMuertoExcep
    {
        if (this.getLife() <= 0)
        {
            
            throw new JugadorMuertoExcep("El jugador " + this.getName() + "está muerto y no puede ser atacado.");
            
        }
        if (p.getLife() <= 0)
        {
            
            throw new JugadorMuertoExcep("El jugador " + p.getName() + "está muerto y no puede ser atacado.");
            
        }

        
        
            for (Item item : this.items) 
            {
                
                if(item != null)
                {

                    if (item.getAttackBonus() > 0) 
                    {

                        this.setAttackPoints(this.getAttackPoints() + item.getAttackBonus());

                    } 
                    else if (item.getAttackBonus() < 0) 
                    {

                        this.setAttackPoints(this.getAttackPoints() - item.getAttackBonus());

                    }
            }
        }

            
            for (Item item : p.items) 
            {
                
                if(item != null)
                {
                    if (item.getDefenseBonus() > 0) 
                    {

                        p.setDefensePoints(p.getDefensePoints() + item.getDefenseBonus());

                    } 
                    else 
                    {

                        p.setDefensePoints(p.getDefensePoints() - item.getDefenseBonus());

                    }
            }
            
                
            
            
        }
        p.hit(this.getAttackPoints());
        System.out.println(this.getName() + " está atacando a " + p.getName() + " con " + this.getAttackPoints() + " puntos de ataque." +  p.getName() + " se defiende quedandose con " + p.getDefensePoints() + " puntos de defensa y se queda con " + p.getLife() + " puntos de vida.");
        
    }
    
    protected void hit(int attack)
    {
        
        
        
        if (attack >= this.defensePoints)
        {
            
            int attack_new = attack - this.defensePoints; 
            this.setDefensePoints(0);
                
            this.setLife(this.life - attack_new);  
            if (this.life < 0)
            {

                this.setLife(0);
                System.out.println("El jugador " + this.name + " ha muerto.");

            }
        }
        else if (attack < this.defensePoints && this.life > 0)
        {

            this.setDefensePoints(this.getDefensePoints() - attack);
            
        }
                
        
        
    }
    
    public void add(Team t) throws JugadorRepetidoExcep
    {
        
        if (!Teams.contains(t))
        {
            
            this.setVeces_equipo(this.getVeces_equipo() + 1);
            Teams.add(t);
            t.add(this);
            
        }
        else
        {
            
            throw new JugadorRepetidoExcep("El Equipo " + t.getName() + " ya tiene al jugador " + this.getName());
            
        }
        
        
          
    }
    
    public void add(Item i) throws ObjetoRepetidoExcep
    {
        
        if(!items.includes(i))
        this.items[this.getContador()] = i;
        this.setContador(this.getContador() + 1);
    }
    
    public void remove(Item i)
    {
            
        this.items[getContador()] = null;
        this.setContador(this.getContador() + 1);
    }
    
    public void remove(Team t) throws NoPerteneceExcep
    {
        
        if (Teams.contains(t))
        {
            
            this.remove(t);
            t.remove(this);
            
        }
        else
        {
            
            throw new NoPerteneceExcep("El jugador " + this.getName() + " no pertenece a este equipo.");
            
        }
        
        
                
    }
    
    public boolean equals(Player p)
    {
        
        boolean respuesta = false;
        
        if (this.name == p.getName())
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
        
        String almacen = " ";
        
        for (int i = 0; i < items.length; i++)
        {
            
            if (items[i] != null)
            {
                
                almacen += items[i];
                
            }
            
            
        }
        
        
        return this.name + " PA: " + this.getAttackPoints() + "  /  PD: " + this.getDefensePoints() + "  /   PV: " + this.getLife() + " (pertenece a " + this.getVeces_equipo() + " equipos)" + " tiene los items: \n\n" + almacen + "\n";
        
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
        return this.life;
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

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    
    
    
}
