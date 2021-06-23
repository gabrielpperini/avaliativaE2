package avaliativa4;
import java.util.Arrays;

public class VetorInt {
    // Atributos
    int tamanho;
    int [] vetor = new int[tamanho];
    int valor;
    int soma;
    int produto;
    int elementos;
    int capacidadeMax;
    int posicao;

    // Interface Pública
    public VetorInt() { // inicializa o vetor com 10 posições, todas com o valor 0.
        tamanho = 10;
        for (int i = 0 ; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    } 
    public VetorInt(int n) {  // inicializa o vetor com n posições, todas com o valor 0. n será sempre um valor inteiro positivo.
        tamanho = n;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    }
    
    public void insere(int i) { // se ainda houver espaço disponível, insere i na próxima posição disponível do vetor.
        valor = i;
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == 0) {
                vetor[j] = i;
            }
        }
    }
    public void remove(int i) { // procura e, caso encontre, remove o valor i do vetor. Os elementos a direita de i no vetor precisarão ser deslocados uma posição à esquerda.
        valor = i;
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == i) {
                vetor[j] = 0;
                while (j < vetor.length) {
                    vetor[j + 1] = vetor[j];
                }
            //    continue;
            }
            // if (j > i) {
            //     vetor[j - 1] = vetor[j];
            // }
        }
        
    }
    public void imprime() {  // imprime a vetor na tela. Por exemplo, se o vetor tiver os elementos 1, 2 e 3 nesta ordem, este método deve imprimir na tela "{1,2,3}"
        System.out.print("{");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d, ", vetor[i]); // virgula?
        }
        System.out.print("}");
    }
    public void adiciona(int i) { // adiciona i a todos os elementos do vetor
        valor = i;
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = i;
        }
    }
    public void multiplica(int i) {  // multiplica todos os elementos do vetor por um fator i
        valor = i;
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = vetor[j] * i;
        }
    }
    public int somatorio() {  // calcula o somatório dos elementos
        soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        return soma;
    }
    public int produtorio() {   // calculca o produtório dos elementos
        produto = 1;
        for (int i = 0; i < vetor.length; i++) {
            produto = produto * vetor[i];
        }
        return produto;
    }   
    public int tamanho() {   // devolve a quantidade de elementos já inseridos
        elementos = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                elementos = elementos + 1;
            }
        }
        return elementos;
    }
    public int capacidade() { // devolve a capacidade máxima do vetor
        capacidadeMax = 0;
        for (int i = 0; i < vetor.length; i++) {
            capacidadeMax = capacidadeMax + 1;
        }
        return capacidadeMax;
    }
    public int acessaInt(int pos) { // devolve o elemento de posição pos no vetor. Se pos for negativo, maior ou igual à capacidade do vetor, então a mensagem de erro "Indíce  inválido" deve ser impressa.
        posicao = pos;
        if (pos < 0 || pos >= capacidadeMax) {
            System.out.println("Indíce inválido");
        }
        return vetor[pos + 1];
    }
    public static void main(String[] args) {
        VetorInt v1 = new VetorInt();
        v1.insere(3);
        v1.insere(5);
        v1.insere(8);
        v1.insere(7);
        v1.insere(1);
        v1.tamanho();
    }
}

