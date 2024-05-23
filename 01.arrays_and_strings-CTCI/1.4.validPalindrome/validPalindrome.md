> Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words. EXAMPLE Input: Tact Coa Output: True (permutations: "taco cat'; "atc o eta·; etc.)

[[Cracking_The_Coding_Interview_Book.pdf#page=206&selection=177,0,195,11|Cracking_The_Coding_Interview_Book, page 206]]

## Solution
The key idea is to check the condition. How can we know if a string is palindrome. There are two ways - 
1. Find the permutation where we can move two pointers (left and right) and check if they are true. Unfortunately this is an O(N!) operation.
2. If we remember [[cracking_the_coding_interview/01.arrays_and_strings-CTCI/1.2.checkPermutations/Check Permutations|Check Permutations]], we can use a character counter when it comes to permutations. Understanding the key fundamental condition for a palindrome is vital. 
The condition is: **All character counts must be even. If there are odd number of characters, only one character can be of odd.**

**Pseudocode -**
- Create a character counter (remember to ask interviewer the nature of the problem, i.e. are capitals different etc.)
- Iterate the string and update the counter (in this case we can ignore all non-alphabetic characters.)
- Now loop over the counter, if a odd value is found, flag it. If it is found again, return false
**Complexity -**
- **Space -** **O(1)** or **O(c)** where c is the unique characters applicable to the problem.
- **Time -** **O(N)** where N is the length of the string.