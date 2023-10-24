import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(
                new Student("Leonardo", 31), new Student("Donatello", 30),
                new Student("Raphael", 32), new Student("Michelangelo", 35),
                new Student("Noctis Lucis Caelum", 20), new Student("Gladiolus Amicitia", 23),
                new Student("Ignis Scientia", 22), new Student("Prompto Argentum", 20),
                new Student("Gravelord Nito", 1052 ), new Student("Witch of Izalith", 1147),
                new Student("Gwyn, Lord of Cinder", 2336), new Student("Furtive Pygmy",2098)));


        System.out.println("Initial ArrayList not sorted:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        students.sort(Comparator.comparingInt(Student::getAge));
        System.out.println("ArrayList sorted by age:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        students.sort(Comparator.comparing(Student::getName));
        System.out.println("ArrayList sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

    }
}
