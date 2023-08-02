package com.diegodelacruz.warmup;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

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

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = ArraySum.simpleArraySum(ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
