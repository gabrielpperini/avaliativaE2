package avaliativae2;
import java.util.Scanner;

/**
 * A simple customers counter to a restaurant
 * 
 * @author Gabriel Perini and Camila Ilges
 * 
*/
public class Restaurante {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int customersLimit = 100;
        int customersLenght = 0;

        while(customersLenght < customersLimit){
            System.out.print("Grupo de quantas pessoas saindo/entrando? ");
            int changeCustomers = (in.nextInt()) + customersLenght;
            while (changeCustomers < 0 || changeCustomers > 100) {
                System.out.println("Dado incorreto. O grupo digitado tem pessoas demais para entrar/sair. Tente novamente!");
                System.out.print("Grupo de quantas pessoas saindo/entrando? ");
                changeCustomers = customersLenght + in.nextInt();
            }
            customersLenght = changeCustomers;
            System.out.println("O restaurante possui " + customersLenght + " clientes!\n");
        }
        System.out.print("Lotação máxima de 100 clientes atingida!");
        in.close();
    }
}
