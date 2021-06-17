package avaliativa4;

// Esta classe avalia o desempenho físico de alguém, com base na sua performance durante uma
// série de 3 exercícios, considerando a sua altura e peso.

public class AvaliaDesempenhoFisico {
    // Variáveis de Instância
    // private int idade;
    // private int peso;
    private int burpee;
    private int flexao;
    private int abdominal;
    
    // Construtores
    /**
        Construtor que inicializa a avaliação com 0 exercícios de cada série.
    */
    public AvaliaDesempenhoFisico() {
        burpee = 0;
        flexao = 0;
        abdominal = 0;

    }
    /**
        Construtor que inicializa a avaliação com a idade e o peso passados como
        parâmetros.
        @param anos valor que deve ser usado como a idade da pessoa para a avaliação.
        @param kilos valor que deve ser usado como o peso da pessoa para a avaliação.
    */
    // public AvaliaDesempenhoFisico (int anos, int kilos){
    //    idade = anos;
    //    peso = kilos;
    //}

    // Interface Pública...
    /**
        Incrementa o contador de burpees em uma unidade.
    */
    public void contaBurpee() {
        burpee = burpee + 1;
    }
    /**
        Incrementa o contador de flexões em uma unidade.
    */
    public void contaFlexoes() {
        flexao = flexao + 1;
    }
    /**
        Incrementa o contador de abdominais em uma unidade.
    */
    public void contaAbdominais() {
        abdominal = abdominal + 1;
    }
    public String retornaDesempenho() {
        if (burpee <= 8 || flexao <= 8 || abdominal <= 8) {
            return "iniciante";
        }
        else if (burpee > 15 || flexao > 15 || abdominal > 15) {
            return "avançado";
        }
        else {
            return "moderado";
        }
    }
}
