import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Jogador extends Actor {
    private static int speed;
    

    private static final int SCALE_WIDTH = 32; // Largura real do jogador
    private static final int SCALE_HEIGHT = 32; // Altura real do jogador

    public Jogador() {
        // Definir velocidade
        speed = 2;
    }

    public void act() {
        slideAround();
    }

    public void slideAround() {
        int x = getX();
        int y = getY();

        if (Greenfoot.isKeyDown("right")) {
            setLocation(x + speed, y);
            if (hitWalls()) {
                setLocation(x - speed, y);
            }
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(x - speed, y);
            if (hitWalls()) {
                setLocation(x + speed, y);
            }
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(x, y - speed);
            if (hitWalls()) {
                setLocation(x, y + speed);
            }
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(x, y + speed);
            if (hitWalls()) {
                setLocation(x, y - speed);
            }
        }
    }

    public boolean hitWalls() {
        return isTouching(Parede.class);
    }
}