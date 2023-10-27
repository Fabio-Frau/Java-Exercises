import java.util.Objects;

public record PersonRecord(String name, String address) {

    public PersonRecord(String name, String address) {
        this.name = Objects.requireNonNull(name);
        this.address = Objects.requireNonNull(address);
    }

    public  PersonRecord(String name) {
        this(name,"Unknown");
    }
}
