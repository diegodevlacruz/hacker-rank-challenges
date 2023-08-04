package com.diegodelacruz.warmup;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/*
 * Instructions:
 * Complete the simpleArraySum function code below.
 * It must return the sum of the array elements as an integer.
 */
public class ArraySum {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int s = 0;
        for (int a : ar) {
            s += a;
        }
        return s;
    }

    public static int simpleArraySumWithStream(List<Integer> ars) {
        return ars.stream()
                .mapToInt(Integer::intValue)
                .sum();

    }

    public static void main(String[] args) throws IOException {
        List<Integer> ar = Arrays.asList(2, 3, 4, 10, 11);
        //int result = ArraySum.simpleArraySum(ar);
        int result = simpleArraySumWithStream(ar);
        System.out.println(result);
    }

}
