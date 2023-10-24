import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Milan",
                "london", "San Francisco", "Tokyo", "New Delhi");

        System.out.println("cities:");
        System.out.println(cities);
        System.out.println("\ncities CASE_INSENSITIVE_ORDER");
        cities.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(cities);
        System.out.println("\ncities Comparator.naturalOrder()");
        cities.sort(Comparator.naturalOrder());
        System.out.println(cities);

        List<Integer> numbers = Arrays.asList(6,2,1,4,9);
        System.out.println();
        System.out.println("Integers sorting");
        System.out.println(numbers);
        System.out.println("sort(Comparator.naturalOrder())");
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
        System.out.println();

        System.out.println("Sort a List by String field");
        List<Movie> movies = Arrays.asList( new Movie("Lord of the rings", 8.8, true),
                new Movie("Back to the future", 8.5, false), new Movie("Carlito's way", 7.9, true),
                new Movie("Pulp fiction", 8.9, false));
        System.out.println(movies);

        movies.sort(Comparator.comparing(Movie::getTitle));
        System.out.println(movies);
        System.out.println();

        System.out.println("Sort a List by Double Filed");
        movies.sort(Comparator.comparingDouble(Movie::getRating).reversed());
        System.out.println(movies);
        System.out.println();

        System.out.println("Sort a List with a custom Comparator using Anonymous class");
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                if (m1.isStarred() == m2.isStarred()) {
                    return 0;
                }
                return m1.isStarred() ? -1 : 1;
            }
        });

        System.out.println(movies);
        System.out.println();

        System.out.println("Sort a List with a custom Comparator using a lambda expression");
        movies.sort(Comparator.comparing(Movie::getTitle));
        System.out.println(movies);
        movies.sort((m1, m2) -> {
            if (m1.isStarred() == m2.isStarred()) {
                return 0;
            }
            return m1.isStarred() ? -1 : 1;
        });
        System.out.println(movies);

        System.out.println("Sort a List with a custom Comparator using Comparator.comparing()");
        movies.sort(Comparator.comparing(Movie::getTitle));
        System.out.println(movies);
        movies.sort(Comparator.comparing(Movie::isStarred, (star1,star2) -> {
            if (star1 == star2) {
                return 0;
            }
            return star1 ? -1 : 1;
        }));
        System.out.println(movies);
        System.out.println();

        System.out.println("Sort a List with chain of comparators");
        movies = Arrays.asList( new Movie("Lord of the rings", 8.8, true),
                new Movie("Back to the future", 8.5, false), new Movie("Carlito's way", 7.9, true),
                new Movie("Pulp fiction", 8.9, false));
        System.out.println(movies);

        movies.sort(Comparator.comparing(Movie::isStarred).reversed().thenComparing(Comparator.comparing(Movie::getRating)).reversed());
        System.out.println(movies);





    }
}
