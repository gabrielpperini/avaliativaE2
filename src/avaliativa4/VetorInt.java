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
    int valor;
    int soma;
    int produto;
    int elementos;
    int capacidadeMax;

    // Interface Pública
    /**
    * Método construtor para
    * 
    */ 
    public VetorInt() { // inicializa o vetor com 10 posições, todas com o valor 0.
        vetor = new int[10];
        for (int i = 0 ; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    }
    /**
    * Método construtor para
    * @param n
    */ 
    public VetorInt(int n) {  // inicializa o vetor com n posições, todas com o valor 0. n será sempre um valor inteiro positivo.
        vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    }
    /**
    * Método para
    * @param  
    * @return
    */ 
    public void insere(int i) { // se ainda houver espaço disponível, insere i na próxima posição disponível do vetor.
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
    * Método para
    * @param  
    * @return
    */ 
    public void remove(int i) { // procura e, caso encontre, remove o valor i do vetor. Os elementos a direita de i no vetor precisarão ser deslocados uma posição à esquerda.
        valor = i;
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == i) {
                vetor[j] = 0;
                continue;
            }
            if (j > i) {
                vetor[j - 1] = vetor[j];
            }
        }
        
    }
    /**
    * Método para
    * @param  
    * @return
    */ 
    public void imprime() {  // imprime a vetor na tela. Por exemplo, se o vetor tiver os elementos 1, 2 e 3 nesta ordem, este método deve imprimir na tela "{1,2,3}"
        System.out.print("{");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d, ", vetor[i]); // virgula?
        }
        System.out.print("}");
    }
    /**
    * Método para
    * @param  
    * @return
    */ 
    public void adiciona(int i) { // adiciona i a todos os elementos do vetor
        valor = i;
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = vetor[j] + i;
        }
    }
    /**
    * Método para
    * @param  
    * @return
    */ 
    public void multiplica(int i) {  // multiplica todos os elementos do vetor por um fator i
        valor = i;
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = vetor[j] * i;
        }
    }
    /**
    * Método para
    * @param  
    * @return
    */ 
    public int somatorio() {  // calcula o somatório dos elementos
        soma = 0;
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
        produto = 1;
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
        elementos = 0;
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
        capacidadeMax = 0;
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

