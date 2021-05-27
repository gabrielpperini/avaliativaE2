package src.avaliativa3;
import java.util.Scanner;

public class SenhaForte {
    
    public static boolean validaSenha(String str) {

            System.out.println("Digite sua senha: ");

            if (str.length() < 8) { // Verifica o número de caracteres
                System.out.println("A senha deve conter 8 caracteres ou mais. Digite nova senha.");  
            }
            boolean resultado;
            for (int i = 0; i <= str.length(); i++){ // Percorre a senha
                while (str.charAt(i) != "A" && "B" && "C" && "D" && "E") { // Verifica se há letra maiúscula
                    resultado = false;
                }
                if (resultado = false) {
                    System.out.println("A senha deve conter, no mínimo, um dígito. Digite nova senha.");
                }
                else {
                    while (str.charAt(i) != "a" && "b" && "c" && "d" && "e") { // Verifica se há letra minúscula
                        resultado = false;
                    }
                    if (resultado = false) {
                    System.out.println("A senha deve conter, no mínimo, um dígito. Digite nova senha.");
                    }
                    else {
                        while (str.charAt(i) != "0" && "1" && "2" && "3" && "4" && "5" && "6" && "7" && "8" && "9") { // Verifica se há dígito
                            resultado = false;
                        }
                        if (resultado = false) {
                            System.out.println("A senha deve conter, no mínimo, um dígito. Digite nova senha.");
                            resultado = false;
                        }
                        else {
                            resultado = true;
                        }
                        return resultado;
                    }
                }
            }
    public static void main(String[] args) {
        String str = "12345678e";
        System.out.println(validaSenha(str));
    }
}
