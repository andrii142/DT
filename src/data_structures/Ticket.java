package data_structures;

public class Ticket {
    private Cinema cinema;
    private Film film;
    private User user;

    public Ticket(Cinema cinema, User user) {
        this.cinema = cinema;
        this.user = user;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public Film getFilm() {
        return film;
    }

    public User getUser() {
        return user;
    }
}
