package com.diegodelacruz.jajafeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Pregunta2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        for (int i = 0; i <= 3; i++) {
            list.add(i);
            Spliterator<Integer> split = list.spliterator();
            split.forEachRemaining(z -> System.out.println(z + " "));

        }
    }
}
