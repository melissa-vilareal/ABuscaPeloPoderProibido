import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Instrucoes: Exibe as informações sobre como jogar o jogo.
 * Contém o enredo, controles e objetivos de forma organizada.
 * 
 * @author Melissa de Carvalho V. Real, Maria Luiza Madeira e Guilherme Alexandre Cunha Silva
 * @version V1
 */
public class Instrucoes extends World {

    public Instrucoes() {    
        super(960, 720, 1);  // Tamanho do mundo em pixels e a escala dos tiles

        // Configura o fundo como preto
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(Color.BLACK);
        bg.fill();
        setBackground(bg);

        // Exibe as informações de como jogar
        mostrarInstrucoes();
        //Botao botaoVoltar = new Botao("Voltar", new TelaInicial());
        //addObject(botaoVoltar, getWidth() / 2, 550);
        // Adiciona o botão "Voltar" para retornar à tela inicial
    }

    /**
     * Mostra o conteúdo de "Como Jogar" na tela.
     */
    private void mostrarInstrucoes() {
        // Exibe o título
        showText("Como Jogar", getWidth() / 2, 50);

        // Texto detalhado das instruções
        String historia = 
            "Enredo:\n" +
            "Há muito tempo, o lendário artefato conhecido como Coração do Caos \n" +
            "foi selado em uma caverna esquecida para proteger o mundo de sua \n" +
            "energia destrutiva. Agora, como um feiticeiro determinado, você \n" +
            "busca libertar esse poder proibido.\n" +
            "Sua jornada o levará a um momento decisivo: dominar o Coração \n" +
            "e moldar o mundo à sua vontade, ou destruí-lo para sempre.";

        String controles = 
            "Controles:\n" +
            "- Use as teclas WASD ou as setas para se mover.\n" +
            "- Pressione a barra de espaço para lançar magias.";

        String objetivo = 
            "Objetivo:\n" +
            "- Resolva enigmas e enfrente inimigos para alcançar o Coração do Caos.\n" +
            "- Escolha entre libertar ou destruir o artefato e definir o destino do mundo.";

        // Exibe os textos centralizados dinamicamente
        exibirTextoQuebrado(historia, getWidth() / 2, 100);
        exibirTextoQuebrado(controles, getWidth() / 2, 300);
        exibirTextoQuebrado(objetivo, getWidth() / 2, 400);
    }

    /**
     * Divide o texto em múltiplas linhas e exibe na tela.
     * @param texto O texto a ser exibido.
     * @param x Posição X na tela.
     * @param y Posição Y na tela.
     */
    private void exibirTextoQuebrado(String texto, int x, int y) {
        String[] linhas = texto.split("\\n");
        int espacamento = 20;  // Espaçamento entre as linhas
        for (int i = 0; i < linhas.length; i++) {
            showText(linhas[i], x, y + (i * espacamento));
        }
    }

    public void act() {
        voltarMenu();
    }

    private void voltarMenu() {
        if (Greenfoot.isKeyDown("backspace")) {
            Greenfoot.setWorld(new TelaInicial());
        }
    }
}

