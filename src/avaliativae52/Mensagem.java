package avaliativae52;

public class Mensagem {

    public String destinatario;
    public String remetente;
    public String mensagem;

    public Mensagem(String destinatario, String remetente)
    {
        this.destinatario = destinatario;
        this.remetente = remetente;
        this.mensagem = "";
    }

    public void writeLine(String line)
    {
        this.mensagem += "\n" + line;
    }

    public String toString()
    {
        String mensagemAsString = "De: " + this.remetente + "\n"; 
        mensagemAsString += "Para: " + this.destinatario + "\n";
        return mensagemAsString + this.mensagem;
    }
}
