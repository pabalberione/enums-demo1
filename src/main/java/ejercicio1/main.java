package ejercicio1;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Alice", EmployeeType.FULL_TIME);
        Employee employee2 = new Employee(1,"Bob", EmployeeType.PART_TIME);
        Employee employee3 = new Employee(1,"Charlie", EmployeeType.CONTRACTOR);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println(employee1.getName() + " is a " + employee1.getEmployeeType() + " employee.");
    }
}
