import java.util.HashSet;

public class isUnique {

    public static boolean isUniqueWithHashSet(String str) {
       HashSet<Character> set = new HashSet<>();
       for (char letter : str.toCharArray()) {
           if (!Character.isAlphabetic(letter)) continue;
           if (set.contains(letter)) return false;
           set.add(letter);
       }
       return true;
    }

    public static boolean isUniqueWithBooleanArray(String str) {
        // Ask interviewer what constitudes as unique. is a same as A.
        // We will assume in this case it is.
        boolean[] flags = new boolean[26];
        for (char c: str.toCharArray()) {
            if(!Character.isAlphabetic(c)) continue;
            int cCode = ((int) Character.toLowerCase(c)) - "a".charAt(0);
            if(flags[cCode]) return false;
            flags[cCode] = true;
        }
        return true;
    }
    public static boolean isUniqueWithBitVector(String str) {
        return false;
    }
    public static void main(String[] args) {
        String[] testCases = {
                "abcdefg",
                "hello",
                "",
                "a",
                "AbCdEfG",
                "a b c d e f g",
                "abc!@#",
                "aaaaaa",
                "abcdefghijklmnopqrstuvwxyz",
                "abcdefghijklmnopqrstuvwxyza"
        };

        boolean[] expectedResults = {
                true,
                false,
                true,
                true,
                true,
                true,
                true,
                false,
                true,
                false
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean resultWithHashSet = isUniqueWithHashSet(testCases[i]);
            boolean resultWithBooleanArray= isUniqueWithBooleanArray(testCases[i]);
            boolean resultWithBitVector = isUniqueWithBitVector(testCases[i]);
            System.out.println("HashSet Test case " + (i + 1) + " (" + testCases[i] + "): " + (resultWithHashSet == expectedResults[i] ? "Passed" : "Failed"));
            System.out.println("Boolean Array Test case " + (i + 1) + " (" + testCases[i] + "): " + (resultWithBooleanArray == expectedResults[i] ? "Passed" : "Failed"));
            System.out.println("Bit Vector Test case " + (i + 1) + " (" + testCases[i] + "): " + (resultWithBitVector == expectedResults[i] ? "Passed" : "Failed"));
        }
    }
}
