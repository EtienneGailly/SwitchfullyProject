package basic.codelab01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MovieCatalogTest {

    private final MovieCatalog thisMovieCatalog;
    private final MovieCatalog otherMovieCatalog;

    public MovieCatalogTest() {
        thisMovieCatalog = new MovieCatalog("My Favorite Movies")
                .addMovie(new Movie("Jimmy goes wild", "Bradly Pitski", "action"))
                .addMovie(new Movie("The flight", "Scarletta Johansa", "thriller"))
                .addMovie(new Movie("Hacker", "Gwen Closet", "thriller"));
        otherMovieCatalog = new MovieCatalog("Good Thrillers")
                .addMovie(new Movie("Dreaming about dreams", "Denzel Washton", "thriller"))
                .addMovie(new Movie("The flight", "Scarletta Johansa", "thriller"))
                .addMovie(new Movie("The Curious case of Ben the button", "Bradly Pitski", "thriller"))
                .addMovie(new Movie("Hacker", "Gwen Closet", "thriller"));
    }

    @Test
    void getIntersectionOf() {
        Movie[] intersectionOf = thisMovieCatalog.getIntersectionOf(otherMovieCatalog);

        assertThat(intersectionOf).containsExactlyInAnyOrder(
                new Movie("The flight", "Scarletta Johansa", "thriller"),
                new Movie("Hacker", "Gwen Closet", "thriller")
        );
    }

    @Test
    void getUnionOf() {
        Movie[] unionOf = thisMovieCatalog.getUnionOf(otherMovieCatalog);

        assertThat(unionOf).containsExactlyInAnyOrder(
                new Movie("Jimmy goes wild", "Bradly Pitski", "action"),
                new Movie("The flight", "Scarletta Johansa", "thriller"),
                new Movie("Hacker", "Gwen Closet", "thriller"),
                new Movie("Dreaming about dreams", "Denzel Washton", "thriller"),
                new Movie("The Curious case of Ben the button", "Bradly Pitski", "thriller")
        );
    }

    @Test
    void isSubsetOf_whenNotASubset_thenReturnFalse() {
        boolean isSubset = thisMovieCatalog.isSubsetOf(otherMovieCatalog);

        assertThat(isSubset).isFalse();
    }

    @Test
    void isSubsetOf_whenASubset_thenReturnTrue() {
        boolean isSubset = thisMovieCatalog.isSubsetOf(
                new MovieCatalog("My Recently Favorite Movies")
                        .addMovie(new Movie("The flight", "Scarletta Johansa", "thriller"))
                        .addMovie(new Movie("Jimmy goes wild", "Bradly Pitski", "action"))
        );

        assertThat(isSubset).isTrue();
    }
}
