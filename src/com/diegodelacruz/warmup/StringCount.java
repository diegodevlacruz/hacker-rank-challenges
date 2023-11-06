package com.diegodelacruz.warmup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCount {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> stringList = List.of("apple", "banana", "apple", "cherry", "banana", "apple");

        // Create a map to store the counts
        Map<String, Integer> countMap = new HashMap<>();

        // Iterate through the list and count occurrences
        for (String str : stringList) {
            if (countMap.containsKey(str)) {
                // If the string is already in the map, increment the count
                countMap.put(str, countMap.get(str) + 1);
            } else {
                // If the string is not in the map, add it with a count of 1
                countMap.put(str, 1);
            }
        }

        // Print the counts
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
