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
public class Team {
    
    private String name;
    private ArrayList<Player> Jugadores;

    public Team() {
    }



    public Team(String name) {
        
        this.Jugadores = new ArrayList<Player>();
        this.name = name;
        
    }
    
    
    public void add(Player p)
    {
        
        p.setVeces_equipo(p.getVeces_equipo() + 1);
            
        getJugadores().add(p);
        p.add(this);
        
    }
    
    public void remove(Player p)
    {
    
        getJugadores().remove(p);
        
    }
    
    public void listar()
    {
    
        System.out.println(this);
        
    }
    
    public boolean equals(Team t)
    {
        
        boolean respuesta = false;
        
        if (this.getName().equals(t.getName()))
        {
            
            respuesta = true;
            
        }
        else if (!this.getName().equals(t.getName()))
        {
            
            respuesta = false;
            
        }
        
        return respuesta;
        
    }


    public String toString() {
        
        
        StringBuilder result = new StringBuilder();
        
        result.append("Equipo: " + this.getName());
        
        for (int i = 0; i < getJugadores().size(); i++)
        {
            
            result.append("\n Jugador: " + getJugadores().get(i).getName() + "   PA: " + getJugadores().get(i).getAttackPoints() + " PD: " + getJugadores().get(i).getDefensePoints() + " PV: " + getJugadores().get(i).getLife() + " (Pertenece a " + getJugadores().get(i).getVeces_equipo() + " equipos)");
            
        }
        
        result.append("\n");
        return result.toString();
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Jugadores
     */
    public ArrayList<Player> getJugadores() {
        return Jugadores;
    }

    /**
     * @param Jugadores the Jugadores to set
     */
    public void setJugadores(ArrayList<Player> Jugadores) {
        this.Jugadores = Jugadores;
    }
    
    
}
