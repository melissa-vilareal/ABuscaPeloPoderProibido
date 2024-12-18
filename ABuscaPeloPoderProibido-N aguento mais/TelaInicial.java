import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TelaInicial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TelaInicial extends World
{

    /**
     * Constructor for objects of class TelaInicial.
     * 
     */
    public TelaInicial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 720, 1);  // Tamanho do mundo em pixels e a escala dos tiles
        // Carrega a imagem de fundo original
        GreenfootImage imagemFundo = new GreenfootImage("fundo.png");

        // Redimensiona a imagem de fundo para cobrir a nova resolução
        imagemFundo.scale(getWidth(), getHeight());
        setBackground(imagemFundo);
        
        Botao iniciar = new Botao("jogar1.png","jogar2.png", new SalaLabirinto());
        Botao informacoes = new Botao ("instrucoes1.png","instrucoes2.png", new Instrucoes());
        
        // Calcula posições centralizadas dinamicamente
        int botaoY = getHeight() - 100; // Define a altura dos botões (100px acima da base da tela)
        int iniciarX = getWidth() / 4;  // Primeiro botão no 1/4 da largura
        int informacoesX = (getWidth() / 4) * 3; // Segundo botão no 3/4 da largura

        // Adiciona os botões ao mundo
        addObject(iniciar, iniciarX, botaoY);
        addObject(informacoes, informacoesX, botaoY);
    }
}
