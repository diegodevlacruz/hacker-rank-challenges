package com.diegodelacruz.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Given five positive integers, 
* find the minimum and maximum values 
* that can be calculated by summing 
* exactly four of the five integers. 
* Then print the respective minimum 
* and maximum values as a single line 
* of two space-separated long integers.
 */

public class MinMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void minMaxSum(List<Integer> arr) {
        // Write your code here

        int num = 0;
        int temp = 0;
        int max = 0;
        int min = 0;
        // 1. Iterate arrSize
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, 0);
            for (int j = 0; j < arr.size(); j++) {
                num += arr.get(j);
            }
            System.out.println(num);

            if (temp == 0) {
                temp = num;
            }

            if (num >= temp) {
                max = num;
            } else {
                min = num;
            }
            arr.set(i, i);
        }
        System.out.println(max + " " + min);

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 3, 4, 5);
        minMaxSum(arr);
    }

}
