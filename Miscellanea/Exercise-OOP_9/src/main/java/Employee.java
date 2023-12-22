import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.Period;

public class Employee {

    private String name;
    private BigDecimal salary;
    private OffsetDateTime hireDate;

    public Employee(String name, BigDecimal salary, OffsetDateTime hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public OffsetDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(OffsetDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public int getYearOfService() {
        return Period.between(hireDate.toLocalDate(), OffsetDateTime.now().toLocalDate()).getYears();
    }

    public void printEmployeeDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("HireDate: " + hireDate);
    }
}
