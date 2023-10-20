import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> myHashSet = fillHashSet(5);
        System.out.println("The HashSet is: " + myHashSet);
        System.out.println("The HashSet size is equal to: " + myHashSet.size());

    }

    public static HashSet<String> fillHashSet(int size) {

        HashSet<String> hashSet = new HashSet<String>();

        for ( int i = 0; i < size; i++) {
            hashSet.add("Elemento numero: " + i);
        }
        return hashSet;

    }
}
