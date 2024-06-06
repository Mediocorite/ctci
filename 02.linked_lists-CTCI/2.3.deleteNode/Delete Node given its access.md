> Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node. EXAMPLE lnput:the node c from the linked list a->b->c->d->e->f Result: nothing is returned, but the new linked list looks like a->b->d- >e->f

[[Cracking_The_Coding_Interview_Book.pdf#page=222&selection=89,0,96,78|Cracking_The_Coding_Interview_Book, page 222]]

## Solution
In a singly linked list you cannot traverse backwards. Traditionally removing the connection from the previous node to current next node will solve the problem.

A cool solution is to copy over information from the next node to the current node, effectively removing the next node as well (becuase we will copy the next value as well.)

```java
/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */

class Solution {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;

        node.next = node.next.next;

    }

}
```