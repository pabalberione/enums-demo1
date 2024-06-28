package ejercicio1;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private EmployeeType employeeType;

}
