public class urlify {
    public static char[] urlify(char[] str, int trueLength){
        // We need to make sure the true Lenght is actually valid.
        int arrayPointer = str.length - 1, stringPointer = trueLength - 1;
        for (stringPointer = trueLength - 1; stringPointer >= 0; stringPointer--) {
            char charAtString = str[stringPointer];
            if (Character.isAlphabetic(charAtString)) {
                str[arrayPointer] = charAtString;
                arrayPointer--;
            } else {
                str[arrayPointer] = '0';
                str[arrayPointer - 1] = '2';
                str[arrayPointer - 2] = '%';
                arrayPointer -= 3;
            }

        }
        return str;
    }
    public static void main(String[] args) {
        String[] testCases = {
                "Mr John Smith    ",
                "Hello World  ",
                "   ",
                "NoSpaces",
                "EndsWithSpace   ",
        };

        int[] trueLengths = {
                13,
                11,
                1,
                8,
                14
        };

        String[] expectedResults = {
                "Mr%20John%20Smith",
                "Hello%20World",
                "%20",
                "NoSpaces",
                "EndsWithSpace%20",
        };

        for (int i = 0; i < testCases.length; i++) {
            char[] str = testCases[i].toCharArray();
            urlify(str, trueLengths[i]);
            String result = new String(str);
            System.out.println("Test case " + (i + 1) + " (\"" + testCases[i] + "\", " + trueLengths[i] +  "\", " + result + "): " + (result.trim().equals(expectedResults[i]) ? "Passed" : "Failed"));
        }
    }
}
