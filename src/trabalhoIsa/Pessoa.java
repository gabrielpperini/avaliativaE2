package trabalhoIsa;
public class Pessoa {
    private String nome;
    private String email;

    public Pessoa (String nome,String email){
        setNome(nome);
        setEmail(email);
    }
    
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void showData() {
        
    }
}
