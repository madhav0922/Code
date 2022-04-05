package Linked_Lists;

public class CheckPallindrome {

    static class LinkedList {
        Node head1, head2;
    }

    static class Node {
        String value;
        Node next = null;

        Node(String value) {
            this.value = value;
            this.next = null;
        }

        Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverseList(Node head) {
        // printList(head);
        Node prev = null, curr = head, nxt = head.next;

        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        // // make head next as last node in traversal
        // head.next = prev;
        //
        head = prev;
        // printList(head);
        return head;
    }

    public static boolean compareList(Node head1, Node head2) {
        boolean flag = false;
        while (head1 != null && head2 != null) {
            // System.out.println("head1 " + head1.value + " head2 " + head2.value);
            if (head1.value.equalsIgnoreCase(head2.value)) {
                flag = true;
            } else {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if (head1 == null && head2 == null)
            return true;
        return flag;
    }

    public static void checkPallindrome(Node head) {
        Node sp = head, fp = head, posp = head, second_half, midnode = null;
        while (fp != null && fp.next != null) {
            posp = sp;
            sp = sp.next;
            fp = fp.next.next;
        }
        if (fp != null) {
            midnode = sp;
            sp = sp.next;
        }
        second_half = sp;
        posp.next = null;
        // printList(head);
        // printList(second_half);
        Node rev = reverseList(second_half);
        posp.next = rev;
        // printList(head);
        // printList(rev);
        // System.out.println("rev");
        // printList(rev);
        // ptr1.next = rev;
        // printList(head);
        // printList(ptr2);
        // printList(ptr1.next);
        // printList(head);
        System.out.println(compareList(head, rev) ? "Pallindrome" : "Not Pallindrome");

        rev = reverseList(rev);
        posp.next = rev;
        // printList(head);
        if (midnode != null) {
            posp.next = midnode;
            midnode.next = second_half;
        } else {
            posp.next = second_half;
        }
        printList(head);
    }

    public static void main(String[] args) {
        Node str = new Node("a", new Node("b", new Node("b", new Node("b", new Node("b", new Node("a", null))))));
        Node str2 = new Node("N", new Node("I", new Node("T", new Node("I", new Node("N", null)))));
        checkPallindrome(str);
        checkPallindrome(str2);

    }
}
