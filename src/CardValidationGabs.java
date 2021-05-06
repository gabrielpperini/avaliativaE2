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

        int soma1 = 0;
        int soma2 = 0;

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
