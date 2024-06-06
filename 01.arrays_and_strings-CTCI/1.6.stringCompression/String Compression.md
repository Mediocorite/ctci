> String Compression: Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z)

[[Cracking_The_Coding_Interview_Book.pdf#page=212&selection=74,1,80,95|Cracking_The_Coding_Interview_Book, page 212]]

## Solution
There are many ways to solve this. Creating a counter map would also work, but it will take up some space. To be honest, we only need to keep count for the current character, attach it to a second string and move forward.
This will make the space complexity O(N + K) where k is the number of unique characters (it would take 2K space at least), if we use the classic java concatenation, as it copies over a new string each time.

A better approach would be using the String builder that lets us operate with O(N)

**Pseudocode**
- Create a string builder and a counter.
- Loop the string with i.
- For every 


**Complexity**
- Time - **O(N)**