package src.avaliativa3;
import java.util.Scanner;

public class SenhaForte {

    /**
     * Testes:
     * 12345678 ==> false
     * Hello123 ==> true
     * hello ==> false
     * HELLO123 ==> false
     * hello123 ==> false
     * @param args
     */
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua senha: "); 
        String pass = in.next();
        while(!validaSenha(pass)){
            System.out.print("\nDigite uma nova senha: "); 
            pass = in.next();
        }
        System.out.println("Senha aceita!"); 
        in.close();
    }
    
    public static boolean validaSenha(String str) {

            if (str.length() < 8) { // Verifica o número de caracteres.
                System.out.println("A senha deve conter 8 caracteres ou mais. Digite nova senha.");
                return false;
            }

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;

            for (int i = 0; i < str.length(); i++) { // Percorre cada caracter da senha.
                char step = str.charAt(i);
                if (Character.isUpperCase(step)) {
                    hasUpper = true;
                }
                if (Character.isLowerCase(step)) {
                    hasLower = true;
                }       
                if (Character.isDigit(step)) {
                    hasDigit = true;
                }
            }
            return (hasUpper && hasLower && hasDigit);
            
    }
}