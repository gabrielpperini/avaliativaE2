package avaliativaE2;
import java.util.Scanner;

/**
 * A simple customers counter to a restaurant
 * 
 * @author Gabriel Perini and Camila Ilges
 * @package avaliativaE2
 * 
*/
public class Restaurante {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int customersLimit = 100;
        int customersLenght = 0;

        while(customersLenght < customersLimit){
            System.out.print("Algum Grupo saindo/entrando? ");
            int changeCustomers = (in.nextInt()) + customersLenght;
            while (changeCustomers < 0 || changeCustomers > 100) {
                System.out.println("\u001b[31mDado incorreto. O grupo é tem pessoas demais para entrar/sair. tente novamente!\u001b[0m");
                System.out.print("Algum Grupo saindo/entrando? ");
                changeCustomers = customersLenght + in.nextInt();
            }
            customersLenght = changeCustomers;
            System.out.println("\u001b[36mO restaurante possui " + customersLenght + " clientes!\u001b[0m\n");
        }
        System.out.print("\u001b[32mLotação máxima de 100 clientes atingida!\u001b[0m");
        in.close();
    }
}
