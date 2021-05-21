package trabalhoIsa;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class testeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        String first8 = random.ints(10000000,(100000000 - 1)).findFirst().getAsInt() + "";
        String t = random.ints(100,(1000 - 1)).findFirst().getAsInt() + "";
        System.out.println(first8 + t);


        List<Pessoa> arrayTeste = new ArrayList<Pessoa>();

        while (in.nextInt() == 1) {
            System.out.println("nome?");
            String nome = in.next();
            System.out.println("email?");
            String email = in.next();
            Pessoa novoTeste = new Pessoa(nome,email);
            arrayTeste.add(novoTeste);
        }

        for(int i = 0 ; i < arrayTeste.size(); i++){
            arrayTeste.get(i).showData();
        }
    }
}
