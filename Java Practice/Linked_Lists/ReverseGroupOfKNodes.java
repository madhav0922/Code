package Linked_Lists;

public class ReverseGroupOfKNodes {
    static int a = 1;

    static class LinkedList {
        Node head1, head2;
    }

    static class Node {
        int value;
        Node next = null;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        Node(int value, Node next) {
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

    public static Node reverseList(Node head, int k) {
        Node prev = null, curr = head, nxt;
        int i = 0;
        while (curr != null && i < k) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            i++;
        }
        if (curr != null) {
            head.next = reverseList(curr, k);
        }
        // printList(head);
        return prev;
    }

    public static Node reverseListAlternateK(Node head, int k) {
        Node prev = null, curr = head, nxt;
        int i = 0;
        if (a % 2 != 0) {
            while (curr != null && i < k) {
                nxt = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nxt;
                i++;
            }
        } else {
            prev = curr;
            while (curr != null && i < k) {
                head = curr;
                curr = curr.next;
                i++;
            }
        }
        a++;
        if (curr != null) {
            head.next = reverseListAlternateK(curr, k);
        }
        // printList(head);
        return prev;
    }

    public static Node reverseListAlternateK2(Node head, int k) {
        Node prev = null, curr = head, nxt;
        int i = 0;

        while (curr != null && i < k) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            i++;
        }
        if (head != null) {
            head.next = curr;
        }
        i = 0;
        while (curr != null && i < k - 1) {
            curr = curr.next;
            i++;
        }
        if (curr != null) {
            curr.next = reverseListAlternateK2(curr.next, k);
        }
        // printList(head);
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5,
                new Node(6, new Node(7, new Node(8, new Node(9, null)))))))));

        Node head2 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5,
                new Node(6, new Node(7, new Node(8, new Node(9, null)))))))));

        Node head3 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5,
                new Node(6, new Node(7, new Node(8, new Node(9, null)))))))));

        Node res = reverseList(head, 3);
        printList(res);

        res = reverseListAlternateK(head2, 3);
        printList(res);

        res = reverseListAlternateK2(head3, 3);
        printList(res);

    }
}
