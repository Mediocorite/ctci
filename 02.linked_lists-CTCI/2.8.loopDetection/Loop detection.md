> Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop. DEFINITION Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list. EXAMPLE Input: Output: SOLUTION A - > B - > C - > D - > E - > C [the same C as earlier] C

[[Cracking_The_Coding_Interview_Book.pdf#page=234&selection=125,1,170,1|Cracking_The_Coding_Interview_Book, page 234]]

# Solution
Implement the fast and slow runner algorithm. Don't need to remember why exactly they will always meet. Run with the feeling they always will.