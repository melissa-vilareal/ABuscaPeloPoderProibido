import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Botao extends Actor {
    private GreenfootImage normalImage;
    private GreenfootImage hoverImage;
    private boolean isMouseOver = false;
    private World destino;

    public Botao(String normalImagePath, String hoverImagePath, World destino){
        this.destino = destino;
    
        // Carrega as imagens do botão
        normalImage = new GreenfootImage(normalImagePath);
        hoverImage = new GreenfootImage(hoverImagePath);
    
        // Adiciona texto à imagem normal
        /*normalImage.setColor(Color.WHITE);
        normalImage.setFont(new Font(18));
        normalImage.drawString(texto, 30, 30);*/
    
        // Adiciona texto à imagem de hover
        /*
        hoverImage.setColor(Color.WHITE);
        hoverImage.setFont(new Font(18));
        hoverImage.drawString(texto, 30, 30);*/
    
        // Define a imagem inicial
        setImage(normalImage);
    }


    public void act() {
        // Verifica se o mouse está sobre o botão
        if (Greenfoot.mouseMoved(this)) {
            isMouseOver = true;
            setImage(hoverImage);
        } else if (Greenfoot.mouseMoved(null)) {
            isMouseOver = false;
            setImage(normalImage);
        }
        // Verifica se o botão foi clicado
        if (Greenfoot.mouseClicked(this)) {
            if (destino != null) {
                Greenfoot.setWorld(destino); // Troca para o mundo associado ao botão
            } else {
                System.out.println("Nenhum destino configurado para o botão.");
            }
        }
    }
}
