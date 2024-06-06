> Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.

[[Cracking_The_Coding_Interview_Book.pdf#page=220&selection=44,1,47,79|Cracking_The_Coding_Interview_Book, page 220]]

## Alternate problem 
[19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
Given the `head` of a linked list, remove the `nth` node from the end of the list and return its head.

Step one - Listen
- Important details
- The n represents the element point to be removed. 1 is last, 2 is second last ..
- There will at least be one element in the list according to constraints 
- The second integer will always be valid too.

Step two - Examples
- 1,2,3,4,5 ; n = 2 -> 1,2,3,5
- 1; n = 1 -> [] // Remove self
- 1,2 ; n = 1 -> [1] // Remove connection to last element.
- 1,2; n = 2 -> 2 // Removes head

Step three - brute force 
- Iterate the list once [O(n)] and find the length. Make sure the length is not zero indexed.
- position = length - n; (This is the point where you have make the edit.)
- if position is less than 1 -> Execute remove head process
	- head = head.next;
- if position is more than 1 -> execute edit at position
	- pointer.next = pointer.next.next;
	- Edge case - If there is no pointer.next.next
		- condition -> n = 1;
		- pointer.next = null;
- Time O(N), Space O(1)