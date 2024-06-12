package basic.codelab01;

import java.util.Objects;

public class Movie {

    private final String title;
    private final String leadActorName;
    private final String genre;

    public Movie(String title, String leadActorName, String genre) {
        this.title = title;
        this.leadActorName = leadActorName;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", leadActorName='" + leadActorName + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    /**
     * Since the titles of movies are not unique (e.g. There is a Bad Boys movie with Sean Penn and one with Will Smith),
     * We have to take into account other criteria as well for checking equality (and calculating the hash code).
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) &&
                Objects.equals(leadActorName, movie.leadActorName) &&
                Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, leadActorName, genre);
    }
}
