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

    public static void main(String[] args) {
        Node head = new Node(1, new Node(1, new Node(2, new Node(3, new Node(4,
                new Node(5, null))))));
    }

}
