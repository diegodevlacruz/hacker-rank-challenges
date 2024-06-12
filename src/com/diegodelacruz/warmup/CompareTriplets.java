package com.diegodelacruz.warmup;

import static java.util.stream.Collectors.joining;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 * The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
 * If a[i] > b[i], then Alice is awarded 1 point.
 * If a[i] < b[i], then Bob is awarded 1 point.
 * If a[i] = b[i], then neither person receives a point.
 */

public class CompareTriplets {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY a
     * 2. INTEGER_ARRAY b
     */

    public static void main(String[] args) throws IOException {

        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);

        // List<Integer> result = CompareTriplets.compareTripletsRegular(a, b);
        List<Integer> result = CompareTriplets.compareTripletsStreams(a, b);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(joining(" "))
                + "\n");
    }

    // Using regular Java Sintaxis
    public static List<Integer> compareTripletsRegular(List<Integer> a, List<Integer> b) {
        int aItem = 0;
        int bItem = 0;

        for (int counter = 0; counter < a.size(); counter++) {
            if (a.get(counter) == b.get(counter)) {
                aItem += 0;
                bItem += 0;
            } else if (a.get(counter) > b.get(counter)) {
                aItem += 1;
            } else {
                bItem += 1;
            }
        }
        return Arrays.asList(aItem, bItem);
    }

    // Using streams
    public static List<Integer> compareTripletsStreams(List<Integer> a, List<Integer> b) {

        int aItem = IntStream.range(0, a.size())
                .map(i -> a.get(i) > b.get(i) ? 1 : 0)
                .sum();

        int bItem = IntStream.range(0, b.size())
                .map(i -> b.get(i) > a.get(i) ? 1 : 0)
                .sum();

        return Arrays.asList(aItem, bItem);
    }
}
