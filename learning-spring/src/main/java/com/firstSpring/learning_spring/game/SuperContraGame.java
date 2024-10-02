package com.firstSpring.learning_spring.game;

public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("SuperContra Jump!");
    }
    public void down(){
        System.out.println("SuperContra, Go into the hole!");
    }
    public void left(){
        System.out.println("SuperContra Stop");
    }
    public void right(){
        System.out.println("SuperContra Accelerate");
    }
}
