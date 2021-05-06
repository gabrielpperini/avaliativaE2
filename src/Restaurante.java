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
                System.out.println("\u001b[31mDado incorreto. O grupo digitado tem pessoas demais para entrar/sair. Tente novamente!\u001b[0m");
                System.out.print(" Grupo de quantas pessoas saindo/entrando? ");
                changeCustomers = customersLenght + in.nextInt();
            }
            customersLenght = changeCustomers;
            System.out.println("\u001b[36mO restaurante possui " + customersLenght + " clientes!\u001b[0m\n");
        }
        System.out.print("\u001b[32mLotação máxima de 100 clientes atingida!\u001b[0m");
        in.close();
    }
}
