package Problems;


// Note: the problem statement say to only insert my code -> solution where I only add the code and change nothing else is
// in the OtherSolutions.StringCharacters class
public class Problem3 {

    public Problem3() {
        // loop over the characters in the string
        String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer" + " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles," + " and by opposing end them?";

        int vowels = countVowels(text);
        int consonants = countConsonants(text);
        int spaces = countSpaces(text);

        printProblem3Results(vowels, consonants, spaces);
    }

    private static void printProblem3Results(int vowels, int consonants, int spaces) {
        System.out.println("Problem 3");
        System.out.printf("The text containes:\n \t %d vowels\n \t %d consonants  \n \t %d spaces  \n", vowels, consonants, spaces);
        System.out.println("-----------------------------------");
    }

    private int countSpaces(String text) {
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }
        return spaces;
    }

    private int countVowels(String text) {
        int vowels = 0;
        String lowerCaseText = text.toLowerCase();

        for (int i = 0; i < lowerCaseText.length(); i++) {
            char c = text.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            }
        }

        return vowels;
    }

    private int countConsonants(String text) {
        int consonants = 0;
        String lowerCaseText = text.toLowerCase();

        for (int i = 0; i < lowerCaseText.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
                consonants++;
            }
        }

        return consonants;
    }
}
