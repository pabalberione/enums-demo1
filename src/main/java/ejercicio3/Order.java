package ejercicio3;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int orderId;
    private String customerName;
    OrderStatus orderStatus;
}
