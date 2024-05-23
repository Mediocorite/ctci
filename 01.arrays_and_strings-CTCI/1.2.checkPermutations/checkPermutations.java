public class checkPermutations {

    public static boolean checkPermutations(String s, String t) {
        int rangeOfValidCharacter = (int)"z".charAt(0) - (int)"A".charAt(0);
        int[] characterCounter = new int[rangeOfValidCharacter];
        for (char sLetter: s.toCharArray()) {
            if (!Character.isAlphabetic(sLetter)) continue;
            int sCode = ((int)sLetter) - ("A".charAt(0)) - 1;
            characterCounter[sCode]++;
        }
        for (char tLetter: t.toCharArray()) {
            if (!Character.isAlphabetic(tLetter)) continue;
            int tCode = ((int)tLetter) - ("A".charAt(0)) - 1;
            characterCounter[tCode]--;
            if (characterCounter[tCode] < 0) return false;
        }
        for (int count: characterCounter) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] testCases = {
                {"abc", "bca"},
                {"abc", "def"},
                {"abcd", "abc"},
                {"aabbcc", "bbaacc"},
                {"", ""},
                {"a", "a"},
                {"a", "b"},
                {"dog ", " god"},
                {"Dog", "god"},
                {"abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba"},
                {"aabbcc", "abcabcabc"}
        };

        boolean[] expectedResults = {
                true,
                false,
                false,
                true,
                true,
                true,
                false,
                true,
                false,
                true,
                false
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean result = checkPermutations(testCases[i][0], testCases[i][1]);
            System.out.println("Test case " + (i + 1) + " (" + testCases[i][0] + ", " + testCases[i][1] + "): " + (result == expectedResults[i] ? "Passed" : "Failed"));
        }
    }
}
