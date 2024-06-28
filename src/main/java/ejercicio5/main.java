package ejercicio5;

public class main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(1,"Avengers", SeatType.STANDARD);
        Ticket ticket2 = new Ticket(2,"Inception", SeatType.PREMIUM);
        Ticket ticket3 = new Ticket(3,"Matrix", SeatType.VIP);
        Ticket ticket4 = new Ticket(4,"Titanic", SeatType.STANDARD);

        System.out.println("Boleto ID: " + ticket1.getTicketId() + ", Película: " + ticket1.getMovieName() + ", Asiento: " + ticket1.getSeatType());
        System.out.println("Boleto ID: " + ticket2.getTicketId() + ", Película: " + ticket2.getMovieName() + ", Asiento: " + ticket2.getSeatType());
        System.out.println("Boleto ID: " + ticket3.getTicketId() + ", Película: " + ticket3.getMovieName() + ", Asiento: " + ticket3.getSeatType());
        System.out.println("Boleto ID: " + ticket4.getTicketId() + ", Película: " + ticket4.getMovieName() + ", Asiento: " + ticket4.getSeatType());

    }
}
