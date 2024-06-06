> Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.

[[Cracking_The_Coding_Interview_Book.pdf#page=232&selection=3,1,9,40|Cracking_The_Coding_Interview_Book, page 232]]

## Listen 
First we need to make sure we are comparing the node it self and not the value. In the given examples if the nodes is not referenced, the intersection will return false.

Another constraint is we cannot edit, at least the shape of the linked list. We can maybe flag the values but I don't think we will need to.

## Brute force
The idea is to first understand the intersection guarantees one thing, the last element of both the list are same. 

Another thing to keep in mind is that two linked lists are not the same lenght. However if we just skip the difference from the longer list, we can traverse the both list at the same time and find the node that it intersects with.

Here is the psuedocode 
1. Find the length of both list and get to final nodes.
2. If the final nodes aren't same, return immediately.
3. Start another loop. Advance the longer list with the difference.
4. Return first intersection. 
5. Or else return nothing.

Mistakes -
- Forgot to decrement zero. Always ensure to check if the boolean value every changes in a while loop.
- Didn't read problem properly. Need to return null in false case.

```java
/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) {

 *         val = x;

 *         next = null;

 *     }

 * }

 */

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = 1, lenB = 1;

        ListNode ptrA = headA, ptrB = headB;

        while (ptrA.next != null) {

            lenA++;

            ptrA = ptrA.next;

        }

        while (ptrB.next != null) {

            lenB++;

            ptrB = ptrB.next;

        }

        if (ptrA != ptrB) return null;

        ptrA = headA;

        ptrB = headB;

        if (lenA > lenB) {

            int difference = lenA - lenB;

            while(difference != 0) {

                ptrA = ptrA.next;

                difference--;

            }

        } else {

           int difference = lenB - lenA;

            while(difference != 0) {

                ptrB = ptrB.next;

                difference--;

            }

        }

  

        while(ptrA != null && ptrB != null) {

            if (ptrA == ptrB) return ptrA;

            ptrA = ptrA.next;

            ptrB = ptrB.next;

        }

  

        return null;

  

    }

}
```