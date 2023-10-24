

public class Main {

    public static void main(String[] args) {

        int[] arrayProva = new int[] {1,2,12,-30, 15,-1000};
        int[] arrayProva1 = new int[] {2,7,2, 4,8,6, 10,5, 3,9};

        String[] arrayStringhe = new String[] {"Ciao", "Belli", "Mattina", "Fabio"};

        System.out.println(maxValue(arrayProva));
        System.out.println(minValue(arrayProva));
        System.out.println(sumEven(arrayProva1));

        System.out.println(findWord(arrayStringhe,50));


        Docente doc1 = new Docente("Antonio", "Iovine", 35, "9999");
        Docente doc2 = new Docente("Fabio", "Frau", 31, "11111");
        Docente doc3 = new Docente("Mario", "Verdi", 1000, "55555");

        Docente[] arrayDoc = new Docente[] {doc1, doc2, doc3};

        Universita uni = new Universita(arrayDoc);

        System.out.println("Il più giovane ha anni : ");
        System.out.println(uni.youngestDoc());

    }

    public static boolean findWord(String[] array, int length ) {

        for( int i = 0; i < array.length; i++) {
            if(array[i].length() == length) {
                return true;
            }
        }

        return false;
    }

    public static int sumEven(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        return sum;
    }

    public static int maxValue(int[] array) {

        int max = array[0];

        for ( int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int minValue(int[] array) {

        int min = array[0];

        for ( int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }


}
