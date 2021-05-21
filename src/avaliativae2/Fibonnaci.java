package avaliativae2;
import java.util.Scanner;

/**
 * A simple code to print the fibonacci sequence
 * 
 * @author Gabriel Perini and Camila Ilges
 * 
 */
public class Fibonnaci {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int fold1 = 0;
        int fold2 = 1;
        int fnew = 0;

        System.out.print("Digite um número inteiro positivo: ");
        int n = in.nextInt();
        while(n < 0){
            System.out.println("ERROR: número não positivo.");
            System.out.print("Digite um número inteiro positivo: ");
            n = in.nextInt();
        }

        if(n <= 1){
            fnew = n;
        }else{
            for (int i = 1; i < n; i++) {
                fnew = fold1 + fold2;
                fold1 = fold2;
                fold2 = fnew;
            }
        }

        System.out.println("Na sequência de Fibonacci, o número digitado é: " + fnew);

        in.close();
    }
}
