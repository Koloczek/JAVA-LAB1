/* 5. Proszę napisać program, który wczytuje z pliku macierz N x N i sprawdza, czy jest ona kwadratem magicznym. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Zad5 {
    public static void main(String[] args) {
        String filePath = "LAB1\\Magiczny2.csv";

        try {
            int[][] matrix = readMatrixfromCSV(filePath);

            if (matrix == null) {
                System.out.println("Błąd podczas wczytywania macierzy! ");
                return;
            }

            if (isMagicSquare(matrix)) {
                System.out.println("Macierz jest kwadratem magicznym!");
            } else {
                System.out.println("Macierz NIE jest kwadratem magicznym!");
            }


        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania macierzy! " + e.getMessage());
        }
    }

    public static int[][] readMatrixfromCSV(String filePath) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        int[][] matrix;
        int rowCount = 0;

        while ((line = br.readLine()) != null){
            rowCount++;
        }
        br.close();

        br = new BufferedReader(new FileReader(filePath));
        matrix = new int[rowCount][];
        int i = 0;

        while ((line = br.readLine()) != null){
            String[] values = line.split(",");
            matrix[i] = new int[values.length];
            for (int j=0; j < values.length; j++){
                matrix[i][j] = Integer.parseInt(values[j].trim());

            }
            i++;
        }
        br.close();

        return matrix;
    }

    public static boolean isMagicSquare(int[][] matrix){
        int n = matrix.length;

        for(int[] row : matrix){
            if(row.length != n){
                return false;
            }
        }

        int magicSum = 0;
        for (int num : matrix[0]){
            magicSum += num;
        }

        for(int i = 1; i < n; i++){
            int rowSum = 0;
            for(int num : matrix[1]){
                rowSum += num;
            }
            if (rowSum != magicSum){
                return false;
            }
        }

        for(int j = 0; j < n; j++){
            int colSum = 0;
            for(int i = 0; i < n; i++){
                colSum += matrix[i][j];
            }
            if (colSum != magicSum){
                return false;
            }
        }

        int diagonal1Sum = 0, diagonal2Sum = 0;
        for (int i = 0; i < n; i++){
            diagonal1Sum += matrix[i][i];
            diagonal2Sum += matrix[i][n - i - 1];
        }

        return diagonal1Sum == magicSum && diagonal2Sum == magicSum;
    }
}