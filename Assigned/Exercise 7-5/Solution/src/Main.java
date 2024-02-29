public class Main {

    public static void main(String[] args) {

        Person person = PersonBuilder.builder()
                .firstName("Fabio")
                .lastName("Frau")
                .age(33)
                .address("Via dei pazzi")
                .build();

        System.out.println(person);

    }

}
