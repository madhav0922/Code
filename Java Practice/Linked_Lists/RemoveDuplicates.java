package Linked_Lists;

import java.util.*;

public class RemoveDuplicates {
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

    public static Node removeDuplicates(Node head) {
        Node ptr1 = head;
        Node ptr2 = head.next;

        if (head.next == null) {
            return head;
        }

        while (ptr2 != null) {
            if (ptr2.value == ptr1.value) {
                ptr1.next = ptr2.next;
                ptr2 = null;
                ptr2 = ptr1.next;
            } else {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }

        return head;
    }

    public static Node removeUnsortedDuplicates(Node head) {
        Node ptr = head;

        HashSet<Integer> hs = new HashSet<>();

        hs.add(head.value);

        while (ptr.next != null) {
            if (hs.contains(ptr.next.value)) {
                // remove
                ptr.next = ptr.next.next;
            } else {
                ptr = ptr.next;
                hs.add(ptr.value);
            }
        }
        System.out.println(hs);
        return head;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1, new Node(5, new Node(3, new Node(5, new Node(3,
                new Node(3, null))))));
        Node head2 = new Node(1, new Node(2, new Node(3, new Node(4, head1.next.next))));

        printList(head1);
        removeDuplicates(head1);
        printList(head1);
        printList(head2);
        removeUnsortedDuplicates(head1);
        printList(head1);
    }
}
