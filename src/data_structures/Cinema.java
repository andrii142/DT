package data_structures;

public class Cinema {
    private String city;
    private Film[] cinemaFilms = new Film[10];
    private Ticket[] tickets = new Ticket[10];
    private double cinemaPriceIndex;

    public Cinema(String city, double cinemaPriceIndex) {
        this.city = city;
        this.cinemaPriceIndex = cinemaPriceIndex;
    }

    void saveTicket(Ticket ticket) {
        DAOImpl dao = new DAOImpl();
        dao.save(ticket);
    }

    //public abstract int calcProfit();

    public String getCity() {
        return city;
    }

    public Film[] getCinemaFilms() {
        return cinemaFilms;
    }

    public double getCinemaPriceIndex() {
        return cinemaPriceIndex;
    }

    public void setCinemaFilms(Film[] cinemaFilms) {
        this.cinemaFilms = cinemaFilms;
    }
}
