package avaliativae52;

/**
 * Create and manage a Mensagem
 * 
 * @author Gabriel Perini and Camila Ilges
 */
public class Mensagem {

    public String destinatario;
    public String remetente;
    public String mensagem;

    /**
     * Create a Mensagem
     * 
     * @param destinatario
     * @param remetente
     */
    public Mensagem(String destinatario, String remetente) {
        this.destinatario = destinatario;
        this.remetente = remetente;
        this.mensagem = "";
    }

    
    /** 
     * Write a line in mensagem
     * @param line
     */
    public void writeLine(String line) {
        this.mensagem += "\n" + line;
    }

    
    /** 
     * Return a Mensagem to print
     * @return String
     */
    public String toString() {
        String mensagemAsString = "";
        if(!this.mensagem.equals("")){
            mensagemAsString += "De: " + this.remetente + "\n";
            mensagemAsString += "Para: " + this.destinatario + "\n";
            mensagemAsString += this.mensagem;
        }
        return mensagemAsString;
    }
}
