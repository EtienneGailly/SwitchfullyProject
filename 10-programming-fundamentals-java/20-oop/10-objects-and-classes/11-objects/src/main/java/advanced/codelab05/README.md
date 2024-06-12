# Java Time

Up until Java 8, the way to create dates and time objects in Java was done using the `Date` and `Calendar` API's 
(classes) which reside in `java.util`.

Generally speaking, this API was a bit a pain in the ass... Many developers switched to external libraries such 
as `Joda-Time`, to get the job - of creating dates and time objects in Java - done properly.

As part of JDK 8 (and up) a new time and date API was added: the `java.time` API. A huge improvement over the previous API, 
which closely resembles Joda-Time (as of JDK 8, you should always chose `java.time` over `Joda-Time`).

You can inspect what is offered in the `Java Time` API by surfing to the official documentation,
do that now and explore the different available classes:
- https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/time/package-summary.html

Then, try out the following tutorial. Make the examples here, in a class (with a `main` method) you create yourself:
- https://www.baeldung.com/java-8-date-time-intro

Then, if you like, follow the official oracle lessons on the Java Time API:
1. https://docs.oracle.com/javase/tutorial/datetime/overview/index.html
2. https://docs.oracle.com/javase/tutorial/datetime/iso/index.html
