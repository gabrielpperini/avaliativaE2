package avaliativa3;
import java.util.Scanner;

/**
 * A simple code to tranform a postal code in a bar code
 * 
 * @author Gabriel Perini and Camila Ilges
 * 
 */
public class BarCode {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        // Set the postal code with a scanner
        System.out.print("Digite o código postal desejado: ");
        String postalCode = in.next();
        while (postalCode.length() != 5) {
            System.out.println("ERROR: Código postal inválido!");
            System.out.print("Digite o código postal desejado: ");
            postalCode = in.next();
        }
        imprimeCodigoBarra(postalCode);
    }

    /**
     * Imprime Codigo de Barra Method
     * use to transform a zipCode in a bar Code and print it
     * 
     * @param zipCode
     * 
     */
    public static void imprimeCodigoBarra(String zipCode)
    {
        // print the first bar
        System.out.print("|");

        /////////////////////////////////////
        int soma = 0; // the sum to declare the digito verificador
        
        // tranform each digit in a code part 
        for(int i = 0; i < zipCode.length();i++){
            int num = zipCode.charAt(i) - '0';
            soma += num;

            // print the code
            imprimeDigito(num);
        }

        // set the digito verificador and print it as a code
        int digitoVerificador = 10 - (soma % 10 == 0 ? 10 : soma % 10);
        imprimeDigito(digitoVerificador);

        // print the last bar
        System.out.print("|");
    }

    /**
     * 
     * Imprime Digito Method
     * use to transform a integer in a code part and print it
     * 
     * @param num
     * 
     */
    public static void imprimeDigito(int num)
    {
        num = (num == 0) ? 11 : num; // if the num is zero the two big bars must sum 11
        int[] weights = {7,4,2,1,0}; 
        int[] bigBar = new int[2];

        // set the big bars testing the sum with each one
        for(int one = 0; one < weights.length; one++){
            for(int two = 0; two < weights.length; two++){
                if(two == one) continue;
                if((weights[one] + weights[two]) == num){
                    bigBar[0] = one;
                    bigBar[1] = two;
                    break;
                }
            }
            if((bigBar[0] + bigBar[1]) == num) break;
        }
        
        // start write the code 
        String code = "";
        for(int i = 0; i < weights.length; i++){
            String bar;
            if(bigBar[0] == i || bigBar[1] == i){
                bar = "|";
            }else{
                bar = ":";
            }
            code += bar;
        }

        // print the code
        System.out.print(code);
    }
}
