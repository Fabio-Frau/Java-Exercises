import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(new Student("Leonardo",31),
                new Student("Donatello",30), new Student("Raphael",32),
                new Student("Michelangelo", 35))) ;

        System.out.println("Initial ArrayList:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        students.add(new Student("Noctis Lucis Caelum",20));
        students.add(new Student("Gladiolus Amicitia",23));
        students.add(new Student("Ignis Scientia",22));
        students.add(new Student("Prompto Argentum",20));
        System.out.println("ArrayList after adding 4 elements:");
        for (Student student : students) {
            System.out.println(student);
        }


    }
}
