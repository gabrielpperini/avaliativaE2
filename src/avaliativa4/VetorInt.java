package avaliativa4;
import java.util.Arrays;

/**
 * 
 * Classe que modela um vetor de inteiros, capaz de remover um elemento 
 * do vetor, inserir um elemento, imprimir o vetor, adicionar um valor a
 * todos os elementos, multiplicar todos os elementos por um valor, calcular
 * o somatório e o produtório dos elementos, devolver a quantidade de elementos
 * já inseridos, acessar a capacidade máxima do vetor e acessar o elemento de
 * uma certa posição.
 * 
 * 
 * @author Camila Ilges e Gabriel Perini
 */
public class VetorInt {
    // Atributos
    int vetor[];

    // Interface Pública
    /**
    * Método construtor que inicializa o vetor com 10 posições, todas com o valor 0.
    */ 
    public VetorInt() {
        vetor = new int[10];
        for (int i = 0 ; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    }
    /**
    * Método construtor que inicializa o vetor com n posições, todas com o valor 0.
    * @param n o número de posições que o vetor terá
    */ 
    public VetorInt(int n) {
        vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    }
    /**
    * Método que insere i na próxima posição disponível do vetor.
    * @param i o valor que será inserido no vetor
    */ 
    public void insere(int i) {
        valor = i;
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == 0) {
                vetor[j] = i;
                break;
            }
            else {
                System.out.println("Capacidade máxima atingida.");
            }
        }
    }
    /**
    * Método que remove o valor i do vetor, caso houver, e desloca os elementos a direita de i uma posição à esquerda.
    * @param i o valor que será removido do vetor
    */ 
    public void remove(int i) {
        int[] anotherArray = new int[vetor.length];
        boolean inFirst = true;
        for (int j = 0, k = 0; j < vetor.length; j++) {
            if (vetor[j] == i && inFirst) {
                inFirst = false;
                continue;
            }
            anotherArray[k++] = vetor[j];
        }
        this.vetor = anotherArray;
        
    }
    /**
    * Método que imprime o vetor na tela.
    */ 
    public void imprime() {
        String[] numberAsStrings = new String[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            numberAsStrings[i] = vetor[i] + "";
        }
        String numbers = String.join(",", Arrays.asList(numberAsStrings));
        System.out.println("{"+numbers+"}");
    }
    /**
    * Método que adiciona i a todos os elementos do vetor.
    * @param i o valor que será adicionado a cada elemento do vetor.
    */ 
    public void adiciona(int i) {
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = vetor[j] + i;
        }
    }
    /**
    * Método que multiplica todos os elementos do vetor por um fator i.
    * @param  i o valor pelo qual cada elemento do vetor será multiplicado.
    */ 
    public void multiplica(int i) {
        valor = i;
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = vetor[j] * i;
        }
    }
    /**
    * Método que calcula o somatório dos elementos.
    * @return o somatório dos elementos
    */ 
    public int somatorio() { 
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        return soma;
    }
    /**
    * Método para calcula o produtório dos elementos.
    * @return o produtório dos elementos
    */ 
    public int produtorio() { 
        int produto = 1;
        for (int i = 0; i < vetor.length; i++) {
            produto = produto * vetor[i];
        }
        return produto;
    }
    /**
    * Método que devolve a quantidade de elementos já inseridos
    * @return quantidade de elementos já inseridos
    */ 
    public int tamanho() {
        int elementos = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                elementos = elementos + 1;
            }
        }
        return elementos;
    }
    /**
    * Método que devolve a capacidade máxima do vetor.
    * @return a capacidade máxima do vetor
    */ 
    public int capacidade() {
        int capacidadeMax = 0;
        for (int i = 0; i < vetor.length; i++) {
            capacidadeMax = capacidadeMax + 1;
        }
        return capacidadeMax;
    }
    /**
    * Método que devolve o elemento de posição pos no vetor. Se pos for negativo, maior ou igual à capacidade do vetor, então a mensagem de erro "Indíce  inválido" é impressa.
    * @param  pos a posição do elemento
    * @return o elemento de posição pos
    */ 
    public int acessaInt(int pos) { 
        if (pos < 0 || pos >= capacidadeMax) {
            System.out.println("Indíce inválido");
        }
        return vetor[pos];
    }
    public static void main(String[] args) {
        VetorInt v1 = new VetorInt(10);
        v1.insere(3);
        v1.insere(5);
        v1.insere(8);
        v1.insere(7);
        v1.insere(1);
        System.out.println("O tamanho é " + v1.tamanho());
        System.out.println("A capacidade é " + v1.capacidade());
        System.out.println("O somatório é " + v1.somatorio());
        System.out.println("O produtório é " + v1.produtorio());
        v1.imprime();
        //v1.remove(5);
        v1.adiciona(1);
        //v1.multiplica(2);
        v1.imprime();
        System.out.println("O elemento é " + v1.acessaInt(2));
        
        


    }
}

