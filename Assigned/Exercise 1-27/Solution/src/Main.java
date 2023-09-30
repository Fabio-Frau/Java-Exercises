import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        double[] [] matrix = createRandomMatrix(2,2);
        printMatrix(matrix);

        System.out.print("The sum of the first row is: ");
        System.out.println(sumNthRow(matrix,0));

        System.out.print("The sum of the second row is: ");
        System.out.println(sumNthRow(matrix,1));


    }

    public static double [] [] createRandomMatrix(int row,int column) {

        Random random = new Random();
        double[] [] matrix = new double[row] [column];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++) {
                matrix[i] [j] = random.nextDouble(0,100);
            }
        }

        return  matrix;

    }

    public static void printMatrix(double[] [] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i] [j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static double sumNthRow(double [] [] matrix, int row) {

        double sum = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            sum += matrix[row] [i];
        }

        return  sum;
    }
}
