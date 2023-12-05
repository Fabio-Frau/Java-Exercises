import java.math.BigDecimal;

public class Employee {

    private String name;
    private String jobTitle;
    private BigDecimal salary;

    public Employee(String name, String jobTitle, BigDecimal salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        this.salary = this.salary.multiply(BigDecimal.valueOf(1+(percentage/100)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
