package basic.solutions.codelab05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Blog {

    private final List<BlogPost> blogPosts;

    public Blog(List<BlogPost> blogPosts) {
        this.blogPosts = blogPosts;
    }

    public void addBlogPost(BlogPost blogPost) {
        this.blogPosts.add(blogPost);
    }

    Map<Author, List<BlogPost>> getBlogPostsPerAuthor() {
        HashMap<Author, List<BlogPost>> blogPostsPerAuthor = new HashMap<>();
        for(BlogPost blogPost: blogPosts) {
            List<BlogPost> postsOfAuthor = blogPostsPerAuthor.get(blogPost.getAuthor());
            if(postsOfAuthor != null) {
                postsOfAuthor.add(blogPost);
            } else {
                blogPostsPerAuthor.put(blogPost.getAuthor(), new ArrayList<>(List.of(blogPost)));
            }
        }
        return blogPostsPerAuthor;
    }

    BlogPost suggestABlogPost() {
        return blogPosts.get(blogPosts.size()-1);
    }


}
