package com.firstSpring.learning_spring.game;

public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("Jump!");
    }
    public void down(){
        System.out.println("Go into the hole!");
    }
    public void left(){
        System.out.println("Stop");
    }
    public void right(){
        System.out.println("Accelerate");
    }
}
