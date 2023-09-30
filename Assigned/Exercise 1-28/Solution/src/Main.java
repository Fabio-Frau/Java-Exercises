public class Main {
    public static void main(String[] args) {

        double[] [] matrix = {{1,2,3}, {4,5,6}};

        System.out.println("Printing matrix");
        printMatrix(matrix);

        System.out.println("\nPrinting transposed matrix");
        printMatrix(transposeMatrix(matrix));

    }

    public static double [][] transposeMatrix(double[][] matrix) {

        /*I'm assuming I'm not working with jagged arrays but only with square
        * or rectangular matrices*/
        int transposeColumns = matrix.length;
        int transposeRow = matrix[0].length;
        double [][] transposedMatrix = new double[transposeRow][transposeColumns];

        for (int i = 0; i < transposeRow; i++) {
            for (int j = 0; j < transposeColumns; j++) {
                transposedMatrix[i] [j] = matrix [j] [i];
            }
        }

        return  transposedMatrix;
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
}
