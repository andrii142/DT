package data_structures;


public class Controller {
    private Cinema[] cinemas = new Cinema[3];

    private Film film;

    private int pr = 30;

    public Controller() {
        init();
    }

    private void init() {
        //create cinema 1, create films and add them to cinema
        Cinema cinema1 = new Cinema("Kiev", 1.5);

        Film[] cinemaFilms = new Film[10];
        Film film1 = new Film("Animals", 50, 120, 0);
        cinemaFilms[0] = film1;
        Film film2 = new Film("Boys", 150, 20, 10);
        cinemaFilms[1] = film2;
        Film film3 = new Film("Ben Gur", 150, 50, 18);
        cinemaFilms[2] = film3;

        cinema1.setCinemaFilms(cinemaFilms);
        cinemas[0] = cinema1;

        //create cinema 2, create films and add them to cinema
        Cinema cinema2 = new Cinema("Kiev", 1);
        cinemaFilms = new Film[10];
        film1 = new Film("Animals 2", 500, 1200, 10);
        cinemaFilms[0] = film1;
        film2 = new Film("Crash car", 100, 120, 0);
        cinemaFilms[1] = film2;
        cinemaFilms[2] = film3;

        cinema2.setCinemaFilms(cinemaFilms);
        cinemas[1] = cinema2;


        //create cinema 3, create films and add them to cinema
        Cinema cinema3 = new Cinema("Kiev", 1);
        cinemaFilms = new Film[10];
        film1 = new Film("Days and nights", 100, 1300, 20);
        cinemaFilms[0] = film1;
        cinemaFilms[1] = film2;
        cinemaFilms[2] = film3;

        cinema3.setCinemaFilms(cinemaFilms);
        cinemas[2] = cinema3;
    }


    int findCheapestFilm() {
        int min = Integer.MAX_VALUE;
        for (Cinema cinema : cinemas) {
            for (Film film : cinema.getCinemaFilms()) {
                int price;
                if(film != null) price = film.getTicketPrice();
                else break;

                if(price < min) min = price;
            }
        }

        return min;
    }


    Film[] findFilm(User user, int price) {
        int filmsCount = 0;

        int ticketPrice;

        for (Cinema cinema : cinemas) {
            for (Film film : cinema.getCinemaFilms()) {
                if (film != null)
                    ticketPrice = film.getTicketPrice();
                else break;

                if (ticketPrice >= price - pr && ticketPrice <= price + pr && user.getAge() >= film.getAgeConstraint()) {
                    filmsCount++;
                }
            }
        }

        Film[] films = new Film[filmsCount];

        int index = 0;
        for (Cinema cinema : cinemas) {
            for (Film film : cinema.getCinemaFilms()) {
                if (film != null)
                    ticketPrice = film.getTicketPrice();
                else break;

                if (ticketPrice >= price - pr && ticketPrice <= price + pr && user.getAge() >= film.getAgeConstraint()) {
                    films[index] = film;
                    index++;
                }
            }
        }

        return films;
    }

    Film[] findFilm(User user, String name) {
        int filmsCount = 0;

        for (Cinema cinema : cinemas) {
            for (Film film : cinema.getCinemaFilms()) {
                if (film != null && film.getName().equals(name) && user.getAge() >= film.getAgeConstraint()) {
                    filmsCount++;
                }
            }
        }

        Film[] films = new Film[filmsCount];

        int index = 0;
        for (Cinema cinema : cinemas) {
            for (Film film : cinema.getCinemaFilms()) {
                if (film != null && film.getName().equals(name) && user.getAge() >= film.getAgeConstraint()) {
                    films[index] = film;
                    index++;
                }
            }
        }

        return films;
    }
}
