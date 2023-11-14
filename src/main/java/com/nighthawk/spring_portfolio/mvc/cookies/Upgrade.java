package com.nighthawk.spring_portfolio.mvc.cookies;

public class Upgrade {
    private int click_per;
    private int level;
    private float angel_tokens;

    public Upgrade(int cp){
        this.level = 0;
        this.click_per = cp;
        this.angel_tokens = 0;
    }

    public void incLevel(){
        this.level ++;
        if (this.level % 5 == 0){
            this.angel_tokens += 0.5;
        }
    }
}
