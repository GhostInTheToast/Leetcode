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
class InsertGreatestCommonDivisors {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;

        if (curr == null || curr.next == null)
            return head;


        while (curr.next != null) {
            System.out.println("yuh");
            ListNode gcd = new ListNode(euclidGCD(curr.val, curr.next.val));

            ListNode dummy = curr.next;
            curr.next = gcd;
            gcd.next = dummy;
            curr = dummy;
        }
        return head;
    }

    public int euclidGCD(int a, int b) {
        if (b==0) 
            return a;
        return euclidGCD(b, a%b);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
