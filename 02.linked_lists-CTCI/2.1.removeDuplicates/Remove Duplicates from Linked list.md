> Remove Dups: Write code to remove duplicates from an unsorted linked list. FOLLOW UP How would you solve this problem if a temporary buffer is not allowed?

[[Cracking_The_Coding_Interview_Book.pdf#page=219&selection=5,1,10,70|Cracking_The_Coding_Interview_Book, page 219]]

## Solution
If we have the ability to keep space, we can use a hash table to keep track of values we visited. 

**Pseudocode -**
- Create a hash table to add items.
- Iterate the linked list, adding items until duplicate found
- copy over the next data onto to the current node.
- proceed.
**Space -** O(N) **Time -** O(N)

If we cannot keep the space, we must keep two pointers, that keep removing everything together.