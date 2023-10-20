/*Leggere un array di 5 numeri naturali, calcolare il massimo divisore
 primo di ogni numero memorizzato nell’array; memorizza questi divisori
  primi in un altro array, infine stampa il più grande divisore primo tra
   quelli memorizzati nel secondo array.*/

public class Main {
    public static void main(String[] args) {

        System.out.println(findBiggestPrimeDivisor(2));


    }

//    public static int[] maxPrimeDivisors(int[] array) {
//
//    }


    /*STUDIARE BENE QUESTO METODO*/
    public static boolean primo(int n) {
        if (n == 2)
            return true;

        if (n % 2 == 0)
            return false;

        int divisore = 3;
        while (divisore <= Math.sqrt(n)) {
            if (n % divisore == 0)
                return false;
            divisore += 2;
        }
        return true;
    }


    public static int findBiggestPrimeDivisor(int number) {
        int result = 0;
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    result = i;
                    break;
                }
            }

        }
        return result;
    }





    public static boolean isPrime(int number) {

        if (number == 2 || number == 1) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number - 1; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


}
