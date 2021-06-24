package avaliativa4;
import java.util.Arrays;

public class VetorInt {
    // Vetor de Inteiros
    int vetor[];

    // Interface Pública
    public VetorInt() { // inicializa o vetor com 10 posições, todas com o valor 0.
        //tamanho = 10;
        vetor = new int[10];
        for (int i = 0 ; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    } 
    public VetorInt(int n) {  // inicializa o vetor com n posições, todas com o valor 0. n será sempre um valor inteiro positivo.
        //tamanho = n;
        vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    }
    
    public void insere(int i) { // se ainda houver espaço disponível, insere i na próxima posição disponível do vetor.
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == 0) {
                vetor[j] = i;
                break;
            }
        }
    }
    public void remove(int i) { // procura e, caso encontre, remove o valor i do vetor. Os elementos a direita de i no vetor precisarão ser deslocados uma posição à esquerda.
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

    public void imprime() {  // imprime a vetor na tela. Por exemplo, se o vetor tiver os elementos 1, 2 e 3 nesta ordem, este método deve imprimir na tela "{1,2,3}"
        String[] numberAsStrings = new String[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            numberAsStrings[i] = vetor[i] + "";
        }
        String numbers = String.join(",", Arrays.asList(numberAsStrings));
        System.out.println("{"+numbers+"}");
    }
    public void adiciona(int i) { // adiciona i a todos os elementos do vetor
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] += i;
        }
    }
    public void multiplica(int i) {  // multiplica todos os elementos do vetor por um fator i
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = vetor[j] * i;
        }
    }
    public int somatorio() {  // calcula o somatório dos elementos
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma +=vetor[i];
        }
        return soma;
    }
    public int produtorio() {   // calculca o produtório dos elementos
        int produto = 1;
        for (int i = 0; i < vetor.length; i++) {
            produto *= vetor[i];
        }
        return produto;
    }   
    public int tamanho() {   // devolve a quantidade de elementos já inseridos
        int elementos = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                elementos++;
            }
        }
        return elementos;
    }
    public int capacidade() { // devolve a capacidade máxima do vetor
        return vetor.length;
    }
    public int acessaInt(int pos) { // devolve o elemento de posição pos no vetor. Se pos for negativo, maior ou igual à capacidade do vetor, então a mensagem de erro "Indíce  inválido" deve ser impressa.
        if (pos < 0 || pos >= vetor.length) {
            System.out.println("Indíce inválido");
            return 0;
        }else{
            return vetor[pos];
        }
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
        v1.imprime();
        v1.remove(5);
        v1.adiciona(1);
        v1.multiplica(2);
        v1.imprime();
    }
}

