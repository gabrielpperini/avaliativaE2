import java.util.Scanner;

/**
 * A simple code to print the fibonacci sequence
 * 
 * @author Gabriel Perini and Camila Ilges
 * @package avaliativaE2
 * 
*/
public class Fibonnaci {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int fold1 = 0;
        int fold2 = 1;
        int fnew = fold1 + fold2;

        System.out.println("Digite um número inteiro: ");
        int n = in.nextInt();

        for (int i = 1; i <= n - 1; i++) {
            fold2 = fold1;
            fold1 = fnew;
            fnew = fold1 + fold2;

            if (i == n - 1)
            System.out.println("Na sequência de Fibonacci, o número digitado é: " +fnew);
        }
        

    
    }
}

