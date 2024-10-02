package com.firstSpring.learning_spring.game;

public class PacmanGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Pacman Up!");
    }

    @Override
    public void down() {
        System.out.println("Pacman down!");
    }

    @Override
    public void left() {
        System.out.println("Pacman Left!");
    }

    @Override
    public void right() {
        System.out.println("Pacman Right!");
    }
}
