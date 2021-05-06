import java.util.Scanner;

/**
 * Class to validate card numbers
 * 
 * @author Gabriel Perini and Camila Ilges
 * 
 */
public class CardValidation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número do seu cartão: ");
        String numCartao = in.next();

        int soma1 = 0;
        int soma2 = 0;
        int soma = 0;

        for (int i = 7; i >= 0; i--) { // Converte os dígitos em valores inteiros, começando pelo mais a direita
            char c = numCartao.charAt(i);
            int n = c - '0';

            if (i % 2 == 0) {// Duplica os dígitos resultantes e soma seus dígitos
                int numResultantes = n * 2;
                if(numResultantes < 10){
                    soma2 += numResultantes;
                }else{
                    int alg1 =  numResultantes / 10;
                    int alg2 = numResultantes % 10; 
                    soma2 += alg1 + alg2;
                }
            } else {// Soma os dígitos alternados
                soma1 += n;
            }
        }

        soma = soma1 + soma2;
        int resto = soma % 10;
        if (resto == 0) { // Verifica se o cartão é válido
            System.out.println("O número do cartão é válido");
        } else {
            System.out.println("O número do cartão é inválido");
            System.out.println("O digito verificador é: " + (10 - resto));
        }
        
    }
}
