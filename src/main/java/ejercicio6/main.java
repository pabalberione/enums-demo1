package ejercicio6;

public class main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("METRO01", VehicleType.METRO, 10, 1);
        try {
            vehicle.addPassengers(3);
            System.out.println("Passengers: " + vehicle.getPassengersOnBoard());
            vehicle.removePassengers(2);
            System.out.println("Passengers: " + vehicle.getPassengersOnBoard());
            vehicle.removePassengers(11);
        }catch (UnderCapacityException | OverCapacityException e){
            System.out.println(e.getMessage());
        }
    }



}
