import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lanterna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Lanterna extends Actor {
    private GreenfootImage lanterna;
    private static final int LANTERNA_WIDTH = 1840;
    private static final int LANTERNA_HEIGHT = 1440;

    public Lanterna() {
        // Cria a imagem do buraco transparente
        lanterna = new GreenfootImage("lanterna.png");
        lanterna.scale(LANTERNA_WIDTH, LANTERNA_HEIGHT);

        setImage(lanterna); // Define como imagem do ator
    }

    public void atualizarPosicao(int x, int y) {
        setLocation(x, y); // Atualiza a posição da lanterna
    }
}

