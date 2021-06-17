package avaliativa4;

public class TestaAvaliaDesempenhoFisico {
    
    public static void main(String[] args) {
        AvaliaDesempenhoFisico p = new AvaliaDesempenhoFisico();

        p.contaBurpee();
        p.contaBurpee();
        p.contaBurpee();
        p.contaFlexoes();
        p.contaFlexoes();
        p.contaFlexoes();
        p.contaFlexoes();
        p.contaFlexoes();
        p.contaFlexoes();
        p.contaAbdominais();
        p.contaAbdominais();
        p.contaAbdominais();
        p.contaAbdominais();
        p.contaAbdominais();
        
        System.out.println("O seu desempenho é: " + p.retornaDesempenho());
    }
}
