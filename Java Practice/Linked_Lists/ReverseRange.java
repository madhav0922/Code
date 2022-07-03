package Linked_Lists;

public class ReverseRange {
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

    public static Node reverseRange(Node head, int m, int n) {
        if (m == n) {
            return head;
        }
        Node h1 = head, poh1 = null;
        int i = 0;
        while (h1 != null && i < m - 1) {
            poh1 = h1;
            h1 = h1.next;
            i++;
        }
        Node prev = null, curr = h1, nxt = null;
        while (curr != null && i < n) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            i++;
        }
        if (m == 1) {
            head = prev;
        } else {
            poh1.next = prev;
        }
        h1.next = curr;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5,
                new Node(6, new Node(7, new Node(8, new Node(9, null)))))))));

        Node res = reverseRange(head, 3, 7);
        printList(res);
    }
}
