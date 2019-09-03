package com.oppalove.collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

/**
 * This class is for getting value as randomly using the specified weighted percentage.
 */
public class WeightedRandomCollection<E> {

    private final NavigableMap<Double, E> naviMap = new TreeMap<Double, E>();
    private final Random random;
    private double total = 0.0d;

    public WeightedRandomCollection() {
        this(new Random());
    }

    public WeightedRandomCollection(Random random) {
        this.random = random;
    }

    /**
     * Add value with weight and value.
     *
     * @param weight double value which represent to percentage.
     * @param value  value that you want to get.
     */
    public void add(double weight, E value) {
        if (weight <= 0) throw new IllegalArgumentException("The weight value is greater than 0.");
        total += weight;
        naviMap.put(total, value);
    }

    /**
     * Return results based on percentage.
     *
     * @return value of the collection.
     */
    public E get() {
        double value = random.nextDouble() * total;
        Map.Entry<Double, E> ceilingEntry = naviMap.ceilingEntry(value);
        if (ceilingEntry != null) return ceilingEntry.getValue();
        else return null;

    }
}
