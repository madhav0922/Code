package Linked_Lists;

public class RotateListByK {
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

    public static Node rotateListByK(Node head, int k) {
        Node h1 = head, second_half, newHead;
        int i = 0;
        while (h1 != null && i < k + 1) {
            h1 = h1.next;
            i++;
        }
        if (h1 == null) {
            return head;
        }
        // printList(h1);
        second_half = h1.next;
        // printList(second_half);
        newHead = second_half;
        h1.next = null;

        while (second_half.next != null) {
            second_half = second_half.next;
        }
        second_half.next = head;
        // printList(newHead);
        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5,
                new Node(6, null))))));

        Node head2 = new Node(1, new Node(2, null));

        Node result = rotateListByK(head, 2);
        printList(result);
    }

}
