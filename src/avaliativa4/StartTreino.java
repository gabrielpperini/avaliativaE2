package avaliativa4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
// import java.io.*;

public class StartTreino {

    public static final Scanner terminal = new Scanner(System.in);
    
    public static void main(String[] args) throws InterruptedException, IOException, FileNotFoundException {
        clearScreen();
        System.out.println("Olá bem-vindo a academia FitSpace\n");
        Thread.sleep(1000);
        printChoice();

        int opt = terminal.nextInt();

        while (opt != 1 && opt != 2 && opt != 3 && opt != 4) {
            clearScreen();
            System.out.println("Opção Inválida\n");
            Thread.sleep(500);
            printChoice();
            opt = terminal.nextInt();
        }
        clearScreen();
        String treinoFileName = selectTreino(opt);

        System.out.println("Seu treino foi finalizado!");
        System.out.print("Deseja abri-lo? [sim/nao]: ");
        String res = terminal.next();

        if (res.equals("sim")) {
            openTxtFile(treinoFileName);
        }

        terminal.close();
    }

    public static String selectTreino(int opt) throws FileNotFoundException, InterruptedException {
        String treinoFileName = "";
        switch (opt) {
            case 1:
                Treino treinoIni = createTreinoIniciante();
                treinoIni.printTreinoListed();
                treinoFileName = treinoIni.getName() + ".txt";
                break;
            case 2:
                Treino treinoInter = createTreinoIntermediario();
                treinoInter.printTreinoListed();
                treinoFileName = treinoInter.getName() + ".txt";
                break;
            case 3:
                Treino treinoAvancado = createTreinoAvancado();
                treinoAvancado.printTreinoListed();
                treinoFileName = treinoAvancado.getName() + ".txt";
                break;
            case 4:
                Treino treinoCustom = createTreinoCustomizado();
                treinoCustom.printTreinoListed();
                treinoFileName = treinoCustom.getName() + ".txt";
                break;
        }
        fakeLoading();
        return treinoFileName;
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

    public static Treino createTreinoCustomizado() {
        System.out.print("Qual o nome do treino? ");
        terminal.nextLine();
        String nome = terminal.nextLine();
        System.out.print("Qual o tempo do treino? ");
        Double time = terminal.nextDouble();
        Treino treino = new Treino(nome, time);
        String addExe = "sim";
        int countExe = 1;
        do{
            clearScreen();
            System.out.println("Exercício #"+countExe);
            System.out.println("");
            System.out.print("Qual o nome do exercício? ");
            terminal.nextLine();
            String exeName = terminal.nextLine();
            System.out.print("Quantas repetições serão feitas? ");
            int exeRepeat = terminal.nextInt();
            System.out.print("Quantas calorias são gastas a cada repetição? ");
            Double exeCalories = terminal.nextDouble();
            Exercise exercicio = new Exercise(exeName, exeRepeat, exeCalories);
            treino.addExercise(exercicio);
            
            System.out.print("\nDeseja adicionar outro exercício? [sim/nao]: ");
            addExe = terminal.next();
            countExe++;
        }while(addExe.equals("sim"));
        
        return treino;
    }

    private static void clearScreen() {
        System.out.print('\u000C');
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void openTxtFile(String local) throws IOException {
        String file = "\"" + System.getProperty("user.dir") + "\\treinos\\" + local + "\"";
        ProcessBuilder builder = new ProcessBuilder("cmd.exe","start","/c","notepad",file);
        builder.redirectErrorStream(true);
        builder.start();
        // Process p = builder.start();
        // BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        // String line;
        // while (true) {
        //     line = r.readLine();
        //     if (line == null) { break; }
        //     System.out.println(line);
        // }
    }

    private static void fakeLoading() throws InterruptedException {
        String dots = ".";
        for (int i = 0; i < 10; i++) {
            clearScreen();
            System.out.println("Loading" + dots);
            if (dots.equals("...")) {
                dots = ".";
            } else {
                dots += ".";
            }
            Thread.sleep(500);
        }
        clearScreen();
    }

    private static void printChoice() {
        System.out.println("Escolha alguma opção: ");
        System.out.println("1 - Treino Iniciante");
        System.out.println("2 - Treino Intermediário");
        System.out.println("3 - Treino Avançado");
        System.out.println("4 - Treino Customizado");
    }
}
