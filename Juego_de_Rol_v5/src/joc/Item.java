/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

/**
 *
 * @author ThorP
 */
public class Item {
    
    private String name;
    private int attackBonus;
    private int defenseBonus;

    public Item(String name, int attackBonus, int defenseBonus) {
        this.name = name;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
    }

    public Item() {
    }

    @Override
    public String toString() {
        
        String almacen = "- " + this.name + "  BA: " + this.attackBonus + "  /  BD: " + this.defenseBonus;
        return almacen;
        
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
     * @return the attackBonus
     */
    public int getAttackBonus() {
        return attackBonus;
    }

    /**
     * @param attackBonus the attackBonus to set
     */
    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    /**
     * @return the defenseBonus
     */
    public int getDefenseBonus() {
        return defenseBonus;
    }

    /**
     * @param defenseBonus the defenseBonus to set
     */
    public void setDefenseBonus(int defenseBonus) {
        this.defenseBonus = defenseBonus;
    }
    
    
    
    
}
