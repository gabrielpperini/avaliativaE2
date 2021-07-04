package avaliativae52;

import java.util.ArrayList;
import java.util.List;

/**
 * Create and manage a Caixa De Entrada
 * 
 * @author Gabriel Perini and Camila Ilges
 */
public class CaixaDeEntrada {
    public List<Mensagem> emails;
    private Mensagem emptyMessage;

    /**
     * Create a Caixa de Entrada
     */
    public CaixaDeEntrada() {
        this.emails = new ArrayList<Mensagem>();
        this.emptyMessage = new Mensagem("", "");
    }

    /**
     * Add a message to emails
     * 
     * @param m
     * @return
     */
    public void adicionaMensagem(Mensagem m) {
        this.emails.add(m);
    }

    /**
     * Access a Mensagem in emails list
     * 
     * @param i
     * @return Mensagem
     */
    public Mensagem acessaMensagem(int i) {
        try {
            return this.emails.get(i);
        } catch (Exception e) {
            System.out.println("ERROR: Mensagem não encontrada!\n");
            return this.emptyMessage;
        }
    }

    /**
     * Remove an Mensagem from emails list
     * 
     * @param i
     * @return
     */
    public void removeMessage(int i) {
        try {
            this.emails.remove(i);
            System.out.println("Email removido com sucesso!\n");
        } catch (Exception e) {
            System.out.println("ERROR: Mensagem não existe!");
        }
    }

    /**
     * List Mensagens with respectives indexes
     * 
     * @return
     */
    public void mailList() {
        for (int index = 0; index < emails.size(); index++) {
            Mensagem mensagem = emails.get(index);
            System.out.println("Email " + index + ": ");
            System.out.println("De: " + mensagem.remetente);
            System.out.println("Para: " + mensagem.destinatario + "\n");
        }
    }
}
