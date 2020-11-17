class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

public class Solution {
  public static void main(String args[]) {
    ListNode head = new ListNode(2);
    ListNode l1 = new ListNode(8);
    head.next = l1;
    ListNode l2 = new ListNode(3);
    l1.next = l2;
    ListNode l3 = new ListNode(5);
    l2.next = l3;
    ListNode l4 = new ListNode(10);
    l3.next = l4;
    l4.next = l2;

    // 2->8->3->5->10--
    //       ^        |
    //       |        |
    //       ---------
    System.out.println(new Solution().hasCycle(head));
  }

  public boolean hasCycle(ListNode head) {
    // Initialize ptr1 and ptr2 to head node.
    ListNode ptr1 = head;
    ListNode ptr2 = head;
    // Traverse the Linked List.
    while (ptr2 != null && ptr2.next != null) {
      // Move ptr1 forward by one node.
      ptr1 = ptr1.next;
      // Move ptr2 forward by two nodes.
      ptr2 = ptr2.next.next;
      // Check if ptr1 and ptr2 meets, then there is a loop. Hence return True.
      if (ptr1 == ptr2)
        return true;
    }
    // If ptr2 reaches to None, then there is no loop. Hence return False.
    return false;
  }
}