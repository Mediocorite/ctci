import java.util.HashMap;
import java.util.Map;

public class validPalindrome {
    public static boolean isPermutationOfPalindrome(String s) {
        // Very important to understand the input constraints
        // Lets imagine if numbers were also allowed.
        int range = (int) "z".charAt(0) - (int) "0".charAt(0);
        int[] counter = new int[range];
        boolean oddFound = false; // only one chance for odd to exists
        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) continue;
            int cCode = (int) Character.toLowerCase(c) - "0".charAt(0);
            counter[cCode]++;
        }
        for (int count : counter) {
            if (count % 2 == 1) {
                // Odd found
                if (oddFound) return false;
                oddFound = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {
                "Tact Coa",
                "A man a plan a canal Panama",
                "No lemon no melon",
                "Hello",
                "Racecar",
                " ",
                "aaa",
                "aabbccdde",
                "119911",
                "1921213",
                "67675552323"
        };

        boolean[] expectedResults = {
                true,
                true,
                true,
                false,
                true,
                true,
                true,
                true,
                true,
                false,
                true
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean result = isPermutationOfPalindrome(testCases[i]);
            System.out.println("Test case " + (i + 1) + " (\"" + testCases[i] + "\"): " + (result == expectedResults[i] ? "Passed" : "Failed"));
        }
    }
}
