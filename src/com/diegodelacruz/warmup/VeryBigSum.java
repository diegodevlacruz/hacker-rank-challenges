package com.diegodelacruz.warmup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * In this challenge, you are required to calculate and print the sum of
 * the elements in an array, keeping in mind that some of those integers
 * may be quite large.
 */
public class VeryBigSum {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long a = 0;
        for (long ab : ar) {
            a += ab;
        }
        return a;
    }


    public static void main(String[] args) {

        List<Long> ar = new ArrayList<>();
        ar.add(1000000001L);
        ar.add(1000000002L);
        ar.add(1000000003L);
        ar.add(1000000004L);
        ar.add(1000000005L);
        long result = VeryBigSum.aVeryBigSum(ar);
        System.out.println(result);

    }
}
