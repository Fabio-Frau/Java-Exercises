import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {


        Employee emp1 = new Employee("Paperino", BigDecimal.valueOf(50000), OffsetDateTime.parse("2021-04-01T00:00:00+01:00", DateTimeFormatter.ISO_DATE_TIME));
        Employee emp2 = new Employee("Topolino", BigDecimal.valueOf(70000), OffsetDateTime.parse("2015-04-01T00:00:00+01:00", DateTimeFormatter.ISO_DATE_TIME));
        Employee emp3 = new Employee("Pippo", BigDecimal.valueOf(50000), OffsetDateTime.parse("2011-01-15T00:00:00+01:00", DateTimeFormatter.ISO_DATE_TIME));

        emp1.printEmployeeDetails();
        System.out.println(emp1.getYearOfService());

        emp2.printEmployeeDetails();
        System.out.println(emp2.getYearOfService());

        emp3.printEmployeeDetails();
        System.out.println(emp3.getYearOfService());

    }

}
