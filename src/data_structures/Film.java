package data_structures;

public class Film {
    private String name;
    private int ticketsAvailable;
    private int ticketPrice;
    private int ageConstraint;

    public Film(String name, int ticketsAvailable, int ticketPrice, int ageConstraint) {
        this.name = name;
        this.ticketsAvailable = ticketsAvailable;
        this.ticketPrice = ticketPrice;
        this.ageConstraint = ageConstraint;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", ticketsAvailable=" + ticketsAvailable +
                ", ticketPrice=" + ticketPrice +
                ", ageConstraint=" + ageConstraint +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getAgeConstraint() {
        return ageConstraint;
    }

    public void setAgeConstraint(int ageConstraint) {
        this.ageConstraint = ageConstraint;
    }
}
