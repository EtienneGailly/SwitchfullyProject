# Graph Algorithms

_Disclaimer: This is an optional codelab for those who want an extra challenge._

> In computer science, graph traversal (also known as graph search) refers to the process of visiting (checking and/or updating) each vertex in a graph. It can be used for (e.g.) finding the shorted path between two vertices / nodes.
- https://en.wikipedia.org/wiki/Graph_traversal

Write an application which implements the depth-first and bread-first algorithms to traverse a graph. (do your research)

- A Graph consists of Nodes (or Vertices) and edges connecting those nodes
- A Node has a label and a list of child Nodes (connected by edges)
- A Node can have 0, 1 or more children

```text
    A __
   / \  \__
  /   \    \__
 /     \      \
B       C      D
       / \  
      /   \ 
     /     \ 
    E       F 
```

The application should provide a answer for the following problem: Given a starting Node, find the path to a goal Node

E.g.: Given above Graph, find a path from starting Node A to goal Node D
- Order of visited Nodes using Depth-first: A, B, C, E, F, D
- Order of visited Nodes using Bread-first: A, B, C, D 

## The application

1. Write implementations of Depth-first search and Bread-first search
2. Write a method which accepts a search algorithm, a Graph and a goal Node as arguments. 
This method should return the path (list / array of Nodes in the order in which they were visited).
    - We'll always have node A as our starting node

Use the following Graph (actually a Tree, which is an undirected Graph).
(Draw this graph on a piece of paper)

```text
A ---> B
A ---> C
A ---> D
A ---> E
A ---> F
B ---> G
B ---> H
F ---> I
H ---> J
H ---> K
C ---> L
C ---> M
M ---> N
M ---> O
O ---> P
O ---> Q
E ---> R
E ---> S
E ---> T
E ---> U
T ---> V
T ---> W
F ---> X
F ---> Y
Y ---> Z
```

Execute the following cases in your application
1. Starting Node A, goal Node S
2. Starting Node A, goal Node F
3. Starting Node A, goal Node K
