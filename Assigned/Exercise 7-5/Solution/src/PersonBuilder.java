public class PersonBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    private PersonBuilder() {

    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setAddress(address);
        return person;
    }


}
