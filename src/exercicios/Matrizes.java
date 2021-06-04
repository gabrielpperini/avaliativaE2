package exercicios;

import java.util.Arrays;

public class Matrizes {
    public static void main(String[] args) {
        int[][] arrOne = {
            {1,2,3},
            {1,2,3},
            {1,2,3},
        };
        int[][] arrTwo = {
            {4,5,6},
            {4,5,6},
            {4,5,6},
        };
        stringfyMatriz(multiplyArrays(arrOne, arrTwo));
    }

    public static int[][] multiplyArrays(int[][] arrOne, int[][] arrTwo) {
        int[][] arrResult = new int[arrOne.length][arrOne[0].length];

        for (int row = 0; row < arrResult.length; row++) {
            for (int col = 0; col < arrResult[row].length; col++) {
                int sum = 0;
                for (int k = 0; k < arrResult[row].length; k++) {
                    sum += arrOne[row][k] * arrTwo[k][col];
                }
                arrResult[row][col] = sum;
            }
        }

        return arrResult;
    }

    public static void stringfyMatriz(int[][] matriz) {
        for (int[] row : matriz) {
            System.out.println(Arrays.toString(row));
        }
    }
}
