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
        provaFase();
        
    }
    
    
    
    static public void provaFase()
    {
        
        System.out.println("Va a crearse un Humano");
        Human Byllorge = new Human("Byllorge", 20, 20, 200);
        System.out.println("Humano creado");
        System.out.println("");
        System.out.println("Va a crearse un Guerrero");
        Warrior PassiveSky = new Warrior("PassiveSky", 15, 30, 250);
        System.out.println("Guerrero creado");
        System.out.println("");
        System.out.println("Va a crearse un Alien");
        Alien MrMacia = new Alien("MrMacia", 40, 10, 120);
        System.out.println("Alien creado");
        
        System.out.println(Byllorge);
        System.out.println(MrMacia);
        Byllorge.attack(MrMacia);
        System.out.println(MrMacia);
        MrMacia.attack(Byllorge);
        System.out.println(Byllorge);
        
    }
    
}
