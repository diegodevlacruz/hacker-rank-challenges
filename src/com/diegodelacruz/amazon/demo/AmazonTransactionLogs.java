package com.diegodelacruz.amazon.demo;

import java.util.*;

/**
 * Your Amazonian team is responsible for maintaining a monetary transaction service.
 * The transactions are tracked in a log file.
 * A log file is provided as a string array where each entry represents a transaction to service. Each transaction consists of:
 * -   sender_user id. Unique identifier for the user that initiated the transaction. It consists of only digits with at most 9 digits.
 * -   recipient_user id: Unique identifier for the user that is receiving the transaction. It consists of only digits with at most 9 digits.
 * -   amount of transaction: The amount of the transaction. It consists of only digits with at most 9 digits.
 * The values are separated by a space. For example, "sender user id recipient user id amount of transaction".
 * Users that perform an excessive amount of transactions might be abusing the service so you have been tasked to identify the users that have a number of transactions over a threshold. The list of user ids should be ordered in ascending numeric value.
 * Example
 * logs = ["88 99 200", "88 99 300", "99 32 100", " 12 12 154]
 * threshold = 2
 */
public class AmazonTransactionLogs {

    public static void main(String[] args) {

        List<String> logs = Arrays.asList("88 99 200", "88 99 300", "99 32 100", "12, 12 15");
        int threshold = 2;

        AmazonTransactionLogs.processLogs(logs, threshold);
    }

    public static List<String> processLogs(List<String> logs, int threshold) {
        List<String> senderCount = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String v : logs) {
            String[] arr = v.split(" ");
            senderCount.add(arr[0]);
        }

        Map<String, Integer> countCoincidences = new HashMap<>();

        for (String sender : senderCount) {
            if (countCoincidences.containsKey(sender)) {
                countCoincidences.put(sender, countCoincidences.get(sender) + 1);
                for (Map.Entry<String, Integer> entry : countCoincidences.entrySet()) {
                    if (entry.getValue() > threshold) {
                        result.add(entry.getValue().toString());
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
