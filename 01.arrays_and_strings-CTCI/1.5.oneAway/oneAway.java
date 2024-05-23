public class oneAway {
    public static boolean checkInsertRemove(String longStr, String shortStr) {
        if (longStr.length() - shortStr.length() > 1) return false;
        int longPtr = 0, shortPtr = 0;
        boolean editHappened = false;
        while (longPtr < longStr.length() && shortPtr < shortStr.length()) {
            char longChar = longStr.charAt(longPtr), shortChar = shortStr.charAt(shortPtr);
            if (longChar == shortChar) {
                longPtr++;
                shortPtr++;
                continue;
            }
            if (editHappened) return false;
            longPtr++;
            editHappened = true;
        }
        return true;
    }

    public static boolean checkChange(String s, String t) {
        if (s.length() != t.length()) return false;
        int sPtr = 0, tPtr = 0;
        boolean editHappened = false;

        while (sPtr < s.length() && tPtr < t.length()) {
            char sChar = s.charAt(sPtr), tChar = t.charAt(tPtr);
            if (sChar == tChar) {
                sPtr++;
                tPtr++;
                continue;
            }
            if (editHappened) return false;
            sPtr++;
            tPtr++;
            editHappened = true;
        }
        return true;
    }

    public static boolean isOneEditAway(String s, String t) {
        if (s.length() > t.length()) {
            return checkInsertRemove(s, t);
        } else if (s.length() < t.length()) {
            return checkInsertRemove(t, s);
        } else {
            return checkChange(s, t);
        }
    }

    public static void main(String[] args) {
        String[][] testCases = {
                {"pale", "ple"},
                {"pales", "pale"},
                {"pale", "bale"},
                {"pale", "bae"},
                {"", ""},
                {"a", ""},
                {"", "a"},
                {"abc", "abcd"},
                {"abc", "ab"},
                {"abc", "abx"},
                {"abcdef", "abcdeg"},
                {"abcdef", "abcfeg"}
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
                true,
                true,
                false
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean result = isOneEditAway(testCases[i][0], testCases[i][1]);
            System.out.println("Test case " + (i + 1) + " (\"" + testCases[i][0] + "\", \"" + testCases[i][1] + "\"): " +
                    (result == expectedResults[i] ? "Passed" : "Failed"));
        }
    }
}
