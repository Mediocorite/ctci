> Palindrome: Implement a function to check if a linked list is a palindrome.

[[Cracking_The_Coding_Interview_Book.pdf#page=227&selection=184,1,187,63|Cracking_The_Coding_Interview_Book, page 227]]

## Step one Listen
Remember what qualifies a palindrome. The first half must match the second half, and at most only one element can not be the value.

## Step two Example
1010101

## Step three Bruteforce
- Slow and Fast pointer
- Store every slow pointer value in a stack.
- When the fast reaches the end, exit loop.
- While values in stack remain traverse the slow once more.
- If the first value is mismatched, skip.
- If any other values are mismatched return false;
- At the end if stack is empty and slow.next == null return true or false;

## Solution
You were almost there. Here are your mistakes.
1. You didn't consider that fast pointer cannot simply skipped to fast.next.next. In even length linked list this will result in null pointer. 
2. Simply by checking if fast is not null, you can check length is odd or even without calculation of the length. Repeated work yet again.

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        // check for one odd circumstance.
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (stack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
```
