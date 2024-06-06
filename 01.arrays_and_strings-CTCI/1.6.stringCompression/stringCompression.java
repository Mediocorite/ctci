public class stringCompression {
    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        int currentCount = 1;
        char currentChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == currentChar) {
                currentCount++;
            } else {
                result.append(currentChar);
                result.append(currentCount);
                currentChar = c;
                currentCount = 1;
            }
        }
        result.append(currentChar);
        result.append(currentCount);

        return str.length() <= result.length() ? str : result.toString();
    }

    public static void main(String[] args) {
        testStringCompression();
    }

    public static void testStringCompression() {
        // Test case 1: Basic compression
        assert compressAndPrint("aabcccccaaa", "a2b1c5a3");

        // Test case 2: No compression needed (original string shorter)
        assert compressAndPrint("abc", "abc");

        // Test case 3: All characters the same
        assert compressAndPrint("aaaaaa", "a6");

        // Test case 4: Single character
        assert compressAndPrint("a", "a");

        // Test case 5: Empty string
        assert compressAndPrint("", "");

        // Test case 6: Mixed case characters
        assert compressAndPrint("aAaAaA", "aAaAaA");

        // Test case 7: String with numbers
        assert compressAndPrint("aaabbbccc111", "a3b3c3111");

        System.out.println("All test cases passed!");
    }

    public static boolean compressAndPrint(String input, String expectedOutput) {
        String result = stringCompression.compress(input);
        if (!result.equals(expectedOutput)) {
            System.out.println("Test failed for input: " + input);
            System.out.println("Expected: " + expectedOutput + ", but got: " + result);
            return false;
        }
        return true;
    }
}
