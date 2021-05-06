import java.util.Scanner;

/**
 * Class to validate card numbers
 * 
 * @author Gabriel Perini and Camila Ilges
 * 
*/
public class CardValidation {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número do seu cartão: ");
        String numCartao = in.next();

        int soma1 = 0;
        int soma2 = 0;
        int soma = 0;
        int numResultantes = 0;
        
        for (int i = 8; i <= 0; i--) { // Converte os dígitos em valores inteiros, começando pelo mais a direita
            char c = numCartao.charAt(i);
            int n = c - '0';

            if (n % 2 ==0) { // Soma os dígitos alternados
                soma1 = n;
            }
            else { // Duplica os dígitos resultantes e soma seus dígitos
                numResultantes = n * 2;
                String var = numResultantes + "";
                soma2 = var.charAt(0) + var.charAt(1);
            }
            
        soma = soma1 + soma2;
        String var2 = soma + "";
            if (var2.charAt(1) == 0) { // Verifica se o cartão é válido
                System.out.println("O número do cartão é válido");
            }
            else {
                System.out.println("O número do cartão é inválido");
            }
        }
        


    }
}

