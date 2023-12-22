public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    private Person() {}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    private static class Builder {

        private String firstName;
        private String lastName;
        private Integer age;
        private String address;

        public Person build() {
            Person person = new Person();
            person.firstName = this.firstName;
            person.lastName = this.lastName;
            person.age = this.age;
            person.address = this.address;
            return person;
        }

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = null;
            this.address = null;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
