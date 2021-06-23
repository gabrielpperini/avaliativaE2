package avaliativa4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class StartTreino {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        clearScreen();
        Scanner terminal = new Scanner(System.in);
        System.out.println("Olá bem-vindo a academia FitSpace\n");
        Thread.sleep(2000);
        System.out.println("Escolha alguma opção: ");
        System.out.println("1 - Treino Iniciante");
        System.out.println("2 - Treino Intermediário");
        System.out.println("3 - Treino Avançado");
        System.out.println("4 - Treino Customizado");

        int opt = terminal.nextInt();

        while (opt != 1 && opt != 2 && opt != 3 && opt != 4) {
            clearScreen();
            System.out.println("Opção Inválida\n");
            System.out.println("Escolha alguma opção: ");
            System.out.println("1 - Treino Iniciante");
            System.out.println("2 - Treino Intermediário");
            System.out.println("3 - Treino Avançado");
            System.out.println("4 - Treino Customizado");
            opt = terminal.nextInt();
        }
        clearScreen();
        switch (opt) {
            case 1:
                Treino treinoIni = createTreinoIniciante();
                treinoIni.printTreinoListed();

                break;
            case 2:
                Treino treinoInter = createTreinoIntermediario();
                treinoInter.printTreinoListed();

                break;
            case 3:

                Treino treinoAvancado = createTreinoAvancado();
                treinoAvancado.printTreinoListed();
                break;
            case 4:

                break;
        }

        terminal.close();
    }

    public static Treino createTreinoIniciante() {
        Treino treino = new Treino("Treino Iniciante", 30);

        Exercise abdominal = new Exercise("Abdominal", 20, 3);
        Exercise flexao = new Exercise("Flexão", 15, 5);

        treino.addExercise(abdominal);
        treino.addExercise(flexao);
        treino.addExercise(abdominal);

        return treino;
    }

    public static Treino createTreinoIntermediario() {
        Treino treino = new Treino("Treino Intermediário", 60);

        Exercise burpee = new Exercise("Burpee", 15, 10);
        Exercise abdominal = new Exercise("Abdominal", 40, 3);
        Exercise flexao = new Exercise("Flexão", 30, 5);
        Exercise agachamento = new Exercise("Agachamento", 60, 4);

        treino.addExercise(burpee);
        treino.addExercise(agachamento);
        treino.addExercise(abdominal);
        treino.addExercise(flexao);
        treino.addExercise(agachamento);
        treino.addExercise(burpee);

        return treino;
    }

    public static Treino createTreinoAvancado() {
        Treino treino = new Treino("Treino Avançado", 90);

        Exercise burpee = new Exercise("Burpee", 20, 10);
        Exercise abdominal = new Exercise("Abdominal", 40, 3);
        Exercise flexao = new Exercise("Flexão", 40, 5);
        Exercise agachamento = new Exercise("Agachamento", 60, 4);
        Exercise barra = new Exercise("Barra", 10, 15);
        Exercise escada = new Exercise("Escada", 8, 25);

        treino.addExercise(escada);
        treino.addExercise(burpee);
        treino.addExercise(barra);
        treino.addExercise(agachamento);
        treino.addExercise(abdominal);
        treino.addExercise(flexao);
        treino.addExercise(agachamento);
        treino.addExercise(barra);
        treino.addExercise(burpee);
        treino.addExercise(escada);

        return treino;
    }

    
    private static void clearScreen()
    {  
        System.out.print('\u000C');
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }
}
