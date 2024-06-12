# Blog

We're going to create a Blog application

## BlogPost

A `BlogPost` has the following state
- An `Author`
- A title
- A body
- A `Category`
  - Funny, DIY, Beauty, Gaming, Movies, Series
- A creationDate

A `BlogPost` has the following behavior
- A method to get all the unique words from the body (as a collection).
    - E.g.: if the body contains text "A very short and a very silly post", then the method returns {"a", "very", "short", "and", "silly", "post"}

An additional remark for the `Author`:
- Make sure that each author has a unique identifier. The simplest way is to generate a UUID.
  - https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/UUID.html
- Both equality and hash code can be calculated purely on this UUID, without taking any other state of `Author` into account, since its literally a unique identifier (ID). It uniquely identifies an author...

## Blog

A Blog has the following state
- A group of BlogPosts

A Blog has the following behavior
- A method for getting all the BlogPosts per Author (`getBlogPostsPerAuthor`). 
- A method `suggestABlogPost` which returns the most recent BlogPost (thus, sorted on its creationDate, descending, and then the first element)