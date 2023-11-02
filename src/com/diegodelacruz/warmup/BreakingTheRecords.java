package com.diegodelacruz.warmup;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
        BreakingTheRecords.breakingRecords(scores);
    }


    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int highestScore = 0;
        int lowestScore = 0;
        int highestScoreCounter = 0;
        int lowestScoreCounter = 0;
        // Write your code here
        for (int i = 0; i < scores.size(); i++){
            int score = scores.get(i);

            if (highestScore == 0 && lowestScore == 0 && i == 0) {
                highestScore = score;
                lowestScore = score;
            } else {
                if (score > highestScore) {
                    highestScore = score;
                    highestScoreCounter++;
                }

                if (score < lowestScore) {
                    lowestScore = score;
                    lowestScoreCounter++;
                }
            }
        }
        System.out.println("Highest Score: " + highestScore + " " + "Lowest Score: " + lowestScore);
        System.out.println("highestScoreCounter: " + highestScoreCounter + " " + "lowestScoreCounter: " + lowestScoreCounter);
        return Arrays.asList(highestScoreCounter, lowestScoreCounter);
    }

}
