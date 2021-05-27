package src.avaliativa3;
import java.util.Scanner;

public class SenhaForte {
    
    public static boolean validaSenha(String str) {

            System.out.println("Digite sua senha: ");

            if (str.length() < 8) { // Verifica o número de caracteres.
                System.out.println("A senha deve conter 8 caracteres ou mais. Digite nova senha.");  
            }
            String temMaiuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String temMinucula = "abcdefghijklmnopqrstuvwxyz";
            String temDigito = "0123456789";
            boolean resultado;

            for (int i = 0; i <= str.length(); i++){ // Percorre cada caracter da senha.
                while (temMaiuscula.contains(str.charAt(i) + "")) { // Verifica se há letra maiúscula.
                    resultado = false;
                    System.out.println("A senha deve conter, no mínimo, uma letra maiúscula. Digite nova senha.");
                }
            }
            for (int i = 0; i <= str.length(); i++){ // Percorre cada caracter da senha.
                while (str.contains(i) != temMinuscula) { // Verifica se há letra minúscula.
                    resultado = false;
                    System.out.println("A senha deve conter, no mínimo, uma letra minúscula. Digite nova senha.");
                }
            }
            for (int i = 0; i <= str.length(); i++){ // Percorre cada caracter da senha.
                while (str.contains(i) != temDigito) { // Verifica se há dígito.
                    resultado = false;
                    System.out.println("A senha deve conter, no mínimo, um dígito. Digite nova senha.");
                }
            }
            return resultado;
                
            
    }
    public static void main(String[] args) {
        String str = "camila23";
        System.out.println(validaSenha(str));
    }
}
