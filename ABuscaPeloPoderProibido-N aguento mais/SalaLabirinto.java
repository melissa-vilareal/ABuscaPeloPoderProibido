import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Essa é a nossa primeira sala de desafios. no total serão 3, 
 * cada uma com a proposta diferente.
 * 
 * @author Melissa de Carvalho V. Real, Maria Luiza Madeira e Guilherme Alexandre Cunha SIlva 
 * @version V1
 */

public class SalaLabirinto extends Ambientes {
    private ArrayList<Parede> paredes; // Lista para armazenar as paredes
    private JogadorProjetado jogadorProjetado;  // Referência ao JogadorProjetado
    private Jogador jogador;  // Referência ao jogador
    private Lanterna lanterna;

    public SalaLabirinto() {
        super(960, 720, 1);  // Tamanho do mundo em pixels e a escala dos tiles

        paredes = new ArrayList<>(); // Inicializa o ArrayList com o tipo Parede

        // Definir o fundo da sala

        // Redimensionar a imagem antes de definir como fundo
        GreenfootImage background = new GreenfootImage("mapaLabirinto.png");
        background.scale(background.getWidth() * 3, background.getHeight() * 3);
        setBackground(background);  // Definir a imagem redimensionada como fundo
        prepare();

        setPaintOrder(Lanterna.class, JogadorProjetado.class, Jogador.class);

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        // Criação do jogador e do jogador projetado
        jogador = new Jogador();
        jogadorProjetado = new JogadorProjetado(); 
        // Adicionar o jogador e o jogador projetado ao mundo
        addObject(jogador, 528, 672);  // Adiciona o jogador em uma posição inicial
        addObject(jogadorProjetado, 528, 628);  // Adiciona o jogador projetado na mesma posição

        // Adiciona a lanterna (passando o tamanho do mundo para a máscara)
        lanterna = new Lanterna(); // Raio do buraco
        addObject(lanterna, jogador.getX(), jogador.getY()-36); // Adiciona a lanterna

        // Sistema de categorização de nomes de paredes:
        // de baixo pra cima, esquerda para direita. L = linha de paredes

        // criar parede L1 -> lado esquerdo
        criarParedeHorizontal(1, 10, 0, 14, Parede.parede, Parede.topo);
        // criar parede L1 -> lado direito
        criarParedeHorizontal(11, 18, 12, 14, Parede.parede, Parede.topo);

        // criar parede L2 -> meio
        criarParedeHorizontal(19, 20, 3, 11, Parede.parede, Parede.topo);
        // criar parede L2 -> canto esquerdo
        criarParedeHorizontal(21, 21, 2, 11, Parede.cantoInferiorE, Parede.cantoSuperiorE);
        // criar parede L2 -> canto direito
        criarParedeHorizontal(22, 22, 5, 11, Parede.cantoInferiorD, Parede.cantoSuperiorD);

        // criar coluna meio entre L2 e L3 -> 
        criarParedeHorizontal(23, 23, 7, 11, Parede.cantoInferiorE, Parede.cantoSuperiorE);

        // criar parede L3 -> meio
        criarParedeHorizontal(24, 29, 11, 11, Parede.parede, Parede.topo);
        // criar parede L2 -> canto esquerdo
        criarParedeHorizontal(30, 30, 10, 11, Parede.cantoInferiorE, Parede.cantoSuperiorE);
        // criar parede L2 -> canto direito
        criarParedeHorizontal(31, 31, 17, 11, Parede.cantoInferiorD, Parede.cantoSuperiorD);

        // criar parede L4 -> meio
        criarParedeHorizontal(32, 32, 5, 8, Parede.parede, Parede.topo);
        // criar parede L4 -> canto direito
        criarParedeHorizontal(33, 33, 6, 8, Parede.cantoInferiorD, Parede.cantoSuperiorD);

        // criar colunas entre L4 e L5 ->
        criarParedeHorizontal(34, 34, 10, 8, Parede.paredeColuna, Parede.topoColuna);

        criarParedeHorizontal(35, 35, 15, 8,  Parede.paredeColuna, Parede.topoColuna);

        // criar parede L5 -> 
        criarParedeHorizontal(36, 38, 16, 7, Parede.parede, Parede.topo);

        // criar parede L6 -> 
        criarParedeHorizontal(37, 41, 3, 5, Parede.parede, Parede.topo);

        // criar colunas entre L6 e L7 ->
        criarParedeHorizontal(42, 42, 18, 5, Parede.parede, Parede.topo);

        // criar parede L7 -> meio
        criarParedeHorizontal(43, 45, 11, 4, Parede.parede, Parede.topo);
        // criar parede L7 -> canto direito
        criarParedeHorizontal(46, 46, 14, 4, Parede.cantoInferiorD, Parede.cantoSuperiorD);
        // criar parede L7 -> canto esquerdo
        criarParedeHorizontal(47, 47, 16, 4, Parede.cantoInferiorE, Parede.cantoSuperiorE);

        // criar coluna da bandeira ->
        criarParedeHorizontal(48, 48, 14, 7, Parede.paredeBandeira, Parede.topoBandeira);

        // criar parede L8 -> meio
        criarParedeHorizontal(49, 53, 5, 2, Parede.parede, Parede.topo);
        // criar parede L8 -> canto esquerdo
        criarParedeHorizontal(54, 54, 4, 2, Parede.cantoInferiorE, Parede.cantoSuperiorE);

        // criar parede L9 -> lado esquerdo
        criarParedeHorizontal(54, 56, 1, 1, Parede.parede, Parede.topo);
        // criar parede L9 -> lado esquerdo, meio
        criarParedeHorizontal(57, 61, 14, 1, Parede.parede, Parede.topo);
        // criar parede L8 -> lado esquerdo, canto esquerdo
        criarParedeHorizontal(62, 62, 13, 1, Parede.cantoInferiorE, Parede.cantoSuperiorE);

        // criar parede vertical 1 -> topo
        criadorParedesLongas(63, 63, 0, 0, 'd', Parede.topoCantoSuperiorE);
        // criar parede vertical 1 -> meio
        criadorParedesLongas(64, 75, 0, 1, 'd', Parede.topoVertical);

        // criar parede vertical 2 -> topo
        criadorParedesLongas(76, 76, 2, 3, 'd', Parede.topoFimCima);
        // criar parede vertical2 -> meio
        criadorParedesLongas(77, 82, 2, 4, 'd', Parede.topoVertical);

        // criar parede vertical 3 -> topo esquerdo
        criadorParedesLongas(86, 86, 4, 7, 'd', Parede.topoCantoSuperiorE);
        // criar parede vertical 3 -> topo direito
        criadorParedesLongas(87, 87, 4, 0, 'd', Parede.topoCantoSuperiorD);
        // criar parede vertical 3 -> meio
        criadorParedesLongas(87, 88, 4, 8, 'd', Parede.topoVertical);

        // criar parede vertical 4 -> topo direito
        criadorParedesLongas(88, 88, 8, 4, 'd', Parede.topoCantoSuperiorD);
        // criar parede vertical 4 -> meio
        criadorParedesLongas(89, 96, 8, 5, 'd', Parede.topoVertical);

        // criar parede vertical 5 -> meio
        criadorParedesLongas(97, 103, 10, 0, 'd', Parede.topoVertical);

        // criar parede vertical 6 -> topo esquerdo
        criadorParedesLongas(104, 104, 12, 6, 'd', Parede.topoCantoSuperiorE);
        // criar parede vertical 6 -> meio
        criadorParedesLongas(105, 107, 12, 7, 'd', Parede.topoVertical);

        // criar parede vertical 7 -> topo T
        criadorParedesLongas(108, 108, 13, 6, 'd', Parede.topoT);
        // criar parede vertical 7 -> meio
        criadorParedesLongas(109, 111, 13, 7, 'd', Parede.topoVertical);

        // criar parede vertical 8 -> 
        criadorParedesLongas(112, 112, 15, 6, 'd', Parede.topoT);

        // criar parede vertical 9 -> topo esquerdo
        criadorParedesLongas(113, 113, 17, 9, 'd', Parede.topoFimCima);
        // criar parede vertical 9 -> topo esquerdo
        criadorParedesLongas(114, 114, 17, 3, 'd', Parede.topoCantoSuperiorD);
        // criar parede vertical 9 -> meio
        criadorParedesLongas(115, 116, 17, 4, 'd', Parede.topoVertical);

        // criar parede vertical 10 -> 
        criadorParedesLongas(117, 129, 19, 0, 'd', Parede.topoVertical);

    }

    public void act() {
        // Atualiza a posição do jogador projetado de acordo com o jogador real
        if (jogador != null && jogadorProjetado != null) {
            jogadorProjetado.setLocation(jogador.getX(), jogador.getY() - 44);
        }

        // Atualiza a máscara
        if (lanterna != null) {
            lanterna.setLocation(jogador.getX(), jogador.getY() - 36);
        }    
    }

}

