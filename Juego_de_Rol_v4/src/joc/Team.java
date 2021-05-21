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
    
    String name;
    private ArrayList<Player> Jugadores;

    public Team(String name) {
        
        this.Jugadores = new ArrayList<Player>();
        this.name = name;
        
    }
    
    
    public void add(Player p)
    {
        
        p.setVeces_equipo(p.getVeces_equipo() + 1);
            
        Jugadores.add(p);
        
    }
    
    public void remove(Player p)
    {
    
        Jugadores.remove(p);
        
    }
    
    public void listar()
    {
    
        System.out.println(this);
        
    }
    
    public boolean equals(Team t)
    {
        
        boolean respuesta = false;
        
        if (this.name == t.name)
        {
            
            respuesta = true;
            
        }
        else if (this.name != t.name)
        {
            
            respuesta = false;
            
        }
        
        return respuesta;
        
    }


    public String toString() {
        
        
        StringBuilder result = new StringBuilder();
        
        result.append("Equipo: " + this.name);
        
        for (int i = 0; i < Jugadores.size(); i++)
        {
            
            result.append("\n Jugador: " + Jugadores.get(i).getName() + "   PA: " + Jugadores.get(i).getAttackPoints() + " PD: " + Jugadores.get(i).getDefensePoints() + " PV: " + Jugadores.get(i).getDefensePoints() + " (Pertenece a " + Jugadores.get(i).getVeces_equipo() + " equipos)");
            
        }
        
        result.append("\n");
        return result.toString();
        
    }
    
    
}
