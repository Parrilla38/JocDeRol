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
    
    
    public void add(Player p) throws MiExcepcion
    {
        int contador = 0;
        for (int i = 0; i < Jugadores.size(); i++)
        {
            
            if(Jugadores.get(i).getName() == p.getName())
            {
                
                contador += 1;
                
            }
            
            
            
        }
        if (contador > 0)
        {
            
            throw new MiExcepcion("No puede repetirse un mismo jugador en el mismo equipo.");
            
        }
        else
        {
            
            p.setVeces_equipo(p.getVeces_equipo() + 1);
            
            getJugadores().add(p);
            p.add(this);
            
        }
        
        
        
    }
    
    public void remove(Player p) throws MiExcepcion
    {
        
        
        
        int contador = 0;
        for (int i = 0; i < Jugadores.size(); i++)
        {
            
            if(Jugadores.get(i) == p)
            {
                
                contador += 1;
                
            }
            
            
            
        }
        if (contador == 0)
        {
            
            throw new MiExcepcion("No se puede borrar un jugador que no está en el equipo.");
            
        }
        else
        {
            
            getJugadores().remove(p);
            
        }
    
        
        
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
            
            result.append("\n Jugador: " + this.getJugadores().get(i).getName() + "   PA: " + this.getJugadores().get(i).getAttackPoints() + " PD: " + this.getJugadores().get(i).getDefensePoints() + " PV: " + this.getJugadores().get(i).getLife() + " (Pertenece a " + this.getJugadores().get(i).getVeces_equipo() + " equipos)");
            
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
