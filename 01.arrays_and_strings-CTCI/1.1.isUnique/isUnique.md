> Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

[[Cracking_The_Coding_Interview_Book.pdf#page=203&selection=5,1,9,38|Cracking_The_Coding_Interview_Book, page 203]]

Solution:

When the question asks us to check for uniqueness, that tells us we need to store the characters in some memory to keep checking back. 
Here are our options:
1. Hash Set -> Very convenient Option and can be used in a more complex problem. However, we don't need such a complicated data structure for such a simple problem. We are not following the key principle of making the optimal solution for the problem.
2. Boolean Array for the character -> As we are dealing with a fixed input (i.e. valid characters) we can represent them as a Boolean array. Simply mark the value representing the character we are on and we reduce the space complexity a huge margin (it still be O(c) in both hash set and Boolean array but it still reduces the fixed space being used.) One issue is we need to understand the question deeper to develop the suitable solution. In this case, knowing if the string is ASCII or Unicode is fundamental as we have to initialize the boolean array that can represent all valid characters. (128 in ASCII and much more in Unicode.)
3. Bit Vector -> We can further reduce the space by the factor of 8 if we use a bit vector to map our 