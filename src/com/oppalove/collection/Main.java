package com.oppalove.collection;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        WeightedRandomCollection<String> collection = new WeightedRandomCollection<>();
        collection.add(5, "This is 50%!!!!!");
        collection.add(3, "This is 30%!!!");
        collection.add(1, "This is 10%!");


        // Since we use a random function, we will get different results each time.
        IntStream.range(1,10)
                .forEach(i-> System.out.println(collection.get()));
    }
}
