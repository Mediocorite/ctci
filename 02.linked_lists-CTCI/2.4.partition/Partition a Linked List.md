> Partition: Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x. If x is contained within the list the values of x only need to be after the elements less than x (see below). The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions. EXAMPLE Input: 3 -> 5 -> 8 -> 5 -> 10-> 2 -> 1 [partition= 5] Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8

[[Cracking_The_Coding_Interview_Book.pdf#page=223&selection=10,0,69,1|Cracking_The_Coding_Interview_Book, page 223]]

## Step one Listen
The Linked list should not be sorted. Think of it simply as working with two linked list. Keep adding values to each of them in a decent manner.

## Step two Examples
3 5 8 5 10 2 1
3 2 1 5 8 5 10

0
0

3 5 5 5 

## Step three Brute force
Create two linked lists
Iterate the main linked list. If lower than x add to small linked list, if larger or equal add to to the end of linked list.

## Solution 
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

    public ListNode partition(ListNode head, int x) {

        if (head == null || head.next == null) return head;

        ListNode first = new ListNode(0), firstPtr = first;

        ListNode second = new ListNode(0), secondPtr = second;

        while (head != null) {

            if(head.val < x) {

                firstPtr.next = new ListNode(head.val);

                firstPtr = firstPtr.next;

            } else {

                secondPtr.next = new ListNode(head.val);

                secondPtr = secondPtr.next;

            }

            head = head.next;

        }

        if (first.next == null) {

            second = second.next;

            return second;

        }

        firstPtr.next = second.next;

        return first.next;

    }

}
```