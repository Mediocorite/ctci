import java.util.HashMap;
import java.util.Map;
public class Valid_Palindrome {

public static boolean checkUnique(String str) {
			boolean isOddFound = false;
			Map<Character, Integer> map = new HashMap<>();
			for (char c: str.toCharArray()) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
			for (Map.Entry<Character, Integer> entry: map.entrySet()) {
				if (isOddFound && entry.getValue() % 2 > 0) {
					return false;
				} else if (entry.getValue() % 2 > 0) {
					isOddFound = true;
				} else continue;
			}
			return true;
		}
  public static void main(String[] args) {
    String str = "Tact Coa";
    System.out.println("This is result : " + checkUnique(str));
  }
}
