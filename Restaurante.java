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
            System.out.print("Algum cliente saiu? ");
            int leftCustomers = in.nextInt();
            while (leftCustomers > customersLenght) {
                System.out.println("Dado incorreto! O restaurante não possui essa quantidade de clientes, tente novamente!");
                System.out.print("Algum cliente saiu? ");
                leftCustomers = in.nextInt();
            }
            customersLenght = customersLenght - leftCustomers;
            System.out.println("O restaurante possui " + customersLenght + " clientes!");
            System.out.print("Próximo grupo da fila possui quantas pessoas? ");
            int nextGroup = in.nextInt();
            if((customersLenght + nextGroup) > 100){
                System.out.println("O grupo ainda não pode entrar!");
            }else{
                System.out.println("O grupo já pode entrar!");
                customersLenght += nextGroup; 
            }
            System.out.println("O restaurante possui " + customersLenght + " clientes!\n");
        }
        System.out.print("Lotação máxima de 100 clientes atingida!");
    }
}
