package string.problems;

import java.util.HashMap;

class DuplicateWords {


    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String data = "Java is a programming language . Java is also an island of indonesia . Java is widely used language in development .";

        String[] splittedData = data.split(" ");

        HashMap<String, Integer> occurences = new HashMap<>();

        for (String splittedDatum : splittedData) {
            Integer previousCount = occurences.get(splittedDatum);
            if (previousCount == null) {
                previousCount = 0;
            }

            occurences.put(splittedDatum, previousCount + 1);
        }

        System.out.println(occurences);

        System.out.println(occurences.get("Java"));


    }
}