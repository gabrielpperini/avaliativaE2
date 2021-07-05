package avaliativae5;

/**
 * Classe que modela uma máquina de vendas automática, capaz de adicionar crédito à máquina, solicitar o reembolso do 
 * crédito existente na máquina, fazer a compra informando o número de latinhas e o número de salgadinhos, acessar o 
 * crédito atual na máquina e acessar a quantidade de itens da máquina.
 * 
 * @author Camila Ilges e Gabriel Perini
 * 
 */
public class MaquinaDeVendas {
    // Atributos
    int credito;
    int lucroTotal;
    int vetor[];

     // Interface Pública
     /**
    * Método construtor que inicializa a máquina com o crédito zerado e cria um vetor com dois valores
    * equivalentes à quantidade de latinhas de refrigerante e de salgadinhso disponíveis na máquina.
    */ 
    public MaquinaDeVendas(int refriDispo, int salgadoDispo){
        credito = 0;
        vetor = new int[2];
        vetor[0] = refriDispo;
        vetor[1] = salgadoDispo;
    }
    /**
     * Método que garante que apenas créditos positivos serão efetuados nas máquinas.
     * @param valorCredito o valor do crédito a ser efetuado
     */
    public void credito(int valorCredito) {
        if (valorCredito > 0) {
            credito = credito + valorCredito;
        }
        else {
            System.out.println("Apenas créditos positivos podem ser efetuados nas máquinas.");
        }
    }
    /**
     * Método que solicita o reembolso de uma quantidade menor ou igual ao crédito atual da máquina.
     * @param valorReembolso
     */
    public void solicitaReembolso(int valorReembolso) {
        if (valorReembolso <= credito) {
            credito = credito - valorReembolso;
            System.out.printf("Efetuado o reembolso de %d unidades de dinheiro.\n", valorReembolso);        }
        else {
            System.out.printf("Crédito atual de %d é menor que o reembolso solicitado de %d.\n", credito, valorReembolso);
        }
    }
    /**
     * Método que realiza uma compra na máquina, somente se houver uma quantidade positiva de latinhas de refrigerantes e de salgadinhos, se o
     * crédito atual na máquina for maior ou igual ao valor da compra e se o número de latinhas de refrigentes e de salgadinhos for menos ou igual 
     * à quantidade disponível na máquina.
     * @param latinhas
     * @param salgadinhos
     */
    public void compra(int latinhas, int salgadinhos) {
        int valorCompra = latinhas * 3 + salgadinhos * 2;
        if (latinhas > 0 && salgadinhos > 0) {
            if (credito >= valorCompra) {
                if (vetor[0] >= latinhas && vetor[1] >= salgadinhos) {
                    vetor[0] = vetor[0] - latinhas;
                    vetor[1] = vetor[1] - salgadinhos;
                    credito = credito - valorCompra;
                    System.out.println("Compra efetivada. Por favor, recolha os itens da gaveta. Obrigado.");
                }
                else {
                    System.out.println("ERRO: A compra solicitada exige uma quantidade maior de latinhas e/ou salgadinhos que a disponível.");
                }
            }
            else {
                System.out.printf("Saldo insuficiente. Valor da compra: %d. Crédito atual: %d.\n", valorCompra, credito);
            }
        }
    }
    /**
     * Método que acessa o valor do crédito atual.
     * 
     */
    public void acessaCredito() {
        System.out.printf("Crédito atual: %d.\n", credito);
    }
    /**
     * Método que acessa a quantidade de cada item disponível.
     * 
     */
    public void acessaItens() {
        System.out.printf("%d latas e %d salgadinhos disponíveis na máquina.\n", vetor[0], vetor[1]);
    }
    public static void main(String[] args) {
        MaquinaDeVendas m1 = new MaquinaDeVendas(10, 15);
        m1.acessaItens();
        m1.acessaCredito();
        m1.solicitaReembolso(5);
        m1.compra(1,2);
        m1.credito(10);
        m1.acessaCredito();
        m1.compra(1,2);
        m1.acessaCredito();
        m1.compra(4,0);
        m1.solicitaReembolso(3);
        m1.acessaItens();
    }
}