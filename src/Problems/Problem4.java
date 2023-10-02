package Problems;

import java.util.Arrays;

public class Problem4 {
    public Problem4() {
        String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer" + " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles," + " and by opposing end them?";

        // remove the punctuation from the words
        text = text.replaceAll("[^a-zA-Z ]", "");

        // convert the text to lowercase
        text = text.toLowerCase();

        // a word is: a sequence of characters without spaces
        String[] words = text.split(" ");

        // remove duplicate words
        words = Arrays.stream(words).distinct().toArray(String[]::new);

        // sort the words in alphabetical order
        Arrays.sort(words);
        // sortArrayUsingBubbleSort(words);

        // print the words
        printProblem4Results(words);
    }

    private static void printProblem4Results(String[] words) {
        System.out.println("Problem 4");
        System.out.println(Arrays.toString(words));
        System.out.println("-----------------------------------");
    }

    private static void sortArrayUsingBubbleSort(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }
}
