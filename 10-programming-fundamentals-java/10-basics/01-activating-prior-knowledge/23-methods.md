# Which part of the following method is it's signature?
```java
        public void printName(String name){
            System.out.println("Hello my name is: " + name)
        }
```

# Will the following method pairs be in conflict with each other?

1. 
```java
        public int printName(String name){
            return System.out.println(name);
        }
```
and
```java
        public double printName(int number){
            return System.out.println(name);
        }
```


2. 
```java
        public int sum(int left, int right){
            return left + right;
        }
```
and
```java
        public double sum(int left, int right){
            return (double) left + right;
        }
```

3.
```java
        public int sum(int left, int right){
            return left + right;
        }
```
and
```java
        public double sumDouble(int left, int right){
            return (double) left + right;
        }
```
