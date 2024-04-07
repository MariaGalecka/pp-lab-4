import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Jan Kowalski", 4500.0, 0);
        employees[1] = new Worker("Anna Jakubowska", 5000.0, "Sprzedawca");
        employees[2] = new Worker("Katarzyna Walendowska", 6000.0);
        employees[3] = new Employee("Maria Perzyna", 7000.0 "Menager");
        employees[4] = new Employee("Jerzy Nosowski", 8000.0, "Magazynier");

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }
        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        employees[0].setSalary(75000);

        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}