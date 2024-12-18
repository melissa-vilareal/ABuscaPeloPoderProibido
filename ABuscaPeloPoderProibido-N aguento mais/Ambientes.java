import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Essa é a superclasse Ambiente, que conterá todos os ambientes do jogo. 
 * Ela possui os metodos que configuram as paredes nos mapas.
 * Futuramente possuirá quaisquer outros métodos necessários em todas as salas do jogo.
 * 
 * @author Melissa de Carvalho V. Real, Maria Luiza Madeira e Guilherme Alexandre Cunha SIlva 
 * @version V1
 */

public class Ambientes extends World {
    protected ArrayList<Parede> paredes; // Lista para armazenar as paredes
    private GreenfootImage lightMask;

    public Ambientes(int width, int height, int cellSize) {
        super(width, height, cellSize);
        paredes = new ArrayList<>(); // Inicializa o ArrayList
        //Greenfoot.setWorld(new TelaInicial());
    }

    public void criadorParedesLongas(int objetoInicial, int objetoFinal, int xInicial, int yInicial, char direcaoParaParedeIr, GreenfootImage imagem) {
        // Converter coordenadas de blocos para pixels
        int xAtual = xInicial * 48; // Multiplicar pelo tamanho do bloco
        int yAtual = yInicial * 48;

        while (objetoInicial <= objetoFinal) {
            // Cria uma nova parede com a imagem especificada
            Parede parede = new Parede(objetoInicial, imagem);

            // Adiciona a parede ao ArrayList
            paredes.add(parede);

            // Adiciona a parede ao mundo (ajustado para alinhar corretamente o centro)
            addObject(parede, xAtual + 24, yAtual + 24); // Center offset

            // Atualiza as coordenadas com base na direção (em pixels)
            if (direcaoParaParedeIr == 'd') { // Para baixo
                yAtual += 48; // Move 1 bloco (48 pixels)
            } else if (direcaoParaParedeIr == 'u') { // Para cima
                yAtual -= 48;
            } else if (direcaoParaParedeIr == 'r') { // Para a direita
                xAtual += 48;
            } else if (direcaoParaParedeIr == 'l') { // Para a esquerda
                xAtual -= 48;
            }

            // Incrementa o índice do objeto
            objetoInicial++;
        }
    }

    public void criarParedeHorizontal(int objetoInicial, int objetoFinal, int xInicial, int yInicial, GreenfootImage imagemBase, GreenfootImage imagemTopo) {
        // Criar a parte de baixo
        criadorParedesLongas(objetoInicial, objetoFinal, xInicial, yInicial, 'r', imagemBase);

        // Criar a parte de cima com deslocamento vertical
        criadorParedesLongas(objetoInicial, objetoFinal, xInicial, yInicial - 1, 'r', imagemTopo);
    }
}

