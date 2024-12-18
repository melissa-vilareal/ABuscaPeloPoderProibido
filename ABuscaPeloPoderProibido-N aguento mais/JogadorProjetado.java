import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class JogadorProjetado extends Actor {
    private GreenfootImage projectedImage;
    private static final int PROJECTED_WIDTH = 80;
    private static final int PROJECTED_HEIGHT = 120;

    public JogadorProjetado() {
        // Defina a imagem projetada com tamanho maior
        projectedImage = new GreenfootImage("down.png");  // Substitua pelo seu sprite
        projectedImage.scale(PROJECTED_WIDTH, PROJECTED_HEIGHT);
        setImage(projectedImage);  // Defina a imagem do ator projetado
    }

    public void updatePosition(int x, int y) {
        // Atualize a posição do ator projetado para acompanhar o jogador
        setLocation(x, y);
        

    }
}
/*
        // Carregar imagens para cada direção
        upImage = new GreenfootImage("up.png");
        downImage = new GreenfootImage("down.png");
        leftImage = new GreenfootImage("left.png");
        rightImage = new GreenfootImage("right.png");

        // Redimensionar as imagens
        upImage.scale(SCALE_WIDTH, SCALE_HEIGHT);
        downImage.scale(SCALE_WIDTH, SCALE_HEIGHT);
        leftImage.scale(SCALE_WIDTH, SCALE_HEIGHT);
        rightImage.scale(SCALE_WIDTH, SCALE_HEIGHT);

        // Definir a imagem inicial do jogador
        setImage(upImage);
        
        private GreenfootImage upImage;
    private GreenfootImage downImage;
    private GreenfootImage leftImage;
    private GreenfootImage rightImage;
    */