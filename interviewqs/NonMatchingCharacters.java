package a.common.java.interviewqs;

import java.util.HashSet;
import java.util.Set;

public class NonMatchingCharacters {

    public static Set<Character> findNonMatchingCharacters(String str1, String str2) {
        Set<Character> nonMatchingChars = new HashSet<>();

        // Add all characters from str1 to the set
        for (char c : str1.toCharArray()) {
            nonMatchingChars.add(c);
        }

        // Remove characters that are found in str2
        for (char c : str2.toCharArray()) {
            if (nonMatchingChars.contains(c)) {
                nonMatchingChars.remove(c);
            } else {
                nonMatchingChars.add(c);
            }
        }

        return nonMatchingChars;
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "acdfgh";

        Set<Character> nonMatchingChars = findNonMatchingCharacters(str1, str2);

        System.out.println("Non-matching characters: " + nonMatchingChars);
    }
}

