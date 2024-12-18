import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Parede here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parede extends Actor
{
    private int id;

    // Imagens estáticas para serem reutilizadas
    public static GreenfootImage cantoInferiorD = new GreenfootImage("cantoInferiorD.png");
    public static GreenfootImage cantoInferiorE = new GreenfootImage("cantoInferiorE.png");
    public static GreenfootImage cantoSuperiorD = new GreenfootImage("cantoSuperiorD.png");
    public static GreenfootImage cantoSuperiorE = new GreenfootImage("cantoSuperiorE.png");
    public static GreenfootImage colunaSuperior = new GreenfootImage("colunaSuperior.png");
    public static GreenfootImage colunaInferior = new GreenfootImage("colunaInferior.png");
    public static GreenfootImage colunaCima = new GreenfootImage("colunaSuperior.png");
    public static GreenfootImage parede = new GreenfootImage("parede.png");
    public static GreenfootImage topo = new GreenfootImage("topo.png");
    public static GreenfootImage topoCantoSuperiorD = new GreenfootImage("topoCantoSuperiorD.png");
    public static GreenfootImage topoCantoSuperiorE = new GreenfootImage("topoCantoSuperiorE.png");
    public static GreenfootImage topoFimCima = new GreenfootImage("topoFimCima.png");
    public static GreenfootImage topoT = new GreenfootImage("topoT.png");
    public static GreenfootImage topoVertical = new GreenfootImage("topoVertical.png");
    public static GreenfootImage paredeColuna = new GreenfootImage("paredeColuna.png");
    public static GreenfootImage topoColuna = new GreenfootImage("topoColuna.png");
    public static GreenfootImage paredeBandeira = new GreenfootImage("paredeBandeira.png");
    public static GreenfootImage topoBandeira = new GreenfootImage("topoBandeira.png");

    // Bloco estático para redimensionar todas as imagens uma vez quando a classe é carregada
    static {
        // Lista de todas as imagens a serem redimensionadas
        GreenfootImage[] imagens = {
                cantoInferiorD, cantoInferiorE, cantoSuperiorD, cantoSuperiorE,
                colunaSuperior, colunaInferior, colunaCima, parede, topo,
                topoCantoSuperiorD, topoCantoSuperiorE, topoFimCima, topoT, 
                topoVertical, paredeColuna, topoColuna, paredeBandeira, topoBandeira
            };

        // Redimensiona cada imagem para 3x o tamanho original (16x16 -> 48x48)
        for (GreenfootImage imagem : imagens) {
            imagem.scale(imagem.getWidth() * 3, imagem.getHeight() * 3);
        }
    }

    public Parede (int id, GreenfootImage imagem){
        this.id = id;

        // Define a imagem da parede com base no parâmetro passado
        setImage(imagem);
    }

}
