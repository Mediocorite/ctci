> Sum Lists: You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order,such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list. EXAMPLE Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295. Output: 2 -> 1 -> 9. That is,912. FOLLOW UP Suppose the digits are stored in forward order. Repeat the above problem. Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295. Output: 9 -> 1 -> 2.That is, 912.

[[Cracking_The_Coding_Interview_Book.pdf#page=225&selection=6,0,53,18|Cracking_The_Coding_Interview_Book, page 225]]

### Listen 
- It feels like we must do addition traditionally as well.
- Think of how you would like to carry forward values when adding.
## Example 
7 -> 1 -> 6
5 -> 9 -> 2

Add 7 and 5 % 10 -> 2 with carry over 1;

Solution -
Your original solution had three while loop doing lot of repeated work. Things to remember next time is as follows ->
1. If you don't have to return or reuse the original input linked lists, try to use them as pointers only.
2. Try to do most amount of work in one loop.

Java code - 
```java
/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode() {}

 *     ListNode(int val) { this.val = val; }

 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 * }

 */

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);

        ListNode pointer = result;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int value1 = (l1 != null) ? l1.val : 0;

            int value2 = (l2 != null) ? l2.val : 0;

  

            int sum = value1 + value2 + carry;

            pointer.next = new ListNode(sum%10);

            pointer = pointer.next;

            carry = sum >= 10 ? 1 : 0;

  

            if (l1 != null) l1 = l1.next;

            if (l2 != null) l2 = l2.next;

  

        }

        return result.next;

    }

}
```

