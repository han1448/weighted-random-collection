# Weighted Random Collection
The weighted random collection is the collection to get the value randomly by weighted value.

# Usage
### Create Instance
```java
WeightedRandomCollection<String> collection = new WeightedRandomCollection<>();
```

### Add element
```java
collection.add(5, "This is 50%!!!!!");
collection.add(3, "This is 30%!!!");
collection.add(2, "This is 20%!");
```

### Get element
```java
collection.get();
```

### Play
#### Run
```java
// Since we use a random function, we will get different results each time.
        IntStream.range(1,10)
                .forEach(i-> System.out.println(collection.get()));

```
#### Results
```text
This is 30%!!!
This is 50%!!!!!
This is 30%!!!
This is 20%!
This is 30%!!!
This is 50%!!!!!
This is 50%!!!!!
This is 30%!!!
This is 50%!!!!!
```