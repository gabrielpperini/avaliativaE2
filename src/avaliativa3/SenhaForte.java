package avaliativa3;

import java.util.Scanner;

/**
 * Class to validate a password
 * 
 * @author Gabriel Perini and Camila Ilges
 * 
 */
public class SenhaForte {

    /**
     * Testes: Hello123 ==> true 12345678 ==> false hello ==> false HELLO123 ==>
     * false hello123 ==> false
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String pass = in.next();
        while (!validaSenha(pass)) {
            System.out.print("\nDigite uma nova senha: ");
            pass = in.next();
        }
        System.out.println("Senha aceita!");
        in.close();
    }

    /**
     * Valida Senha
     * 
     * @param password | Sua senha
     * @return boolean
     */
    public static boolean validaSenha(String password) {

        if (password.length() < 8) { // Verifica o número de caracteres.
            System.out.println("A senha deve conter 8 caracteres ou mais. Digite nova senha.");
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) { // Percorre cada caracter da senha.
            char step = password.charAt(i);
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

        if (!hasUpper) {
            System.out.println("A senha deve conter pelo menos uma letra maiúscula!");
        }
        if (!hasLower) {
            System.out.println("A senha deve conter pelo menos uma letra minúscula!");
        }
        if (!hasDigit) {
            System.out.println("A senha deve conter pelo menos um dígito!");
        }

        return (hasUpper && hasLower && hasDigit);

    }
}