public class Main {

    public static void main(String[] args) {

        /*Multidimensional arrays*/
        int [] [] matrix = {{1,2,3}, {7,8,9,10}};

        System.out.println(matrix [0] [0]);
        System.out.println(matrix [0] [1]);

        System.out.println(matrix [1] [0]);
        System.out.println(matrix [1] [1]);

        System.out.println("\nPrinting for loop");
        for ( int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix [i].length; j++) {
                System.out.println(matrix [i] [j]);
            }
        }




    }

}
