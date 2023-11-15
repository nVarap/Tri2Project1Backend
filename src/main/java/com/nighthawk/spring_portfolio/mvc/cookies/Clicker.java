package com.nighthawk.spring_portfolio.mvc.cookies;
import java.util.HashMap;



public class Clicker implements Comparable<Clicker>{
    private int cp;
    private int cost;
    private String name;
    private String rarity;
    private boolean unlocked;

    private HashMap<String, Integer> rarityMap = new HashMap<String, Integer>();

    public Clicker(String rarity, String name, int cp, int cost){
        
        this.cp = cp;
        this.cost = cost;
        this.name = name;
        this.rarity = rarity;
    }

    @Override
    public int compareTo(Clicker t) {
        return Integer.compare(rarityMap.get(this.rarity), rarityMap.get(t.rarity));
    }
    
    
}
