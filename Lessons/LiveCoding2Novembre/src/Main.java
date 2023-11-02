import java.util.*;

public class Main {

    public static void main(String[] args) {

        Student studente2 = new Student("Antonio", 1);
        Student studente1 = new Student("Mario", 2);
        Student studente4 = new Student("Michele", 3);
        Student studente3 = new Student("Giovanni", 4);

        Map<String, Student> listaAlunni = new LinkedHashMap<>();
        listaAlunni.put("2",studente2);
        listaAlunni.put("3",studente3);
        listaAlunni.put("1",studente1);
        listaAlunni.put("4",studente4);

        List<Student> listaOrdinata = new ArrayList<>(listaAlunni.values());

        Collections.sort(listaOrdinata, Comparator.comparing(Student::getName));

        System.out.println(listaAlunni);
        System.out.println(listaOrdinata);


    }



    public static class Student {
        String name;
        int id;

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

}

