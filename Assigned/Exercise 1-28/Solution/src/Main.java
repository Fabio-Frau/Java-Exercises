public class Main {
    public static void main(String[] args) {

        double[] [] matrix = {{1,2,3}, {4,5,6}};
        double[] [] matrix2 = {{1,2,3,4,5}, {7,8,9,10}};

        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println("Matrix transposed");
        transpose(matrix);
        System.out.println("Matrix2:");
        printMatrix(matrix2);
        System.out.println("Matrix2 transposed:");
        transpose(matrix2);

//        System.out.println("Printing matrix");
//        printMatrix(matrix);
//
//        System.out.println("\nPrinting transposed matrix");
//        printMatrix(transposeMatrix(matrix));

    }

    public static void transpose(double[][] matrix) {
        if (isTransposable(matrix)) {
            printMatrix(transposeMatrix(matrix));
        } else {
            System.out.println("The dimensions of the arrays inside the matrix don't allow to transpose the matrix");
        }
    }

    public static boolean isTransposable(double[][] matrix) {

        for (int i = 0 ; i < matrix.length; i++)
        {
            if (matrix[0].length != matrix[i].length) {
                return false;
            }
        }

        return true;
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
