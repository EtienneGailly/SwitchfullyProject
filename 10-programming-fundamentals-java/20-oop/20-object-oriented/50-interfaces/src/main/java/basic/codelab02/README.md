# Clickable & downloadable

Inspect the already existing classes `Button`, `Image` and `Table`.
We want to add some additional behavior. More specifically, we want to add specific behavior as described by an interface.

## To click or not to click

Create an interface `Clickable` that defines the following method(s):
- `String click()`
- `String doubleClick()`

Classes `Button` and `Image` are both `Clickable`, make sure this is translated into the code!
- *For the implementation of the `click()` and `doubleClick()` method, you can be as creative as you want.*
    - But, it can be a simple as returning String values `"click"` and `"doubleclick"`

## Download

Create an interface `Downloadable` that defines the following method(s):
- `String download()`

Classes `Image` and `Table` are both `Downloadable`.
- For the implementation of the `download()` method, let the `Image` class return the `url`. The `Table` class should return a textual 2D representation of itself.

## Browser

Create a `Browser` class (not in the package `elements`).

In it, create the following method:
- Class method `multiDownload(Downloadable[] elementsToDownload` which loops over the `elementsToDownload` array and downloads every element.

## Execute

Finally, create a `main` method and call the `multiDownload` method with an array that contains both `Image` and `Table` objects.

## Interface

We could, technically, have solved this by using an abstract class instead of interfaces.
E.g.: An abstract `Element` class that had 3 abstract methods (`click`, `doubleClick` and `download`). However, in that scenario, 
our `Button` class would have a `download` method as well, it would have been inherited. Sames goes for `Table`, it would have become `clickable`.

That issue is solvable as well, but then our inheritance tree would become deeper (and deeper) which often results in code become less and less flexible (as the tree grows deeper).

For this particular assignment (but also often in similar or related issues), small and multiple interfaces are our best tool for the job.
