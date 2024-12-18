import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Saida extends Actor {
    private String destino;

    public Saida(String destino) {
        this.destino = destino;
        // Carregar e redimensionar a imagem da saída. 
        // Escolhi deixar a opção de colocar no mapa e de tornar transparente. Por enquanto comentar o nao em uso
        //GreenfootImage imagem = new GreenfootImage("4x4vazio.png");
        
        GreenfootImage imagem = new GreenfootImage("saida.png");

        imagem.scale(imagem.getWidth() * 3, imagem.getHeight() * 3);  // Aumentar 3x o tamanho
        setImage(imagem);
    }

    public void act() {
        if (isTouching(Jogador.class)) {
            if ("salaLabirinto".equals(destino)) {
                Greenfoot.setWorld(new SalaLabirinto());  // Mudança para a próxima sala
            }
        }
    }
}
