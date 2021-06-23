package avaliativa4;
import java.util.Arrays;

public class VetorInt {
    // Atributos
    int tamanho;
    int [] vetor = new int [tamanho];

    // Interface Pública
    public VetorInt() { // inicializa o vetor com 10 posições, todas com o valor 0.
        tamanho = 10;
        for (int i = 0 ; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    }  
    public VetorInt(int n) {  // inicializa o vetor com n posições, todas com o valor 0. n será sempre um valor inteiro positivo.
        tamanho = n;
        for (int i; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    }
    public void insere(int i) { // se ainda houver espaço disponível, insere i na próxima posição disponível do vetor.

    }
    public void remove(int i) { // procura e, caso encontre, remove o valor i do vetor. Os elementos a direita de i no vetor precisarão ser deslocados uma posição à esquerda.
    
    }
    public void imprime() {  // imprime a vetor na tela. Por exemplo, se o vetor tiver os elementos 1, 2 e 3 nesta ordem, este método deve imprimir na tela "{1,2,3}"
    }
    public void adiciona(int i) { // adiciona i a todos os elementos do vetor
    }
    public void multiplica(int i) {  // multiplica todos os elementos do vetor por um fator i
    }
    public int somatorio() {  // calcula o somatório dos elementos
    }
    public int produtorio() {   // calculca o produtório dos elementos
    }   
    public int tamanho() {   // devolve a quantidade de elementos já inseridos
    }
    public int capacidade() { // devolve a capacidade máxima do vetor
    }
    public int acessaInt(int pos) { // devolve o elemento de posição pos no vetor. Se pos for negativo, maior ou igual à capacidade do vetor, então a mensagem de erro "Indíce  inválido" deve ser impressa.
    }

}
