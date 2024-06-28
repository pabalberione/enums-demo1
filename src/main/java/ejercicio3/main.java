package ejercicio3;

public class main {
    public static void main(String[] args) {
        Order order1 = new Order(1, "Juan",OrderStatus.PLACED);
        Order order2 = new Order(2, "María", OrderStatus.IN_PROGRESS);
        Order order3 = new Order(3,"Ana",OrderStatus.COMPLETED);
        Order order4 = new Order(4,"Luis",OrderStatus.CANCELLED);

        System.out.println("Pedido: " + order1.getOrderId() + ", Cliente: " + order1.getCustomerName() + ", Estado: " + order1.getOrderStatus());
        System.out.println("Pedido: " + order2.getOrderId() + ", Cliente: " + order2.getCustomerName() + ", Estado: " + order2.getOrderStatus());
        System.out.println("Pedido: " + order3.getOrderId() + ", Cliente: " + order3.getCustomerName() + ", Estado: " + order3.getOrderStatus());
        System.out.println("Pedido: " + order4.getOrderId() + ", Cliente: " + order4.getCustomerName() + ", Estado: " + order4.getOrderStatus());


    }
}
