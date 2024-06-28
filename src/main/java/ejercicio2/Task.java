package ejercicio2;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private int id;
    private String description;
    private TaskPriority taskPriority;
}
