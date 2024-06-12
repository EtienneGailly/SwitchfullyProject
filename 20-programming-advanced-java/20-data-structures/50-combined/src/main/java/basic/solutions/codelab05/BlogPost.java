package basic.solutions.codelab05;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BlogPost {

    private Author author;
    private String title;
    private String body;
    private Category category;
    private LocalDateTime creationDate;

    public BlogPost(Author author, String title, String body, Category category) {
        this.author = author;
        this.title = title;
        this.body = body;
        this.category = category;
        this.creationDate = LocalDateTime.now();
    }

    Author getAuthor() {
        return author;
    }

    Category getCategory() {
        return category;
    }

    Set<String> getUniqueWordsFromBody() {
        return new HashSet<>(Arrays.asList(body.split(" ")));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogPost blogPost = (BlogPost) o;
        return Objects.equals(author, blogPost.author) &&
                Objects.equals(title, blogPost.title) &&
                Objects.equals(body, blogPost.body) &&
                category == blogPost.category &&
                Objects.equals(creationDate, blogPost.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, body, category, creationDate);
    }
}
