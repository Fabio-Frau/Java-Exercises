import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Fabio", "Supervisor", BigDecimal.valueOf(10000));
        Employee emp2 = new Employee("Paperino", "Bricklayer", BigDecimal.valueOf(8000));

        System.out.println(emp1);
        System.out.println(emp2);

        emp1.raiseSalary(10);
        emp2.raiseSalary(20);

        System.out.println(emp1);
        System.out.println(emp2);


    }

}
