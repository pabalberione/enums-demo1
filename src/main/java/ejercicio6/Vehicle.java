package ejercicio6;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    private String id;
    VehicleType vehicleType;
    private int capacity;
    private int passengersOnBoard;

    public void addPassengers(int passengers) throws OverCapacityException{
        if(passengersOnBoard + passengers > capacity){
            throw new OverCapacityException("Exceeding vehicle capacity");
        }
        passengersOnBoard += passengers;
    }

    public void removePassengers(int passengers)throws UnderCapacityException{
        if(passengersOnBoard - passengers < 0){
            throw new UnderCapacityException("The passengers on board cannot be negative!");
        }
        passengersOnBoard -= passengers;
    }
}


