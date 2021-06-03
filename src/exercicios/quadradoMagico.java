import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
/**
 * quadradoMagico
 */
public class quadradoMagico {

    public static void main(String[] args) {
        // int[][] quadrado = getQuadradoByScanner();
        
        // if(validaQuadrado(quadrado)){
        //     System.out.println("O quadrado é mágico!");
        // }else{
        //     System.out.println("O quadrado não é mágico!");
        // }
        // System.out.println("");
        // stringfyVector(quadrado);
        findAllMagicSquares();
    }

    public static void stringfyVector(int[][] quadrado) {
        for (int[] row : quadrado) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] getQuadradoByScanner() {
        Scanner in = new Scanner(System.in);
        List<Integer> used = new ArrayList<Integer>();
        int[][] quadrado = new int[4][4];
        for (int row = 0; row < 4 ; row++) {
            for (int col = 0; col < 4 ; col++) {
                System.out.print("número da ["+row+"]["+col+"]: ");
                int num = in.nextInt();
                while(used.contains(num) || !(num >= 1 && num <= 16)){
                    String errMsg = used.contains(num) ? "Número " + num + " já foi selecionado!" : "Número está fora do intervalo [1,16]";
                    System.out.println(errMsg);
                    System.out.print("número da ["+row+"]["+col+"]: ");
                    num = in.nextInt();
                }
                used.add(num);
                quadrado[row][col] = num;
            }
        }
        in.close();
        return quadrado;
    }

    public static boolean validaQuadrado(int[][] quadrado) {
        int numberVerificator = sumAll(quadrado[0]);
        // verifica linhas
        for (int[] linha : quadrado) {
            if(sumAll(linha) != numberVerificator){
                return false;
            }
        }
        // verifica colunas
        for (int[] coluna : getColumns(quadrado)) {
            if(sumAll(coluna) != numberVerificator){
                return false;
            }
        }
        // verifica diagonais
        for (int[] diagonal : getDiagonais(quadrado)) {
            if(sumAll(diagonal) != numberVerificator){
                return false;
            }
        }
        return true;
    }

    public static int sumAll(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static int[][] getColumns(int[][] quadrado) {
        int[][] columns = new int[quadrado.length][quadrado.length];
        for (int row = 0; row < quadrado.length ; row++) {
            for (int col = 0; col < quadrado.length ; col++) {
                columns[col][row] = quadrado[row][col];
            }
        }
        return columns;
    }

    public static int[][] getDiagonais(int[][] quadrado) {
        int[][] diagonais = new int[2][quadrado.length];
        for (int row = 0; row < quadrado.length ; row++) {
            diagonais[0][row] = quadrado[row][row];
            diagonais[1][row] = quadrado[row][quadrado.length - 1 - row];
        }
        return diagonais;
    }

    public static void findAllMagicSquares(){
        List<int[][]> squares = new ArrayList<int[][]>();
        int squareSize = 3;
        for (int i = 1; i <= (squareSize * squareSize); i++) {
            int[][] square = new int[squareSize][squareSize];
            square[0][0] = i;
            squares.addAll(fillSquare(squareSize,new ArrayList<int[][]>(), square, 0, 1));
        }

        for (int[][] sq : squares) {
            if(validaQuadrado(sq)) {
                System.out.println("");
                System.out.println("");
                stringfyVector(sq);
            }
        }
        System.out.println(squares.size());
    }

    public static List<int[][]> fillSquare(int squareSize,List<int[][]> squares,int[][] square, int row, int col) {
        List<int[][]> newSquares =  new ArrayList<int[][]>();
        for (int i = 1; i <= (squareSize * squareSize); i++) {
            if(containsNum(square,i)) continue;
            int[][] sqClone = cloneSquare(square);
            sqClone[row][col] = i;
            newSquares.add(sqClone);
        }
        List<int[][]> toReturn =  new ArrayList<int[][]>();
        int lastIndex = squareSize - 1;
        if(row == lastIndex && col == lastIndex) {
            toReturn.addAll(newSquares);
        }else{
            int newCol = col == lastIndex ? 0 : col + 1;
            int newRow = col == lastIndex ? row + 1 : row;
            for (int[][] sq : newSquares) {
                toReturn.addAll(fillSquare(squareSize,newSquares,sq,newRow,newCol));
            }
        }
        return toReturn;
    }

    public static int[][] cloneSquare(int[][] square){
        int[][] cloned = square.clone();
        for (int i = 0; i < cloned.length; i++) {
            cloned[i] = cloned[i].clone();
        } 
        return cloned;
    }

    public static boolean containsNum(int[][] square, int num) {
        for (int[] row : square) {
            for(int col : row){
                if(col == num) return true;
            }
        }
        return false;
    }

}