package avaliativae52;

import java.util.ArrayList;
import java.util.List;

public class CaixaDeEntrada {
    public List<Mensagem> emails;
    private Mensagem emptyMessage;

    public CaixaDeEntrada()
    {
        this.emails = new ArrayList<Mensagem>();
        this.emptyMessage = new Mensagem("", "");
    }

    public void adicionaMensagem(Mensagem m) {
        this.emails.add(m);
    }

    public Mensagem acessaMensagem(int i) {
        try {
            return this.emails.get(i);
        } catch (Exception e) {
            System.out.println("ERROR: Mensagem não encontrada!\n");
            return this.emptyMessage;
        }
    }

    public void removeMessage(int i) {
        try {
            this.emails.remove(i);
            System.out.println("Email removido com sucesso!\n");
        } catch (Exception e) {
            System.out.println("ERROR: Mensagem não existe!");
        }
    }

    public void mailList(){
        for (int index = 0; index < emails.size(); index++) {
            Mensagem mensagem = emails.get(index);
            System.out.println("Email "+index+": ");
            System.out.println("De: " + mensagem.remetente);
            System.out.println("Para: " + mensagem.destinatario + "\n");
        }
    }
}
