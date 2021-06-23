package avaliativa4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Treino
 * 
 */
public class Treino {

    private String name;
    private double time;
    private List<Exercise> exercisesList;

    public Treino(String name, double time) {
        this.name = name;
        this.time = time;
        this.exercisesList = new ArrayList<Exercise>();
    }

    public void addExercise(Exercise exe) {
        exercisesList.add(exe);
    }

    public void printTreinoListed() throws FileNotFoundException {
        PrintWriter printTreino = new PrintWriter("treinos/" + this.name + ".txt");
        printTreino.println(this.name + "\n");
        printTreino.printf("Tempo: %.2f Minutos\n\n",this.time);
        printTreino.print(String.format("%1$-15s","Exercício"));
        printTreino.println("   Repetições");
        for (Exercise exercise : exercisesList) {
            printTreino.print(String.format("%1$-15s",exercise.getName()));
            printTreino.printf("   %-5d\n",exercise.getRepeats());
        }
        printTreino.println("\n\nNível do treino: " + getPerformaceLabel());

        printTreino.close();
    }

    private double getTotalPerformace()
    {
        double total = 0;
        for (Exercise exercise : exercisesList) {
            total += exercise.CalcPerformece();
        }
        return total / time;
    }

    public String getPerformaceLabel()
    {
        double performace = getTotalPerformace();
        // System.out.println(performace);
        if(performace <= 10){
            return "Iniciante";
        }else if(performace >= 20){
            return "Avançado";
        }else{
            return "Intermediário";
        }
    }

    public String getName() {
        return name;
    }
}
