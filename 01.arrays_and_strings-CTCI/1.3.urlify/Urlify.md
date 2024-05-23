> URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.) EXAMPLE Input: "Mr John Smith ", 13 Output: "Mr%20John%20Smith"

[[Cracking_The_Coding_Interview_Book.pdf#page=205&selection=134,1,158,19|Cracking_The_Coding_Interview_Book, page 205]]

## Solution
We need to use the space given in the string to solve this problem (remember there is extra space at the end of the string.) The key is to iterate from the last letter of the string and copy it over to the last space. That way when we encounter a space, we can use the extra space and not be worried about writing over the characters.

**Pseudocode -**
- Find the last letter in the string (we are given the length of the true string.)
- Create two pointers -> One to point at the end of the string and one to point to end of true string.
- Copy from true string pointer to end of the string pointer. When encountered a space, copy over %20 instead.

**Complexity -**
- **Space -** Because we are using the same string and not creating a new string it is **O(1)** 
- **Time -** **O(N)** with N being length of the string.