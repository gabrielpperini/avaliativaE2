import java.util.Scanner;

/**
 * Class to validate card numbers
 * 
 * @author Gabriel Perini and Camila Ilges
 * 
*/
public class CardValidationGabs {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número do seu cartão: ");
        String numCartao = in.next();
        System.out.println(numCartao);

        int tamanho = numCartao.length();
        while (tamanho != 8) { // Verifica se o número contém 8 dígitos
            System.out.println("ERROR: número deve conter 8 dígitos.");
            System.out.println("Digite o número do seu cartão novamente: ");
            numCartao = in.next();
            tamanho = numCartao.length();
        }

        int soma1 = 0;
        int soma2 = 0;

    
        for (int i = 7; i >= 0; i--) { // Converte os dígitos em valores inteiros, começando pelo mais a direita
            char c = numCartao.charAt(i);
            int n = c - '0';

            if (i % 2 == 0) {// Duplica os dígitos restantes e soma seus dígitos
                int numRestantes = n * 2;
                if(numRestantes < 10){
                    soma2 += numRestantes;
                }else{
                    int alg1 =  numRestantes / 10;
                    int alg2 = numRestantes % 10; 
                    soma2 += alg1 + alg2;
                }
            }
            else {// Soma os dígitos alternados
                soma1 += n;
            }
            
        }
        int soma = soma1 + soma2;
        System.out.println(soma2);
        System.out.println(soma);
        if (soma % 10 == 0) { // Verifica se o cartão é válido
            System.out.println("O número do cartão é válido");
        }
        else {
            System.out.println("O número do cartão é inválido");
        }

    }
}
