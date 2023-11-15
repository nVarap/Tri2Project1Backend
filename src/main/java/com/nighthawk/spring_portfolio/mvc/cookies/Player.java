package com.nighthawk.spring_portfolio.mvc.cookies;
import java.util.ArrayList;

public class Player {
    //TODO: Implement:
    /*
     * Arraylist Clickers --> clickers that can be unlocked
     * Arraylist Upgrades --> List of possible upgrades that can be unlocked
     * Arraylist UnlockedClickers --> Clickers that have been unlocked (can be sorted by rarity)
     * Arraylist UnlockedUpgrades --> Unlocked Upgrades and level values
     * Clicker CurrentClicker --> Current Clicker held by player
     */

    private ArrayList<Clicker> unlockedClickers;
    private ArrayList<Upgrade> unlockedUpgrades;
    private Clicker CurrentClicker;

    public Player(){
        this.unlockedClickers = new ArrayList<Clicker>(); // add a way to get a default one, prolly add it
        this.unlockedUpgrades = new ArrayList<Upgrade>();
        this.CurrentClicker = null;
    }

    public void unlockClicker(String rarity, String name, int cp, int cost){
        this.unlockedClickers.add(new Clicker(rarity, name, cp, cost));

        if(this.CurrentClicker == null){
            this.CurrentClicker = unlockedClickers.get(0);
        }
    }

    public void unlockUpgrade(){
        // this.unlockedUpgrades.add()
    }

    public void upgradeUpgrade(){
        // write code to upgrade upgrade
    }

    //TODO: Implement Table stuff
}
