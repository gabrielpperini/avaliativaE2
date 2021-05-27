package src.avaliativa3;
import java.util.Scanner;

public class TentativaCams1 {

    public static void imprimeDigito(int d) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu cógido postal de 5 dígitos: ");
        String zipCode = in.next();

        int soma = 0;
        for (int i = 0; i <= 5; i++) {
            soma = soma + zipCode.length(i);
        }
        // some todos os dígitos de código postal e escolha um dígito para que a soma complete um valor múltiplo de 10. 

    }


    public static void imprimeCodigoBarra(int zipCode) { // Imprime o código de barras.
       
       // duas barras altas no inicio e final
    }

    public static void main (String[] args) {

    }
}



package src.avaliativa3;
import java.util.Scanner;

public class SenhaForte {
    
    public static boolean validaSenha(String str) {
            Scanner in = new Scanner(System.in);

            System.out.println("Digite sua senha: ");
            String str = in.next();

            if (str.length() < 8) { // Verifica o número de caracteres
                System.out.println("A senha deve conter 8 caracteres ou mais. Digite nova senha: ");
                String str = in.next();
            }
            for (int i = 0; i <= str.length(); i++){ // Percorre a senha
                if (str.charAt(i) ==) { // Verifica se há letra maiúscula e minúscula

                }
                boolean = resultado;
                if (in.hasNextInt()) { // Verifica se há dígito
                    resultado = true;
                }
                else {
                    System.out.println("A senha deve conter, no mínimo, um dígito. Digite nova senha: ");
                    String str = in.next();
                }
            }
    }
    public static void main(String[] args) {
        System.out.println(validaSenha());
    }
}

