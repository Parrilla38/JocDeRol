/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inici;
import joc.*;

/**
 *
 * @author Jesús Parra <Jesús Parra>
 */
public class JocDeRol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
    public void provaFase()
    {
        
        System.out.println("Va a crearse un Humano");
        Human Byllorge = new Human();
        System.out.println("Humano creado");
        System.out.println("");
        System.out.println("Va a crearse un Humano");
        Warrior PassiveSky = new Warrior();
        System.out.println("Guerrero creado");
        System.out.println("");
        System.out.println("Va a crearse un Alien");
        Alien MrMacia = new Alien();
        System.out.println("Alien creado");
        
    }
    
}
