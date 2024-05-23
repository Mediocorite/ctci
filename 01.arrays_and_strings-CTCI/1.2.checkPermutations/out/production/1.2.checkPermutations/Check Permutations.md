> Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.

[[Cracking_The_Coding_Interview_Book.pdf#page=204&selection=88,0,91,6|Cracking_The_Coding_Interview_Book, page 204]]

## Solutions

### Brute force
**Pseudocode -**
-> Compute all the possibilities of string one and store it on set.
-> Check if string two exists in the set. 

**Complexity -** 
- **Generating permutations:** Generating all permutations of a string of length NNN has a time complexity of **O(N!)**.
- **Checking membership:** Checking if the second string exists in the set of permutations would have an additional **O(1)** time for each check, but since there are N!N!N! permutations, this operation is still dominated by **O(N!)**.

## Using a counter
**Pseudocode -** 
-> Create map with character and count for first string 
-> Iterate second string and start removing the count at every point. (if count falls bellow 0, exit early.)
-> Finally iterate all the values of the map and check if any value is 0.
**Complexity - **
- **First pass** -> Creating the map will be **O(N)** operation as fixed number of steps are happening at every character, computation depending on the character length.
- **Second pass** -> Similarly second pass will be **O(N)** as well.
- **Third pass** -> Yet again another **O(N)** computation.
**Final complexity -> O(N) + O(N) + O(N) -> O(N)**
**Optimization - **
- Instead of a map, if we know the character length we can use an integer array to keep track of the counts. 
- Important to ask interviewer what is permitted in the input string. If the characters are of UNICODE, it might be still better to use a String.