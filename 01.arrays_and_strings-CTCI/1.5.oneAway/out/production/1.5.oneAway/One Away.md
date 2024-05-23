> One Away: There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away. EXAMPLE pale, ple-> true pales, pale -> true pale, bale -> true pale, bae -> false

[[Cracking_The_Coding_Interview_Book.pdf#page=210&selection=8,0,40,5|Cracking_The_Coding_Interview_Book, page 210]]

## Solution
The key to this problem is break it down into sub problem / conditions. 
1. The condition to check if inserting the character solves the problem.
2. The condition to check if deleting the character solves the problem.
3. The condition to check if changing one character solves the problem.

Now that it's broken down into three steps, here how we can check it with two pointers.

**Insert**
1. Find which string is larger. Key to the condition.
1. Keep two pointers, both at the beginning of the string.
2. Check if values at pointers is same. Until they are not. 
3. When different, increment the larger pointer by one. and check again.
4. Make sure you flag it out that, so we don't try to do the insert once more. 
**Remove**
- It is fundamentally the same as Insert check, as if shorter string is one insert away from larger string, the larger string is one remove away from the shorter string.
**Change**
1. Keep the pointer and keep checking values.
2. Once a value is found, flag a Boolean and proceed.
3. If another value is found while Boolean is true, return false.

Now we understand we can check for insert and remove in one loop, only if there is a difference in length, or just check change condition if the length is the same.


## Test cases
"pale -> bale"
"apple -> aple"
"  -> aa "
