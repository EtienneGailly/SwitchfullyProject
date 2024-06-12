package basic.codelab01;

import java.util.HashSet;
import java.util.Set;

class MovieCatalog {

    private final String name;
    private final Set<Movie> movies;

    MovieCatalog(String name) {
        this.name = name;
        movies = new HashSet<>();
    }

    MovieCatalog addMovie(Movie movie) {
        movies.add(movie);
        return this;
    }

    /**
     * Should return only the movies that exist in both movie catalogs
     */
    Movie[] getIntersectionOf(MovieCatalog otherMovieCatalog) {
        // Remove exception and implement method
        throw new UnsupportedOperationException("Implement me");
    }

    /**
     * Should return all the movies, of both movie catalogs combined
     */
    Movie[] getUnionOf(MovieCatalog otherMovieCatalog) {
        // Remove exception and implement method
        throw new UnsupportedOperationException("Implement me");
    }

    /**
     * If this movie catalog includes all the movies of the other movie catalog, then return true.
     */
    boolean isSubsetOf(MovieCatalog otherMovieCatalog) {
        // Remove exception and implement method
        throw new UnsupportedOperationException("Implement me");
    }

}
