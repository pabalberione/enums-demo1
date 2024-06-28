package ejercicio5;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private int ticketId;
    private String movieName;
    SeatType seatType;
}
