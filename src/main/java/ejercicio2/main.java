package ejercicio2;

public class main {
    public static void main(String[] args) {
        Task task1 = new Task(1, "Preparar documento",TaskPriority.HIGH);

        System.out.println("Description: " + task1.getDescription() + ", Prioridad: " + task1.getTaskPriority());
    }
}
